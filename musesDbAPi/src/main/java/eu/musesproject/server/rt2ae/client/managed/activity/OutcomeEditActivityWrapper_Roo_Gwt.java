// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package eu.musesproject.server.rt2ae.client.managed.activity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.Receiver;
import eu.musesproject.server.rt2ae.client.managed.activity.OutcomeEditActivityWrapper.View;
import eu.musesproject.server.rt2ae.client.managed.request.ApplicationRequestFactory;
import eu.musesproject.server.rt2ae.client.managed.ui.OutcomeEditView;
import eu.musesproject.server.rt2ae.client.proxy.OpportunityProxy;
import eu.musesproject.server.rt2ae.client.proxy.OutcomeProxy;
import eu.musesproject.server.rt2ae.client.proxy.ThreatProxy;
import eu.musesproject.server.rt2ae.client.scaffold.activity.IsScaffoldMobileActivity;
import eu.musesproject.server.rt2ae.client.scaffold.place.ProxyEditView;
import eu.musesproject.server.rt2ae.client.scaffold.place.ProxyListPlace;
import eu.musesproject.server.rt2ae.client.scaffold.place.ProxyPlace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class OutcomeEditActivityWrapper_Roo_Gwt implements Activity, IsScaffoldMobileActivity {

    protected Activity wrapped;

    protected View<?> view;

    protected ApplicationRequestFactory requests;

    @Override
    public void start(AcceptsOneWidget display, EventBus eventBus) {
        view.setOpportunityIdPickerValues(Collections.<OpportunityProxy>emptyList());
        requests.opportunityRequest().findOpportunityEntries(0, 50).with(eu.musesproject.server.rt2ae.client.managed.ui.renderer.OpportunityProxyRenderer.instance().getPaths()).fire(new Receiver<List<OpportunityProxy>>() {

            public void onSuccess(List<OpportunityProxy> response) {
                List<OpportunityProxy> values = new ArrayList<OpportunityProxy>();
                values.add(null);
                values.addAll(response);
                view.setOpportunityIdPickerValues(values);
            }
        });
        view.setThreatIdPickerValues(Collections.<ThreatProxy>emptyList());
        requests.threatRequest().findThreatEntries(0, 50).with(eu.musesproject.server.rt2ae.client.managed.ui.renderer.ThreatProxyRenderer.instance().getPaths()).fire(new Receiver<List<ThreatProxy>>() {

            public void onSuccess(List<ThreatProxy> response) {
                List<ThreatProxy> values = new ArrayList<ThreatProxy>();
                values.add(null);
                values.addAll(response);
                view.setThreatIdPickerValues(values);
            }
        });
        wrapped.start(display, eventBus);
    }

    public interface View_Roo_Gwt<V extends eu.musesproject.server.rt2ae.client.managed.ui.OutcomeEditView<V>> extends OutcomeEditView<V> {

        void setOpportunityIdPickerValues(Collection<OpportunityProxy> values);

        void setThreatIdPickerValues(Collection<ThreatProxy> values);
    }
}
