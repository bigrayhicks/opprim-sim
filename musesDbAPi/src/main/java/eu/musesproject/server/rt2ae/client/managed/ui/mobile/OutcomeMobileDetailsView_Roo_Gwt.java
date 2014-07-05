// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package eu.musesproject.server.rt2ae.client.managed.ui.mobile;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
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
import eu.musesproject.server.rt2ae.client.managed.ui.OutcomeDetailsView;
import eu.musesproject.server.rt2ae.client.proxy.OpportunityProxy;
import eu.musesproject.server.rt2ae.client.proxy.OutcomeProxy;
import eu.musesproject.server.rt2ae.client.proxy.ThreatProxy;

public abstract class OutcomeMobileDetailsView_Roo_Gwt extends Composite implements OutcomeDetailsView {

    @UiField
    Element outcomeId;

    @UiField
    Element opportunityId;

    @UiField
    Element threatId;

    @UiField
    Element description;

    @UiField
    Element costbenefit;

    OutcomeProxy proxy;

    public void setValue(OutcomeProxy proxy) {
        this.proxy = proxy;
        outcomeId.setInnerText(proxy.getOutcomeId() == null ? "" : String.valueOf(proxy.getOutcomeId()));
        opportunityId.setInnerText(proxy.getOpportunityId() == null ? "" : eu.musesproject.server.rt2ae.client.managed.ui.renderer.OpportunityProxyRenderer.instance().render(proxy.getOpportunityId()));
        threatId.setInnerText(proxy.getThreatId() == null ? "" : eu.musesproject.server.rt2ae.client.managed.ui.renderer.ThreatProxyRenderer.instance().render(proxy.getThreatId()));
        description.setInnerText(proxy.getDescription() == null ? "" : String.valueOf(proxy.getDescription()));
        costbenefit.setInnerText(proxy.getCostbenefit() == null ? "" : String.valueOf(proxy.getCostbenefit()));
    }
}
