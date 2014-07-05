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
import eu.musesproject.server.rt2ae.client.managed.ui.RiskPolicyDetailsView;
import eu.musesproject.server.rt2ae.client.proxy.RiskPolicyProxy;
import eu.musesproject.server.rt2ae.client.scaffold.place.ProxyListView;

public abstract class RiskPolicyDesktopDetailsView_Roo_Gwt extends Composite implements RiskPolicyDetailsView {

    @UiField
    SpanElement riskpolicyId;

    @UiField
    SpanElement riskvalue;

    @UiField
    SpanElement description;

    RiskPolicyProxy proxy;

    @UiField
    SpanElement displayRenderer;

    public void setValue(RiskPolicyProxy proxy) {
        this.proxy = proxy;
        riskpolicyId.setInnerText(proxy.getRiskpolicyId() == null ? "" : String.valueOf(proxy.getRiskpolicyId()));
        riskvalue.setInnerText(proxy.getRiskvalue() == null ? "" : String.valueOf(proxy.getRiskvalue()));
        description.setInnerText(proxy.getDescription() == null ? "" : String.valueOf(proxy.getDescription()));
        displayRenderer.setInnerText(eu.musesproject.server.rt2ae.client.managed.ui.renderer.RiskPolicyProxyRenderer.instance().render(proxy));
    }
}
