// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package eu.musesproject.server.rt2ae.client.managed.activity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.Receiver;
import eu.musesproject.server.rt2ae.client.managed.activity.RiskcommunicationEditActivityWrapper.View;
import eu.musesproject.server.rt2ae.client.managed.request.ApplicationRequestFactory;
import eu.musesproject.server.rt2ae.client.managed.ui.RiskcommunicationEditView;
import eu.musesproject.server.rt2ae.client.managed.ui.editor.AccessrequestSetEditor;
import eu.musesproject.server.rt2ae.client.managed.ui.editor.DecisionSetEditor;
import eu.musesproject.server.rt2ae.client.managed.ui.editor.RisktreatmentSetEditor;
import eu.musesproject.server.rt2ae.client.proxy.AccessrequestProxy;
import eu.musesproject.server.rt2ae.client.proxy.DecisionProxy;
import eu.musesproject.server.rt2ae.client.proxy.RiskcommunicationProxy;
import eu.musesproject.server.rt2ae.client.proxy.RisktreatmentProxy;
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

public abstract class RiskcommunicationEditActivityWrapper_Roo_Gwt implements Activity, IsScaffoldMobileActivity {

    protected Activity wrapped;

    protected View<?> view;

    protected ApplicationRequestFactory requests;

    @Override
    public void start(AcceptsOneWidget display, EventBus eventBus) {
        view.setAccessrequestsPickerValues(Collections.<AccessrequestProxy>emptyList());
        requests.accessrequestRequest().findAccessrequestEntries(0, 50).with(eu.musesproject.server.rt2ae.client.managed.ui.renderer.AccessrequestProxyRenderer.instance().getPaths()).fire(new Receiver<List<AccessrequestProxy>>() {

            public void onSuccess(List<AccessrequestProxy> response) {
                List<AccessrequestProxy> values = new ArrayList<AccessrequestProxy>();
                values.add(null);
                values.addAll(response);
                view.setAccessrequestsPickerValues(values);
            }
        });
        view.setDecisionsPickerValues(Collections.<DecisionProxy>emptyList());
        requests.decisionRequest().findDecisionEntries(0, 50).with(eu.musesproject.server.rt2ae.client.managed.ui.renderer.DecisionProxyRenderer.instance().getPaths()).fire(new Receiver<List<DecisionProxy>>() {

            public void onSuccess(List<DecisionProxy> response) {
                List<DecisionProxy> values = new ArrayList<DecisionProxy>();
                values.add(null);
                values.addAll(response);
                view.setDecisionsPickerValues(values);
            }
        });
        view.setRisktreatmentsPickerValues(Collections.<RisktreatmentProxy>emptyList());
        requests.risktreatmentRequest().findRisktreatmentEntries(0, 50).with(eu.musesproject.server.rt2ae.client.managed.ui.renderer.RisktreatmentProxyRenderer.instance().getPaths()).fire(new Receiver<List<RisktreatmentProxy>>() {

            public void onSuccess(List<RisktreatmentProxy> response) {
                List<RisktreatmentProxy> values = new ArrayList<RisktreatmentProxy>();
                values.add(null);
                values.addAll(response);
                view.setRisktreatmentsPickerValues(values);
            }
        });
        wrapped.start(display, eventBus);
    }

    public interface View_Roo_Gwt<V extends eu.musesproject.server.rt2ae.client.managed.ui.RiskcommunicationEditView<V>> extends RiskcommunicationEditView<V> {

        void setAccessrequestsPickerValues(Collection<AccessrequestProxy> values);

        void setDecisionsPickerValues(Collection<DecisionProxy> values);

        void setRisktreatmentsPickerValues(Collection<RisktreatmentProxy> values);
    }
}