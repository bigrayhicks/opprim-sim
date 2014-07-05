// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package eu.musesproject.server.rt2ae.client.managed.activity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import eu.musesproject.server.rt2ae.client.managed.request.ApplicationEntityTypesProcessor;
import eu.musesproject.server.rt2ae.client.managed.request.ApplicationRequestFactory;
import eu.musesproject.server.rt2ae.client.managed.ui.desktop.AccessrequestDesktopListView;
import eu.musesproject.server.rt2ae.client.managed.ui.desktop.AssetDesktopListView;
import eu.musesproject.server.rt2ae.client.managed.ui.desktop.ClueDesktopListView;
import eu.musesproject.server.rt2ae.client.managed.ui.desktop.DecisionDesktopListView;
import eu.musesproject.server.rt2ae.client.managed.ui.desktop.DeviceDesktopListView;
import eu.musesproject.server.rt2ae.client.managed.ui.desktop.DeviceSecurityStateDesktopListView;
import eu.musesproject.server.rt2ae.client.managed.ui.desktop.OpportunityDesktopListView;
import eu.musesproject.server.rt2ae.client.managed.ui.desktop.OutcomeDesktopListView;
import eu.musesproject.server.rt2ae.client.managed.ui.desktop.RiskPolicyDesktopListView;
import eu.musesproject.server.rt2ae.client.managed.ui.desktop.RiskcommunicationDesktopListView;
import eu.musesproject.server.rt2ae.client.managed.ui.desktop.RiskinformationDesktopListView;
import eu.musesproject.server.rt2ae.client.managed.ui.desktop.RisktreatmentDesktopListView;
import eu.musesproject.server.rt2ae.client.managed.ui.desktop.SecurityIncidentDesktopListView;
import eu.musesproject.server.rt2ae.client.managed.ui.desktop.ThreatDesktopListView;
import eu.musesproject.server.rt2ae.client.managed.ui.desktop.UserActionDesktopListView;
import eu.musesproject.server.rt2ae.client.managed.ui.desktop.UserDesktopListView;
import eu.musesproject.server.rt2ae.client.managed.ui.mobile.AccessrequestMobileListView;
import eu.musesproject.server.rt2ae.client.managed.ui.mobile.AssetMobileListView;
import eu.musesproject.server.rt2ae.client.managed.ui.mobile.ClueMobileListView;
import eu.musesproject.server.rt2ae.client.managed.ui.mobile.DecisionMobileListView;
import eu.musesproject.server.rt2ae.client.managed.ui.mobile.DeviceMobileListView;
import eu.musesproject.server.rt2ae.client.managed.ui.mobile.DeviceSecurityStateMobileListView;
import eu.musesproject.server.rt2ae.client.managed.ui.mobile.OpportunityMobileListView;
import eu.musesproject.server.rt2ae.client.managed.ui.mobile.OutcomeMobileListView;
import eu.musesproject.server.rt2ae.client.managed.ui.mobile.RiskPolicyMobileListView;
import eu.musesproject.server.rt2ae.client.managed.ui.mobile.RiskcommunicationMobileListView;
import eu.musesproject.server.rt2ae.client.managed.ui.mobile.RiskinformationMobileListView;
import eu.musesproject.server.rt2ae.client.managed.ui.mobile.RisktreatmentMobileListView;
import eu.musesproject.server.rt2ae.client.managed.ui.mobile.SecurityIncidentMobileListView;
import eu.musesproject.server.rt2ae.client.managed.ui.mobile.ThreatMobileListView;
import eu.musesproject.server.rt2ae.client.managed.ui.mobile.UserActionMobileListView;
import eu.musesproject.server.rt2ae.client.managed.ui.mobile.UserMobileListView;
import eu.musesproject.server.rt2ae.client.proxy.AccessrequestProxy;
import eu.musesproject.server.rt2ae.client.proxy.AssetProxy;
import eu.musesproject.server.rt2ae.client.proxy.ClueProxy;
import eu.musesproject.server.rt2ae.client.proxy.DecisionProxy;
import eu.musesproject.server.rt2ae.client.proxy.DeviceProxy;
import eu.musesproject.server.rt2ae.client.proxy.DeviceSecurityStateProxy;
import eu.musesproject.server.rt2ae.client.proxy.OpportunityProxy;
import eu.musesproject.server.rt2ae.client.proxy.OutcomeProxy;
import eu.musesproject.server.rt2ae.client.proxy.RiskPolicyProxy;
import eu.musesproject.server.rt2ae.client.proxy.RiskcommunicationProxy;
import eu.musesproject.server.rt2ae.client.proxy.RiskinformationProxy;
import eu.musesproject.server.rt2ae.client.proxy.RisktreatmentProxy;
import eu.musesproject.server.rt2ae.client.proxy.SecurityIncidentProxy;
import eu.musesproject.server.rt2ae.client.proxy.ThreatProxy;
import eu.musesproject.server.rt2ae.client.proxy.UserActionProxy;
import eu.musesproject.server.rt2ae.client.proxy.UserProxy;
import eu.musesproject.server.rt2ae.client.scaffold.ScaffoldApp;
import eu.musesproject.server.rt2ae.client.scaffold.place.ProxyListPlace;

