package eu.musesproject.server.rt2ae.client.managed.activity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.Receiver;
import eu.musesproject.server.rt2ae.client.managed.request.ApplicationRequestFactory;
import eu.musesproject.server.rt2ae.client.managed.ui.DeviceEditView;
import eu.musesproject.server.rt2ae.client.managed.ui.editor.AccessrequestSetEditor;
import eu.musesproject.server.rt2ae.client.managed.ui.editor.DeviceSecurityStateSetEditor;
import eu.musesproject.server.rt2ae.client.managed.ui.editor.SecurityIncidentSetEditor;
import eu.musesproject.server.rt2ae.client.proxy.AccessrequestProxy;
import eu.musesproject.server.rt2ae.client.proxy.DeviceProxy;
import eu.musesproject.server.rt2ae.client.proxy.DeviceSecurityStateProxy;
import eu.musesproject.server.rt2ae.client.proxy.SecurityIncidentProxy;
import eu.musesproject.server.rt2ae.client.proxy.UserProxy;
import eu.musesproject.server.rt2ae.client.scaffold.activity.IsScaffoldMobileActivity;
import eu.musesproject.server.rt2ae.client.scaffold.place.ProxyEditView;
import eu.musesproject.server.rt2ae.client.scaffold.place.ProxyListPlace;
import eu.musesproject.server.rt2ae.client.scaffold.place.ProxyPlace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class DeviceEditActivityWrapper extends DeviceEditActivityWrapper_Roo_Gwt {

    private final EntityProxyId<DeviceProxy> proxyId;

    public DeviceEditActivityWrapper(ApplicationRequestFactory requests, View<?> view, Activity activity, EntityProxyId<DeviceProxy> proxyId) {
        this.requests = requests;
        this.view = view;
        this.wrapped = activity;
        this.proxyId = proxyId;
    }

    public Place getBackButtonPlace() {
        return (proxyId == null) ? new ProxyListPlace(DeviceProxy.class) : new ProxyPlace(proxyId, ProxyPlace.Operation.DETAILS);
    }

    public String getBackButtonText() {
        return "Cancel";
    }

    public Place getEditButtonPlace() {
        return null;
    }

    public String getTitleText() {
        return (proxyId == null) ? "New Device" : "Edit Device";
    }

    public boolean hasEditButton() {
        return false;
    }

    @Override
    public String mayStop() {
        return wrapped.mayStop();
    }

    @Override
    public void onCancel() {
        wrapped.onCancel();
    }

    @Override
    public void onStop() {
        wrapped.onStop();
    }

    public interface View<V extends eu.musesproject.server.rt2ae.client.managed.ui.DeviceEditView<V>> extends View_Roo_Gwt<V> {
    }
}
