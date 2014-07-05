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
import eu.musesproject.server.rt2ae.client.managed.ui.DeviceSecurityStateDetailsView;
import eu.musesproject.server.rt2ae.client.proxy.DeviceProxy;
import eu.musesproject.server.rt2ae.client.proxy.DeviceSecurityStateProxy;

public class DeviceSecurityStateMobileDetailsView extends DeviceSecurityStateMobileDetailsView_Roo_Gwt {

    private static final Binder BINDER = GWT.create(Binder.class);

    private static DeviceSecurityStateMobileDetailsView instance;

    @UiField
    HasClickHandlers delete;

    private Delegate delegate;

    public DeviceSecurityStateMobileDetailsView() {
        initWidget(BINDER.createAndBindUi(this));
    }

    public static DeviceSecurityStateMobileDetailsView instance() {
        if (instance == null) {
            instance = new DeviceSecurityStateMobileDetailsView();
        }
        return instance;
    }

    public Widget asWidget() {
        return this;
    }

    public boolean confirm(String msg) {
        return Window.confirm(msg);
    }

    public DeviceSecurityStateProxy getValue() {
        return proxy;
    }

    @UiHandler("delete")
    public void onDeleteClicked(ClickEvent e) {
        delegate.deleteClicked();
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    interface Binder extends UiBinder<HTMLPanel, DeviceSecurityStateMobileDetailsView> {
    }
}
