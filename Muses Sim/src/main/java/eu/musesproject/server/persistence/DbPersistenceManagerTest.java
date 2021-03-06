package eu.musesproject.server.persistence;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import eu.muses.sim.Outcome;
import eu.muses.sim.request.AccessRequest;
import eu.muses.sim.riskman.Probability;
import eu.muses.sim.riskman.RiskPolicy;
import eu.muses.sim.riskman.RiskValue;
import eu.muses.sim.riskman.asset.Asset;
import eu.muses.sim.riskman.threat.Threat;
import eu.muses.sim.test.SimUser;
import eu.muses.sim.trustman.TrustValue;
import eu.muses.wp5.Clue;
import eu.muses.wp5.CluesThreatEntry;
import eu.muses.wp5.CluesThreatTable;

public class DbPersistenceManagerTest {
	
	static DbPersistenceManager dbmanager = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dbmanager = new DbPersistenceManager();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		 
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetOutcomes() {
		List<Outcome> List = dbmanager.getOutcomes();
		if (List.size()>0){
			Iterator<Outcome> i = List.iterator();
			while(i.hasNext()){
				Outcome outcome = i.next();
				assertNotNull(outcome);
			}
		}else{
			fail("There is not any outcome in the database,please first try to store outcome in the database");

		}
	}

	@Test
	public final void testSetOutcomes() {
		List<Outcome> list = new ArrayList<Outcome>();
		Outcome outcome = new Outcome();
		outcome.setCostBenefit(222.0);
		outcome.setDescription("outcometest");
		list.add(outcome);
		dbmanager.setOutcomes(list);	
	
		Iterator<Outcome> it = dbmanager.getOutcomes().iterator();
		boolean ok = false;
		while(it.hasNext() && !ok){
			Outcome o = it.next();
			if(o.getDescription().equalsIgnoreCase(outcome.getDescription()))
				ok = true;
		}
		assertTrue(ok);
	}

	@Test/*not used yet for the simulation*/
	public final void testGetOpportunities() {
		assertTrue(true);		
	}

	@Test /*not used yet for the simulation*/
	public final void testSetOpportunities() {
		assertTrue(true);
	}

	@Test
	public final void testGetAssets() {
		List<Asset> List = dbmanager.getAssets();
		if (List.size()>0){
			Iterator<Asset> i = List.iterator();
			while(i.hasNext()){
				Asset asset = i.next();
				assertNotNull(asset);
			}
		}else{
			fail("There is not any Asset in the database,please first try to store Asset in the database");
		}		
	}

	@Test
	public final void testSetAssets() {
		List<Asset> list = new ArrayList<Asset>();
		Asset asset1 = new Asset("assettestone",8888);
		list.add(asset1);
		dbmanager.setAssets(list);	
		
		List<eu.musesproject.server.rt2ae.Asset> l = eu.musesproject.server.rt2ae.Asset.findAssetbyName(asset1.getAssetName());
		if(l.size()>0)
			assertTrue(true);
		else
			fail("The Asset was not inserted in the database");

	}

	@Test
	public final void testGetThreats() {
		List<Threat> list = dbmanager.getThreats();
		if(list.size()>0){
			Iterator<Threat> i = list.iterator();
			while(i.hasNext()){
				Threat threat = i.next();
				assertNotNull(threat);
				if(threat.getOutcomes().size()>0){
					Iterator<Outcome> it = threat.getOutcomes().iterator();
					while(it.hasNext()){
						Outcome outcome = it.next();
						assertNotNull(outcome);

					}	
				}else{
					fail("There is not one or several Threat with no  Outcome in the database ,please first try to store threat with Oucome  in the database");
				}
			}
		}
		else{
			fail("There is not a Threat with no  Outcome in the database ,please first try to store threat with Oucome  in the database");
		}		
	}
			

	@Test
	public final void testSetThreats() {
		Threat t = new Threat ();
		Probability probability = new Probability();
		probability.setProb(0.2);
		t.setProbability(probability);
		t.setDescription("threattest");
				
		List<Threat> l1 = new ArrayList<Threat>();
		l1.add(t);
		
		dbmanager.setThreats(l1);
		
		List<eu.musesproject.server.rt2ae.Threat> l = eu.musesproject.server.rt2ae.Threat.findThreatbyDescription(t.getDescription());
		
		if(l.size()>0)
			assertTrue(true);
		else
			fail("The Threat was not inserted in the database");
						
	}

	@Test
	public final void testGetClues() {
		List<Clue> List = dbmanager.getClues();
		if (List.size()>0){
			Iterator<Clue> i = List.iterator();
			while(i.hasNext()){
				Clue clue = i.next();
				assertNotNull(clue);
			}
		}else{
			fail("There is not any Clue in the database,please first try to store Clue in the database");
		}			
	}

	@Test
	public final void testSetClues() {
		List<Clue> list = new ArrayList<Clue>();
		Clue clue = new Clue ();
		clue.setId("testone");
		list.add(clue);
		dbmanager.setClues(list);
		
		Iterator<Clue> it = dbmanager.getClues().iterator();
		boolean ok = false;
		while(it.hasNext()&& !ok){
			Clue c = it.next();
			if(c.getId().equalsIgnoreCase(clue.getId()))
				ok = true;
		}
		assertTrue(ok);
	}

