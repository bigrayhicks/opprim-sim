package eu.musesproject.server.rt2ae.client.managed.activity;
import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.Request;
import eu.musesproject.server.rt2ae.client.managed.request.ApplicationRequestFactory;
import eu.musesproject.server.rt2ae.client.managed.ui.UserDetailsView;
import eu.musesproject.server.rt2ae.client.managed.ui.editor.AccessrequestSetEditor;
import eu.musesproject.server.rt2ae.client.managed.ui.editor.DeviceSetEditor;
import eu.musesproject.server.rt2ae.client.managed.ui.editor.SecurityIncidentSetEditor;
import eu.musesproject.server.rt2ae.client.proxy.AccessrequestProxy;
import eu.musesproject.server.rt2ae.client.proxy.DeviceProxy;
import eu.musesproject.server.rt2ae.client.proxy.SecurityIncidentProxy;
import eu.musesproject.server.rt2ae.client.proxy.UserProxy;
import eu.musesproject.server.rt2ae.client.scaffold.activity.IsScaffoldMobileActivity;
import eu.musesproject.server.rt2ae.client.scaffold.place.ProxyListPlace;
import eu.musesproject.server.rt2ae.client.scaffold.place.ProxyPlace;
import eu.musesproject.server.rt2ae.client.scaffold.place.ProxyPlace.Operation;
import java.util.Set;

public class UserDetailsActivity extends UserDetailsActivity_Roo_Gwt {

    public UserDetailsActivity(EntityProxyId<UserProxy> proxyId, ApplicationRequestFactory requests, PlaceController placeController, UserDetailsView view) {
        this.placeController = placeController;
        this.proxyId = proxyId;
        this.requests = requests;
        view.setDelegate(this);
        this.view = view;
    }

    public void editClicked() {
        placeController.goTo(getEditButtonPlace());
    }

    public Place getBackButtonPlace() {
        return new ProxyListPlace(UserProxy.class);
    }

    public String getBackButtonText() {
        return "Back";
    }

    public Place getEditButtonPlace() {
        return new ProxyPlace(view.getValue().stableId(), Operation.EDIT);
    }

    public String getTitleText() {
        return "View User";
    }

    public boolean hasEditButton() {
        return true;
    }

    public void onCancel() {
        onStop();
    }

    public void onStop() {
        display = null;
    }

    public void start(AcceptsOneWidget displayIn, EventBus eventBus) {
        this.display = displayIn;
        Receiver<EntityProxy> callback = new Receiver<EntityProxy>() {

            public void onSuccess(EntityProxy proxy) {
                if (proxy == null) {
                    // Deleted entity, bad bookmark, that kind of thing
                    placeController.goTo(getBackButtonPlace());
                    return;
                }
                if (display == null) {
                    return;
                }
                view.setValue((UserProxy) proxy);
                display.setWidget(view);
            }
        };
        find(callback);
    }
}