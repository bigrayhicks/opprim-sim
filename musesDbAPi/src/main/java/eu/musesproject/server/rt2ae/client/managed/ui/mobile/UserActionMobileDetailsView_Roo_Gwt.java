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
import eu.musesproject.server.rt2ae.client.managed.ui.UserActionDetailsView;
import eu.musesproject.server.rt2ae.client.managed.ui.editor.AccessrequestSetEditor;
import eu.musesproject.server.rt2ae.client.proxy.AccessrequestProxy;
import eu.musesproject.server.rt2ae.client.proxy.UserActionProxy;
import java.util.Set;

public abstract class UserActionMobileDetailsView_Roo_Gwt extends Composite implements UserActionDetailsView {

    @UiField
    Element useractionId;

    @UiField
    Element accessrequests;

    @UiField
    Element id;

    UserActionProxy proxy;

    public void setValue(UserActionProxy proxy) {
        this.proxy = proxy;
        useractionId.setInnerText(proxy.getUseractionId() == null ? "" : String.valueOf(proxy.getUseractionId()));
        accessrequests.setInnerText(proxy.getAccessrequests() == null ? "" : eu.musesproject.server.rt2ae.client.scaffold.place.CollectionRenderer.of(eu.musesproject.server.rt2ae.client.managed.ui.renderer.AccessrequestProxyRenderer.instance()).render(proxy.getAccessrequests()));
        id.setInnerText(proxy.getId() == null ? "" : String.valueOf(proxy.getId()));
    }
}
