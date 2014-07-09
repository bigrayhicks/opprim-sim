// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package eu.musesproject.server.rt2ae.client.managed.ui.desktop;
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
import eu.musesproject.server.rt2ae.client.managed.activity.UserEditActivityWrapper;
import eu.musesproject.server.rt2ae.client.managed.activity.UserEditActivityWrapper.View;
import eu.musesproject.server.rt2ae.client.managed.ui.UserEditView;
import eu.musesproject.server.rt2ae.client.managed.ui.editor.AccessrequestSetEditor;
import eu.musesproject.server.rt2ae.client.managed.ui.editor.DeviceSetEditor;
import eu.musesproject.server.rt2ae.client.managed.ui.editor.SecurityIncidentSetEditor;
import eu.musesproject.server.rt2ae.client.proxy.AccessrequestProxy;
import eu.musesproject.server.rt2ae.client.proxy.DeviceProxy;
import eu.musesproject.server.rt2ae.client.proxy.SecurityIncidentProxy;
import eu.musesproject.server.rt2ae.client.proxy.UserProxy;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public abstract class UserDesktopEditView_Roo_Gwt extends Composite implements View<UserDesktopEditView> {

    @UiField
    AccessrequestSetEditor accessrequests;

    @UiField
    DeviceSetEditor devices;

    @UiField
    SecurityIncidentSetEditor securityIncidents;

    @UiField
    TextBox name;

    @UiField
    TextBox surname;

    @UiField
    TextBox email;

    @UiField
    DoubleBox trustvalue;

    @UiField
    DoubleBox hourlyCost;

    @UiField
    IntegerBox ttl;

    public void setDevicesPickerValues(Collection<DeviceProxy> values) {
        devices.setAcceptableValues(values);
    }

    public void setSecurityIncidentsPickerValues(Collection<SecurityIncidentProxy> values) {
        securityIncidents.setAcceptableValues(values);
    }

    public void setAccessrequestsPickerValues(Collection<AccessrequestProxy> values) {
        accessrequests.setAcceptableValues(values);
    }
}
