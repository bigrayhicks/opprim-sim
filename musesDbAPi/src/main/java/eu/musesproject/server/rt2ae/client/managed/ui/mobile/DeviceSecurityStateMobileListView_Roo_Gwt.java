// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package eu.musesproject.server.rt2ae.client.managed.ui.mobile;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.text.client.DateTimeFormatRenderer;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.text.shared.AbstractSafeHtmlRenderer;
import com.google.gwt.text.shared.Renderer;
import com.google.gwt.text.shared.SafeHtmlRenderer;
import eu.musesproject.server.rt2ae.client.proxy.DeviceProxy;
import eu.musesproject.server.rt2ae.client.proxy.DeviceSecurityStateProxy;
import eu.musesproject.server.rt2ae.client.scaffold.ScaffoldMobileApp;
import eu.musesproject.server.rt2ae.client.scaffold.ui.MobileProxyListView;
import java.util.HashSet;
import java.util.Set;

public abstract class DeviceSecurityStateMobileListView_Roo_Gwt extends MobileProxyListView<DeviceSecurityStateProxy> {

    protected Set<String> paths = new HashSet<String>();

    public DeviceSecurityStateMobileListView_Roo_Gwt(String buttonText, SafeHtmlRenderer<DeviceSecurityStateProxy> renderer) {
        super(buttonText, renderer);
    }

    public void init() {
        paths.add("deviceSecurityStateId");
    }
}
