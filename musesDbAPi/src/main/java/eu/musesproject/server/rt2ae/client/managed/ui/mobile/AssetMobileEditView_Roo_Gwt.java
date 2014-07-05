// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package eu.musesproject.server.rt2ae.client.managed.ui.mobile;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.editor.client.EditorError;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DoubleBox;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.LongBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.web.bindery.requestfactory.gwt.client.RequestFactoryEditorDriver;
import com.google.web.bindery.requestfactory.shared.RequestFactory;
import eu.musesproject.server.rt2ae.client.managed.activity.AssetEditActivityWrapper;
import eu.musesproject.server.rt2ae.client.managed.activity.AssetEditActivityWrapper.View;
import eu.musesproject.server.rt2ae.client.managed.ui.AssetEditView;
import eu.musesproject.server.rt2ae.client.managed.ui.editor.RiskinformationSetEditor;
import eu.musesproject.server.rt2ae.client.managed.ui.editor.SecurityIncidentSetEditor;
import eu.musesproject.server.rt2ae.client.proxy.AccessrequestProxy;
import eu.musesproject.server.rt2ae.client.proxy.AssetProxy;
import eu.musesproject.server.rt2ae.client.proxy.OpportunityProxy;
import eu.musesproject.server.rt2ae.client.proxy.RiskinformationProxy;
import eu.musesproject.server.rt2ae.client.proxy.SecurityIncidentProxy;
import eu.musesproject.server.rt2ae.client.scaffold.place.ProxyEditView;
import eu.musesproject.server.rt2ae.client.scaffold.ui.*;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public abstract class AssetMobileEditView_Roo_Gwt extends Composite implements View<AssetMobileEditView> {

    @UiField
    RiskinformationSetEditor riskinformations;

    @UiField
    SecurityIncidentSetEditor securityIncidents;

    @UiField(provided = true)
    ValueListBox<AccessrequestProxy> accessrequestId = new ValueListBox<AccessrequestProxy>(eu.musesproject.server.rt2ae.client.managed.ui.renderer.AccessrequestProxyRenderer.instance(), new com.google.web.bindery.requestfactory.gwt.ui.client.EntityProxyKeyProvider<eu.musesproject.server.rt2ae.client.proxy.AccessrequestProxy>());

    @UiField(provided = true)
    ValueListBox<OpportunityProxy> opportunityid = new ValueListBox<OpportunityProxy>(eu.musesproject.server.rt2ae.client.managed.ui.renderer.OpportunityProxyRenderer.instance(), new com.google.web.bindery.requestfactory.gwt.ui.client.EntityProxyKeyProvider<eu.musesproject.server.rt2ae.client.proxy.OpportunityProxy>());

    @UiField
    TextBox assetName;

    @UiField
    TextBox description;

    @UiField
    DoubleBox value;

    @UiField
    TextBox confidentialLevel;

    @UiField
    TextBox location;

    public void setAccessrequestIdPickerValues(Collection<AccessrequestProxy> values) {
        accessrequestId.setAcceptableValues(values);
    }

    public void setSecurityIncidentsPickerValues(Collection<SecurityIncidentProxy> values) {
        securityIncidents.setAcceptableValues(values);
    }

    public void setOpportunityidPickerValues(Collection<OpportunityProxy> values) {
        opportunityid.setAcceptableValues(values);
    }

    public void setRiskinformationsPickerValues(Collection<RiskinformationProxy> values) {
        riskinformations.setAcceptableValues(values);
    }
}
