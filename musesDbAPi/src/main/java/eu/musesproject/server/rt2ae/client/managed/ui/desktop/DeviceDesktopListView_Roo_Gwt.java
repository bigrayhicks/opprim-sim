// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package eu.musesproject.server.rt2ae.client.managed.ui.desktop;
import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.text.client.DateTimeFormatRenderer;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.text.shared.Renderer;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy.KeyboardSelectionPolicy;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import eu.musesproject.server.rt2ae.client.managed.ui.editor.AccessrequestSetEditor;
import eu.musesproject.server.rt2ae.client.managed.ui.editor.DeviceSecurityStateSetEditor;
import eu.musesproject.server.rt2ae.client.managed.ui.editor.SecurityIncidentSetEditor;
import eu.musesproject.server.rt2ae.client.proxy.AccessrequestProxy;
import eu.musesproject.server.rt2ae.client.proxy.DeviceProxy;
import eu.musesproject.server.rt2ae.client.proxy.DeviceSecurityStateProxy;
import eu.musesproject.server.rt2ae.client.proxy.SecurityIncidentProxy;
import eu.musesproject.server.rt2ae.client.proxy.UserProxy;
import eu.musesproject.server.rt2ae.client.scaffold.place.AbstractProxyListView;
import java.util.HashSet;
import java.util.Set;

public abstract class DeviceDesktopListView_Roo_Gwt extends AbstractProxyListView<DeviceProxy> {

    @UiField
    CellTable<DeviceProxy> table;

    protected Set<String> paths = new HashSet<String>();

    public void init() {
        paths.add("deviceId");
        table.addColumn(new TextColumn<DeviceProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(DeviceProxy object) {
                return renderer.render(object.getDeviceId());
            }
        }, "Device Id");
        paths.add("accessrequests");
        table.addColumn(new TextColumn<DeviceProxy>() {

            Renderer<java.util.Set> renderer = eu.musesproject.server.rt2ae.client.scaffold.place.CollectionRenderer.of(eu.musesproject.server.rt2ae.client.managed.ui.renderer.AccessrequestProxyRenderer.instance());

            @Override
            public String getValue(DeviceProxy object) {
                return renderer.render(object.getAccessrequests());
            }
        }, "Accessrequests");
        paths.add("deviceSecurityStates");
        table.addColumn(new TextColumn<DeviceProxy>() {

            Renderer<java.util.Set> renderer = eu.musesproject.server.rt2ae.client.scaffold.place.CollectionRenderer.of(eu.musesproject.server.rt2ae.client.managed.ui.renderer.DeviceSecurityStateProxyRenderer.instance());

            @Override
            public String getValue(DeviceProxy object) {
                return renderer.render(object.getDeviceSecurityStates());
            }
        }, "Device Security States");
        paths.add("securityIncidents");
        table.addColumn(new TextColumn<DeviceProxy>() {

            Renderer<java.util.Set> renderer = eu.musesproject.server.rt2ae.client.scaffold.place.CollectionRenderer.of(eu.musesproject.server.rt2ae.client.managed.ui.renderer.SecurityIncidentProxyRenderer.instance());

            @Override
            public String getValue(DeviceProxy object) {
                return renderer.render(object.getSecurityIncidents());
            }
        }, "Security Incidents");
        paths.add("ownerId");
        table.addColumn(new TextColumn<DeviceProxy>() {

            Renderer<eu.musesproject.server.rt2ae.client.proxy.UserProxy> renderer = eu.musesproject.server.rt2ae.client.managed.ui.renderer.UserProxyRenderer.instance();

            @Override
            public String getValue(DeviceProxy object) {
                return renderer.render(object.getOwnerId());
            }
        }, "Owner Id");
        paths.add("name");
        table.addColumn(new TextColumn<DeviceProxy>() {

            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {

                public String render(java.lang.String obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(DeviceProxy object) {
                return renderer.render(object.getName());
            }
        }, "Name");
        paths.add("type");
        table.addColumn(new TextColumn<DeviceProxy>() {

            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {

                public String render(java.lang.String obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(DeviceProxy object) {
                return renderer.render(object.getType());
            }
        }, "Type");
        paths.add("description");
        table.addColumn(new TextColumn<DeviceProxy>() {

            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {

                public String render(java.lang.String obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(DeviceProxy object) {
                return renderer.render(object.getDescription());
            }
        }, "Description");
        paths.add("imei");
        table.addColumn(new TextColumn<DeviceProxy>() {

            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {

                public String render(java.lang.String obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(DeviceProxy object) {
                return renderer.render(object.getImei());
            }
        }, "Imei");
        paths.add("macaddress");
        table.addColumn(new TextColumn<DeviceProxy>() {

            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {

                public String render(java.lang.String obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(DeviceProxy object) {
                return renderer.render(object.getMacaddress());
            }
        }, "Macaddress");
        paths.add("os");
        table.addColumn(new TextColumn<DeviceProxy>() {

            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {

                public String render(java.lang.String obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(DeviceProxy object) {
                return renderer.render(object.getOs());
            }
        }, "Os");
        paths.add("trustvalue");
        table.addColumn(new TextColumn<DeviceProxy>() {

            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {

                public String render(java.lang.String obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(DeviceProxy object) {
                return renderer.render(object.getTrustvalue());
            }
        }, "Trustvalue");
        paths.add("version");
        table.addColumn(new TextColumn<DeviceProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(DeviceProxy object) {
                return renderer.render(object.getVersion());
            }
        }, "Version");
    }
}
