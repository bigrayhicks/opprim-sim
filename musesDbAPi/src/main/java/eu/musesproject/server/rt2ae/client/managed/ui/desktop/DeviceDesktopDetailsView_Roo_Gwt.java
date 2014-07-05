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
import eu.musesproject.server.rt2ae.client.managed.ui.DeviceDetailsView;
import eu.musesproject.server.rt2ae.client.managed.ui.editor.AccessrequestSetEditor;
import eu.musesproject.server.rt2ae.client.managed.ui.editor.DeviceSecurityStateSetEditor;
import eu.musesproject.server.rt2ae.client.managed.ui.editor.SecurityIncidentSetEditor;
import eu.musesproject.server.rt2ae.client.proxy.AccessrequestProxy;
import eu.musesproject.server.rt2ae.client.proxy.DeviceProxy;
import eu.musesproject.server.rt2ae.client.proxy.DeviceSecurityStateProxy;
import eu.musesproject.server.rt2ae.client.proxy.SecurityIncidentProxy;
import eu.musesproject.server.rt2ae.client.proxy.UserProxy;
import eu.musesproject.server.rt2ae.client.scaffold.place.ProxyListView;
import java.util.Set;

public abstract class DeviceDesktopDetailsView_Roo_Gwt extends Composite implements DeviceDetailsView {

    @UiField
    SpanElement deviceId;

    @UiField
    SpanElement accessrequests;

    @UiField
    SpanElement deviceSecurityStates;

    @UiField
    SpanElement securityIncidents;

    @UiField
    SpanElement ownerId;

    @UiField
    SpanElement name;

    @UiField
    SpanElement type;

    @UiField
    SpanElement description;

    @UiField
    SpanElement imei;

    @UiField
    SpanElement macaddress;

    @UiField
    SpanElement os;

    @UiField
    SpanElement trustvalue;

    @UiField
    SpanElement version;

    DeviceProxy proxy;

    @UiField
    SpanElement displayRenderer;

    public void setValue(DeviceProxy proxy) {
        this.proxy = proxy;
        deviceId.setInnerText(proxy.getDeviceId() == null ? "" : String.valueOf(proxy.getDeviceId()));
        accessrequests.setInnerText(proxy.getAccessrequests() == null ? "" : eu.musesproject.server.rt2ae.client.scaffold.place.CollectionRenderer.of(eu.musesproject.server.rt2ae.client.managed.ui.renderer.AccessrequestProxyRenderer.instance()).render(proxy.getAccessrequests()));
        deviceSecurityStates.setInnerText(proxy.getDeviceSecurityStates() == null ? "" : eu.musesproject.server.rt2ae.client.scaffold.place.CollectionRenderer.of(eu.musesproject.server.rt2ae.client.managed.ui.renderer.DeviceSecurityStateProxyRenderer.instance()).render(proxy.getDeviceSecurityStates()));
        securityIncidents.setInnerText(proxy.getSecurityIncidents() == null ? "" : eu.musesproject.server.rt2ae.client.scaffold.place.CollectionRenderer.of(eu.musesproject.server.rt2ae.client.managed.ui.renderer.SecurityIncidentProxyRenderer.instance()).render(proxy.getSecurityIncidents()));
        ownerId.setInnerText(proxy.getOwnerId() == null ? "" : eu.musesproject.server.rt2ae.client.managed.ui.renderer.UserProxyRenderer.instance().render(proxy.getOwnerId()));
        name.setInnerText(proxy.getName() == null ? "" : String.valueOf(proxy.getName()));
        type.setInnerText(proxy.getType() == null ? "" : String.valueOf(proxy.getType()));
        description.setInnerText(proxy.getDescription() == null ? "" : String.valueOf(proxy.getDescription()));
        imei.setInnerText(proxy.getImei() == null ? "" : String.valueOf(proxy.getImei()));
        macaddress.setInnerText(proxy.getMacaddress() == null ? "" : String.valueOf(proxy.getMacaddress()));
        os.setInnerText(proxy.getOs() == null ? "" : String.valueOf(proxy.getOs()));
        trustvalue.setInnerText(proxy.getTrustvalue() == null ? "" : String.valueOf(proxy.getTrustvalue()));
        version.setInnerText(proxy.getVersion() == null ? "" : String.valueOf(proxy.getVersion()));
        displayRenderer.setInnerText(eu.musesproject.server.rt2ae.client.managed.ui.renderer.DeviceProxyRenderer.instance().render(proxy));
    }
}