	@Test
	public final void testGetRiskPolicies() {
		List<RiskPolicy> List = dbmanager.getRiskPolicies();
		if (List.size()>0){
			Iterator<RiskPolicy> i = List.iterator();
			while(i.hasNext()){
				RiskPolicy riskpolicy = i.next();
				assertNotNull(riskpolicy);
			}
		}else{
			fail("There is not any RiskPolicy in the database,please first try to store RiskPolicy in the database");
		}	
	}

	@Test
	public final void testSetRiskPolicies() {
		List<RiskPolicy> list = new ArrayList<RiskPolicy>();
		RiskValue noRisk = new RiskValue(0, "norisk");
		RiskPolicy riskpolicy = new RiskPolicy(noRisk, null);
		list.add(riskpolicy);
		dbmanager.setRiskPolicies(list);
		
		Iterator<RiskPolicy> it = dbmanager.getRiskPolicies().iterator();
		boolean ok = false;
		while(it.hasNext()&& !ok){
			RiskPolicy r = it.next();
			if(r.getRiskValue().getDescription().equalsIgnoreCase(riskpolicy.getRiskValue().getDescription()))
				ok = true;
		}
		assertTrue(ok);
	}

	@Test
	public final void testGetSimUsers() {
		List<eu.muses.sim.test.SimUser> List = dbmanager.getSimUsers();
		if (List.size()>0){
			Iterator<SimUser> i = List.iterator();
			while(i.hasNext()){
				SimUser simuser = i.next();
				assertNotNull(simuser);
			}
		}else{
			fail("There is not any SimUser in the database,please first try to store SimUser in the database");
		}
	}

	@Test
	public final void testSetSimUsers() {
		List<SimUser> list = new ArrayList<SimUser>();
		TrustValue trustvalue = new TrustValue();
		trustvalue.setValue(0.5);
		SimUser simuser = new SimUser ("usertestone", 0, trustvalue);
		list.add(simuser);
		dbmanager.setSimUsers(list);
		
		List<eu.musesproject.server.rt2ae.User> l = eu.musesproject.server.rt2ae.User.findOneUsers(simuser.getNickname());
		
			if(l.size()>0)
				assertTrue(true);
			else
				fail("The User was not inserted in the database");
	}
		


	@Test /*not used anymore*/
	public final void testGetCluesThreatTable() {
		CluesThreatTable cluesthreattable = dbmanager.getCluesThreatTable();
		if(cluesthreattable!=null){
			Iterator<CluesThreatEntry> i = cluesthreattable.getCluesThreatTable().iterator();
			while(i.hasNext()){
				CluesThreatEntry cluesthreatentry = i.next();
				Threat threat = cluesthreatentry.getThreat();
				assertNotNull(threat);
				if(threat.getOutcomes().size()>0){
					Iterator<Outcome> its = threat.getOutcomes().iterator();
					while(its.hasNext()){
						Outcome outcome = its.next();
						assertNotNull(outcome);
					}
				}else{
					fail("Size of list of Outcome is equal to 0 "); 
				}	
			}
		}
		else{
			fail("Threat is null"); 

		}
		
	}

	@Test/*not used anymore*/
	public final void testSetCluesThreatTable() {
		assertTrue(true);
	}

	@Test
	public final void testGetAccessRequests() {
		List<AccessRequest> list = dbmanager.getAccessRequests();
		
		if(list.size()>0){
			Iterator<AccessRequest> i = list.iterator();
			while(i.hasNext()){
				AccessRequest accessrequests = i.next();
				assertNotNull(accessrequests.getUser());
				assertNotNull(accessrequests.getTime());
				assertNotNull(accessrequests.getUserAction());
				assertNotNull(accessrequests.getCluesThreatEntry().getThreat());
				
				Iterator<Outcome> its = accessrequests.getOpportunityDescriptor().getOutcomes().iterator();
				while(its.hasNext()){
					Outcome outcome = its.next();
					//assertNotNull(outcome);
				}
				
				Iterator<Asset> ist = accessrequests.getOpportunityDescriptor().getRequestedAssets().iterator();
				while(ist.hasNext()){	
					Asset asset = ist.next();
					assertNotNull(asset);
				}
				
				Iterator<Outcome> ists = accessrequests.getCluesThreatEntry().getThreat().getOutcomes().iterator();
				while(ists.hasNext()){
					Outcome outcome = ists.next();
					assertNotNull(outcome);
				}
				
				Iterator<Clue> sit = accessrequests.getCluesThreatEntry().getClues().iterator();
				while(sit.hasNext()){
					Clue clue = sit.next();
					assertNotNull(clue);
				}
				
			}
		}else{
			fail("there is not any AccessRequest in the database"); // TODO

		}
			
	}

	@Test
	public final void testSetAccessRequests() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testAnonymizeAccessReqeuests() {
		fail("Not yet implemented"); // TODO
	}

}