public abstract class ApplicationMasterActivities_Roo_Gwt implements ActivityMapper {

    protected ApplicationRequestFactory requests;

    protected PlaceController placeController;

    public Activity getActivity(Place place) {
        if (!(place instanceof ProxyListPlace)) {
            return null;
        }
        ProxyListPlace listPlace = (ProxyListPlace) place;
        return new ApplicationEntityTypesProcessor<Activity>() {

            @Override
            public void handleAccessrequest(AccessrequestProxy isNull) {
                setResult(new AccessrequestListActivity(requests, ScaffoldApp.isMobile() ? AccessrequestMobileListView.instance() : AccessrequestDesktopListView.instance(), placeController));
            }

            @Override
            public void handleAsset(AssetProxy isNull) {
                setResult(new AssetListActivity(requests, ScaffoldApp.isMobile() ? AssetMobileListView.instance() : AssetDesktopListView.instance(), placeController));
            }

            @Override
            public void handleClue(ClueProxy isNull) {
                setResult(new ClueListActivity(requests, ScaffoldApp.isMobile() ? ClueMobileListView.instance() : ClueDesktopListView.instance(), placeController));
            }

            @Override
            public void handleDecision(DecisionProxy isNull) {
                setResult(new DecisionListActivity(requests, ScaffoldApp.isMobile() ? DecisionMobileListView.instance() : DecisionDesktopListView.instance(), placeController));
            }

            @Override
            public void handleDevice(DeviceProxy isNull) {
                setResult(new DeviceListActivity(requests, ScaffoldApp.isMobile() ? DeviceMobileListView.instance() : DeviceDesktopListView.instance(), placeController));
            }

            @Override
            public void handleDeviceSecurityState(DeviceSecurityStateProxy isNull) {
                setResult(new DeviceSecurityStateListActivity(requests, ScaffoldApp.isMobile() ? DeviceSecurityStateMobileListView.instance() : DeviceSecurityStateDesktopListView.instance(), placeController));
            }

            @Override
            public void handleOpportunity(OpportunityProxy isNull) {
                setResult(new OpportunityListActivity(requests, ScaffoldApp.isMobile() ? OpportunityMobileListView.instance() : OpportunityDesktopListView.instance(), placeController));
            }

            @Override
            public void handleOutcome(OutcomeProxy isNull) {
                setResult(new OutcomeListActivity(requests, ScaffoldApp.isMobile() ? OutcomeMobileListView.instance() : OutcomeDesktopListView.instance(), placeController));
            }

            @Override
            public void handleRiskPolicy(RiskPolicyProxy isNull) {
                setResult(new RiskPolicyListActivity(requests, ScaffoldApp.isMobile() ? RiskPolicyMobileListView.instance() : RiskPolicyDesktopListView.instance(), placeController));
            }

            @Override
            public void handleRiskcommunication(RiskcommunicationProxy isNull) {
                setResult(new RiskcommunicationListActivity(requests, ScaffoldApp.isMobile() ? RiskcommunicationMobileListView.instance() : RiskcommunicationDesktopListView.instance(), placeController));
            }

            @Override
            public void handleRiskinformation(RiskinformationProxy isNull) {
                setResult(new RiskinformationListActivity(requests, ScaffoldApp.isMobile() ? RiskinformationMobileListView.instance() : RiskinformationDesktopListView.instance(), placeController));
            }

            @Override
            public void handleRisktreatment(RisktreatmentProxy isNull) {
                setResult(new RisktreatmentListActivity(requests, ScaffoldApp.isMobile() ? RisktreatmentMobileListView.instance() : RisktreatmentDesktopListView.instance(), placeController));
            }

            @Override
            public void handleSecurityIncident(SecurityIncidentProxy isNull) {
                setResult(new SecurityIncidentListActivity(requests, ScaffoldApp.isMobile() ? SecurityIncidentMobileListView.instance() : SecurityIncidentDesktopListView.instance(), placeController));
            }

            @Override
            public void handleThreat(ThreatProxy isNull) {
                setResult(new ThreatListActivity(requests, ScaffoldApp.isMobile() ? ThreatMobileListView.instance() : ThreatDesktopListView.instance(), placeController));
            }

            @Override
            public void handleUserAction(UserActionProxy isNull) {
                setResult(new UserActionListActivity(requests, ScaffoldApp.isMobile() ? UserActionMobileListView.instance() : UserActionDesktopListView.instance(), placeController));
            }

            @Override
            public void handleUser(UserProxy isNull) {
                setResult(new UserListActivity(requests, ScaffoldApp.isMobile() ? UserMobileListView.instance() : UserDesktopListView.instance(), placeController));
            }
        }.process(listPlace.getProxyClass());
    }
}
