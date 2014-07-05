// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package eu.musesproject.server.rt2ae.client.managed.ui.desktop;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import eu.musesproject.server.rt2ae.client.managed.ui.SecurityIncidentDetailsView;
import eu.musesproject.server.rt2ae.client.proxy.AssetProxy;
import eu.musesproject.server.rt2ae.client.proxy.DeviceProxy;
import eu.musesproject.server.rt2ae.client.proxy.SecurityIncidentProxy;
import eu.musesproject.server.rt2ae.client.proxy.UserProxy;
import eu.musesproject.server.rt2ae.client.scaffold.place.ProxyListView;

public abstract class SecurityIncidentDesktopDetailsView_Roo_Gwt extends Composite implements SecurityIncidentDetailsView {

    @UiField
    SpanElement securityIncidentId;

    @UiField
    SpanElement assetsId;

    @UiField
    SpanElement devicesId;

    @UiField
    SpanElement usersId;

    @UiField
    SpanElement description;

    @UiField
    SpanElement costbenefit;

    @UiField
    SpanElement decisionId;

    @UiField
    SpanElement probability;

    SecurityIncidentProxy proxy;

    @UiField
    SpanElement displayRenderer;

    public void setValue(SecurityIncidentProxy proxy) {
        this.proxy = proxy;
        securityIncidentId.setInnerText(proxy.getSecurityIncidentId() == null ? "" : String.valueOf(proxy.getSecurityIncidentId()));
        assetsId.setInnerText(proxy.getAssetsId() == null ? "" : eu.musesproject.server.rt2ae.client.managed.ui.renderer.AssetProxyRenderer.instance().render(proxy.getAssetsId()));
        devicesId.setInnerText(proxy.getDevicesId() == null ? "" : eu.musesproject.server.rt2ae.client.managed.ui.renderer.DeviceProxyRenderer.instance().render(proxy.getDevicesId()));
        usersId.setInnerText(proxy.getUsersId() == null ? "" : eu.musesproject.server.rt2ae.client.managed.ui.renderer.UserProxyRenderer.instance().render(proxy.getUsersId()));
        description.setInnerText(proxy.getDescription() == null ? "" : String.valueOf(proxy.getDescription()));
        costbenefit.setInnerText(proxy.getCostbenefit() == null ? "" : String.valueOf(proxy.getCostbenefit()));
        decisionId.setInnerText(proxy.getDecisionId() == null ? "" : String.valueOf(proxy.getDecisionId()));
        probability.setInnerText(proxy.getProbability() == null ? "" : String.valueOf(proxy.getProbability()));
        displayRenderer.setInnerText(eu.musesproject.server.rt2ae.client.managed.ui.renderer.SecurityIncidentProxyRenderer.instance().render(proxy));
    }
}
