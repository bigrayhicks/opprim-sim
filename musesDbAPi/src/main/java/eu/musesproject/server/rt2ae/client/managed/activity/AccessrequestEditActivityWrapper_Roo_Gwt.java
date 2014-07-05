// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package eu.musesproject.server.rt2ae.client.managed.activity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.Receiver;
import eu.musesproject.server.rt2ae.client.managed.activity.AccessrequestEditActivityWrapper.View;
import eu.musesproject.server.rt2ae.client.managed.request.ApplicationRequestFactory;
import eu.musesproject.server.rt2ae.client.managed.ui.AccessrequestEditView;
import eu.musesproject.server.rt2ae.client.managed.ui.editor.AssetSetEditor;
import eu.musesproject.server.rt2ae.client.managed.ui.editor.RiskinformationSetEditor;
import eu.musesproject.server.rt2ae.client.proxy.AccessrequestProxy;
import eu.musesproject.server.rt2ae.client.proxy.AssetProxy;
import eu.musesproject.server.rt2ae.client.proxy.DeviceProxy;
import eu.musesproject.server.rt2ae.client.proxy.OpportunityProxy;
import eu.musesproject.server.rt2ae.client.proxy.RiskcommunicationProxy;
import eu.musesproject.server.rt2ae.client.proxy.RiskinformationProxy;
import eu.musesproject.server.rt2ae.client.proxy.ThreatProxy;
import eu.musesproject.server.rt2ae.client.proxy.UserActionProxy;
import eu.musesproject.server.rt2ae.client.proxy.UserProxy;
import eu.musesproject.server.rt2ae.client.scaffold.activity.IsScaffoldMobileActivity;
import eu.musesproject.server.rt2ae.client.scaffold.place.ProxyEditView;
import eu.musesproject.server.rt2ae.client.scaffold.place.ProxyListPlace;
import eu.musesproject.server.rt2ae.client.scaffold.place.ProxyPlace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public abstract class AccessrequestEditActivityWrapper_Roo_Gwt implements Activity, IsScaffoldMobileActivity {

    protected Activity wrapped;

    protected View<?> view;

    protected ApplicationRequestFactory requests;

    @Override
    public void start(AcceptsOneWidget display, EventBus eventBus) {
        view.setAssetsPickerValues(Collections.<AssetProxy>emptyList());
        requests.assetRequest().findAssetEntries(0, 50).with(eu.musesproject.server.rt2ae.client.managed.ui.renderer.AssetProxyRenderer.instance().getPaths()).fire(new Receiver<List<AssetProxy>>() {

            public void onSuccess(List<AssetProxy> response) {
                List<AssetProxy> values = new ArrayList<AssetProxy>();
                values.add(null);
                values.addAll(response);
                view.setAssetsPickerValues(values);
            }
        });
        view.setRiskinformationsPickerValues(Collections.<RiskinformationProxy>emptyList());
        requests.riskinformationRequest().findRiskinformationEntries(0, 50).with(eu.musesproject.server.rt2ae.client.managed.ui.renderer.RiskinformationProxyRenderer.instance().getPaths()).fire(new Receiver<List<RiskinformationProxy>>() {

            public void onSuccess(List<RiskinformationProxy> response) {
                List<RiskinformationProxy> values = new ArrayList<RiskinformationProxy>();
                values.add(null);
                values.addAll(response);
                view.setRiskinformationsPickerValues(values);
            }
        });
        view.setOpportunityIdPickerValues(Collections.<OpportunityProxy>emptyList());
        requests.opportunityRequest().findOpportunityEntries(0, 50).with(eu.musesproject.server.rt2ae.client.managed.ui.renderer.OpportunityProxyRenderer.instance().getPaths()).fire(new Receiver<List<OpportunityProxy>>() {

            public void onSuccess(List<OpportunityProxy> response) {
                List<OpportunityProxy> values = new ArrayList<OpportunityProxy>();
                values.add(null);
                values.addAll(response);
                view.setOpportunityIdPickerValues(values);
            }
        });
        view.setDeviceIdPickerValues(Collections.<DeviceProxy>emptyList());
        requests.deviceRequest().findDeviceEntries(0, 50).with(eu.musesproject.server.rt2ae.client.managed.ui.renderer.DeviceProxyRenderer.instance().getPaths()).fire(new Receiver<List<DeviceProxy>>() {

            public void onSuccess(List<DeviceProxy> response) {
                List<DeviceProxy> values = new ArrayList<DeviceProxy>();
                values.add(null);
                values.addAll(response);
                view.setDeviceIdPickerValues(values);
            }
        });
        view.setUserIdPickerValues(Collections.<UserProxy>emptyList());
        requests.userRequest().findUserEntries(0, 50).with(eu.musesproject.server.rt2ae.client.managed.ui.renderer.UserProxyRenderer.instance().getPaths()).fire(new Receiver<List<UserProxy>>() {

            public void onSuccess(List<UserProxy> response) {
                List<UserProxy> values = new ArrayList<UserProxy>();
                values.add(null);
                values.addAll(response);
                view.setUserIdPickerValues(values);
            }
        });
        view.setRiskcommunicationidPickerValues(Collections.<RiskcommunicationProxy>emptyList());
        requests.riskcommunicationRequest().findRiskcommunicationEntries(0, 50).with(eu.musesproject.server.rt2ae.client.managed.ui.renderer.RiskcommunicationProxyRenderer.instance().getPaths()).fire(new Receiver<List<RiskcommunicationProxy>>() {

            public void onSuccess(List<RiskcommunicationProxy> response) {
                List<RiskcommunicationProxy> values = new ArrayList<RiskcommunicationProxy>();
                values.add(null);
                values.addAll(response);
                view.setRiskcommunicationidPickerValues(values);
            }
        });
        view.setThreatidPickerValues(Collections.<ThreatProxy>emptyList());
        requests.threatRequest().findThreatEntries(0, 50).with(eu.musesproject.server.rt2ae.client.managed.ui.renderer.ThreatProxyRenderer.instance().getPaths()).fire(new Receiver<List<ThreatProxy>>() {

            public void onSuccess(List<ThreatProxy> response) {
                List<ThreatProxy> values = new ArrayList<ThreatProxy>();
                values.add(null);
                values.addAll(response);
                view.setThreatidPickerValues(values);
            }
        });
        view.setUseractionIdPickerValues(Collections.<UserActionProxy>emptyList());
        requests.userActionRequest().findUserActionEntries(0, 50).with(eu.musesproject.server.rt2ae.client.managed.ui.renderer.UserActionProxyRenderer.instance().getPaths()).fire(new Receiver<List<UserActionProxy>>() {

            public void onSuccess(List<UserActionProxy> response) {
                List<UserActionProxy> values = new ArrayList<UserActionProxy>();
                values.add(null);
                values.addAll(response);
                view.setUseractionIdPickerValues(values);
            }
        });
        wrapped.start(display, eventBus);
    }

    public interface View_Roo_Gwt<V extends eu.musesproject.server.rt2ae.client.managed.ui.AccessrequestEditView<V>> extends AccessrequestEditView<V> {

        void setAssetsPickerValues(Collection<AssetProxy> values);

        void setRiskinformationsPickerValues(Collection<RiskinformationProxy> values);

        void setOpportunityIdPickerValues(Collection<OpportunityProxy> values);

        void setDeviceIdPickerValues(Collection<DeviceProxy> values);

        void setUserIdPickerValues(Collection<UserProxy> values);

        void setRiskcommunicationidPickerValues(Collection<RiskcommunicationProxy> values);

        void setThreatidPickerValues(Collection<ThreatProxy> values);

        void setUseractionIdPickerValues(Collection<UserActionProxy> values);
    }
}
