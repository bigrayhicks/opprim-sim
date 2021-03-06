/*
 * Copyright
 * Jean-Marc Seigneur, Carlos Ballester Lafuente, Xavier Titi
 * University of Geneva
 * 2013 /2014
 *
 */
package eu.muses.sim.test;

import java.util.Collection;

import eu.muses.sim.Outcome;
import eu.muses.sim.RealTimeRiskTrustAnalysisEngine;
import eu.muses.sim.context.location.PublicAccessPoint;
import eu.muses.sim.corporate.Corporation;
import eu.muses.sim.decision.Decision;
import eu.muses.sim.request.AccessRequest;
import eu.muses.sim.riskman.PersonalUserDevice;
import eu.muses.sim.riskman.Probability;
import eu.muses.sim.riskman.RiskPolicy;
import eu.muses.sim.riskman.SecurityIncident;
import eu.muses.sim.riskman.asset.Asset;
import eu.muses.sim.riskman.asset.CorporateAsset;
import eu.muses.sim.riskman.asset.UserDevice;
import eu.muses.sim.riskman.opportunity.Opportunity;
import eu.muses.sim.trustman.TrustValue;
import eu.muses.wp5.EventProcessor;

public class TestMuses {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		SimUser alice = new SimUser("alice", 120, new TrustValue(0.5));
		PublicAccessPoint genevaAirportGateAPublicWiFi = new PublicAccessPoint(
				"genevaAirportGateAPublicWiFiAP", 0.0, 0.0);
		PublicAccessPoint genevaAirportSecuredCorporateLoungeWiFi = new PublicAccessPoint(
				"genevaAirportSecureCorporateLoungeWiFiAP", 0.0, 0.0);
		UserDevice aliceLaptop = new PersonalUserDevice();
		alice.movesTo(genevaAirportGateAPublicWiFi);
		Corporation s2 = new Corporation();
		EventProcessor eventCorrelatorS2 = new EventProcessor();
		RealTimeRiskTrustAnalysisEngine s2Rt2ae = new RealTimeRiskTrustAnalysisEngine(
				eventCorrelatorS2, RiskPolicy.TAKE_NO_RISK);
		s2.installs(s2Rt2ae);
		new RealTimeRiskTrustAnalysisEngine(eventCorrelatorS2,
				RiskPolicy.TAKE_NO_RISK);
		MusesClientApp aliceClientApp = new MusesClientApp();
		aliceLaptop.installs(aliceClientApp);
		CorporateAsset newPatentProposal = new CorporateAsset(
				"newPatentProposal", s2, 800000);
		new CorporateAsset("publicMarketingPoster", s2, 0);
		new CorporateAsset("docsFor150kEurosBid", s2, 150000);
		Collection<Outcome> outcomesOpportunity = null;
		Opportunity aliceMustSubmitThe150000BidNow = new Opportunity(
				"Alice must access documents for a 150 000 kEuros bid to win a new project to submit it now or it will be too late because the deadline will have passed",
				new Probability(), outcomesOpportunity);
		new Opportunity(
				"Alice has one hour to work on a marketing poster at an airport that will be public with public material otherwise one hour of her working time will be lost",
				new Probability(), outcomesOpportunity);
		Collection<Asset> corporateAssets = null;// ;{docsFor150kEurosBid};
		AccessRequest accessRequest = alice
				.requestsAccessToAssetsForOpportunity(corporateAssets,
						aliceMustSubmitThe150000BidNow,
						genevaAirportGateAPublicWiFi, aliceLaptop); // aliceLaptop
																	// is for
																	// example
																	// inferred
																	// by the
																	// sensed
																	// MUSES WP6
																	// context
																	// observation
																	// and their
																	// events
																	// correlation
																	// with
																	// MUSES WP5
		s2.computeCorporateAccessRequestOpportunity(accessRequest); // it is
																	// computed
																	// by the
																	// MUSES WP5
																	// event
																	// correlator
		s2.computeCorporateAccessRequestThreats(accessRequest); // it is
																// computed by
																// the MUSES WP5
																// event
																// correlator
		s2.computeCorporateAccessRequestRisk(accessRequest); // it is computed
																// by the MUSES
																// WP3 RT2AE
		s2.computeCorporateAccessRequestTrust(accessRequest); // it is computed
																// by the MUSES
																// WP3 RT2AE
		s2.generateCorporateAccessRequestRiskTreatmentsAndTrustRiskCommunication(accessRequest); // it
																									// is
																									// computed
																									// by
																									// the
																									// MUSES
																									// WP3
																									// RT2AE
		s2.computeCorporateAccessRequestDecision(accessRequest); // Uses threats
																	// evidence
																	// computed
																	// by the
																	// MUSES WP5
																	// event
																	// correlator
																	// as well
																	// as
																	// security
																	// policies
																	// administered
																	// by the
																	// MUSES WP5
																	// event
																	// correlator
																	// but
																	// the final
																	// decision
																	// is
																	// generated
																	// by the
																	// MUSES WP3
																	// RT2AE
		if (!accessRequest.getCorporateAccessRequestDecision().equals(
				Decision.MAYBE_ACCESS)) {
			alice.readsAccessRiskCommunicationIncludingPotentialRiskTreatments(accessRequest
					.getAccessRiskCommunication()); // including some potential
													// other behaviours, risk
													// treatments that
													// would allow the user to
													// access the asset with
													// less risk, such as
													// going to a company lounge
													// with secure WiFi
			if (alice.decidesAccessingAssetInSpiteOfRisk(accessRequest)) {
				Asset[] usedCorporateAssets = alice
						.getCorporateAssets(accessRequest);
				s2.logsAccessRequestUserDecisionInMusesCompanyInstance();
				alice.usesCorporateAssets(usedCorporateAssets);
				s2.logsBeneficialOutcomeBasedOnTheAchievedOpportunity(accessRequest);
			} else {
				if (alice.decidesToApplyAProposedRiskTreatment(accessRequest)) {
					alice.movesTo(genevaAirportSecuredCorporateLoungeWiFi); // this
																			// risk
																			// treatment
																			// allows
																			// her
																			// to
																			// access
																			// the
																			// asset
					Asset[] usedCorporateAssets = alice
							.getCorporateAssets(accessRequest);
					alice.usesCorporateAssets(usedCorporateAssets);
					s2.logsBeneficialOutcomeBasedOnTheAchievedOpportunity(accessRequest);
				} else {
					s2.logsAccessRequestUserDecisionInMusesCompanyInstance(); // It
																				// may
																				// be
																				// important
																				// to
																				// also
																				// log
																				// when
																				// a
																				// user
																				// decides
																				// not
																				// taking
																				// the
																				// opportunity
																				// due
																				// to
																				// risk,
																				// e.g.,
																				// to
																				// avoid
																				// never
																				// taking
																				// opportunities
																				// even
																				// when
																				// there
																				// is
																				// no
																				// risk
																				// due
																				// to
																				// laziness
																				// or
																				// risk
																				// aversion...
				}
			}
		} else {
			alice.readsAccessDenialDecisionReasons(accessRequest
					.getDenialDecisionReasons());
		}
		// Much later assuming there is a security incident on the asset
		Outcome securityIncidentOnPatent = new SecurityIncident(
				"New patent proposal comprised", newPatentProposal.getValue()); // the
																				// MUSES
																				// WP5
																				// event
																				// correlator
																				// would
																				// detect
																				// this
																				// incident
		s2.reportsSecurityIncident(securityIncidentOnPatent);
		if (s2.seemsUserInvolvedInSecurityIncident(alice) > 0.8) {
			s2.warnsUserResponsibleForSecurityIncident(alice,
					securityIncidentOnPatent);
			s2.decreasesTrustInUser(alice, securityIncidentOnPatent);
		}
	}

}
