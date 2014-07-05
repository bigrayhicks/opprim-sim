// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package eu.musesproject.server.rt2ae.client.managed.activity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import eu.musesproject.server.rt2ae.client.managed.request.ApplicationRequestFactory;
import eu.musesproject.server.rt2ae.client.managed.ui.desktop.RisktreatmentDesktopDetailsView;
import eu.musesproject.server.rt2ae.client.managed.ui.desktop.RisktreatmentDesktopEditView;
import eu.musesproject.server.rt2ae.client.managed.ui.desktop.RisktreatmentDesktopListView;
import eu.musesproject.server.rt2ae.client.managed.ui.mobile.RisktreatmentMobileDetailsView;
import eu.musesproject.server.rt2ae.client.managed.ui.mobile.RisktreatmentMobileEditView;
import eu.musesproject.server.rt2ae.client.proxy.RiskcommunicationProxy;
import eu.musesproject.server.rt2ae.client.proxy.RisktreatmentProxy;
import eu.musesproject.server.rt2ae.client.request.RisktreatmentRequest;
import eu.musesproject.server.rt2ae.client.scaffold.ScaffoldApp;
import eu.musesproject.server.rt2ae.client.scaffold.place.ProxyPlace;

public abstract class RisktreatmentActivitiesMapper_Roo_Gwt {

    protected ApplicationRequestFactory factory;

    protected PlaceController placeController;

    protected Activity makeCreateActivity() {
        RisktreatmentDesktopEditView.instance().setCreating(true);
        Activity activity = new RisktreatmentEditActivity(null, factory, ScaffoldApp.isMobile() ? RisktreatmentMobileEditView.instance() : RisktreatmentDesktopEditView.instance(), placeController);
        return new RisktreatmentEditActivityWrapper(factory, ScaffoldApp.isMobile() ? RisktreatmentMobileEditView.instance() : RisktreatmentDesktopEditView.instance(), activity, null);
    }

    @SuppressWarnings("unchecked")
    protected EntityProxyId<RisktreatmentProxy> coerceId(ProxyPlace place) {
        return (EntityProxyId<RisktreatmentProxy>) place.getProxyId();
    }

    protected Activity makeEditActivity(ProxyPlace place) {
        RisktreatmentDesktopEditView.instance().setCreating(false);
        EntityProxyId<RisktreatmentProxy> proxyId = coerceId(place);
        Activity activity = new RisktreatmentEditActivity(proxyId, factory, ScaffoldApp.isMobile() ? RisktreatmentMobileEditView.instance() : RisktreatmentDesktopEditView.instance(), placeController);
        return new RisktreatmentEditActivityWrapper(factory, ScaffoldApp.isMobile() ? RisktreatmentMobileEditView.instance() : RisktreatmentDesktopEditView.instance(), activity, proxyId);
    }
}
