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
import eu.musesproject.server.rt2ae.client.managed.activity.ThreatEditActivityWrapper;
import eu.musesproject.server.rt2ae.client.managed.activity.ThreatEditActivityWrapper.View;
import eu.musesproject.server.rt2ae.client.managed.ui.ThreatEditView;
import eu.musesproject.server.rt2ae.client.managed.ui.editor.AccessrequestSetEditor;
import eu.musesproject.server.rt2ae.client.managed.ui.editor.ClueSetEditor;
import eu.musesproject.server.rt2ae.client.managed.ui.editor.OutcomeSetEditor;
import eu.musesproject.server.rt2ae.client.proxy.AccessrequestProxy;
import eu.musesproject.server.rt2ae.client.proxy.ClueProxy;
import eu.musesproject.server.rt2ae.client.proxy.OutcomeProxy;
import eu.musesproject.server.rt2ae.client.proxy.ThreatProxy;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public abstract class ThreatDesktopEditView_Roo_Gwt extends Composite implements View<ThreatDesktopEditView> {

    @UiField
    AccessrequestSetEditor accessrequests;

    @UiField
    ClueSetEditor clues;

    @UiField
    OutcomeSetEditor outcomes;

    @UiField
    TextBox description;

    @UiField
    DoubleBox probability;

    @UiField
    DoubleBox occurences;

    @UiField
    DoubleBox badOutcomeCount;

    @UiField
    IntegerBox ttl;

    public void setAccessrequestsPickerValues(Collection<AccessrequestProxy> values) {
        accessrequests.setAcceptableValues(values);
    }

    public void setCluesPickerValues(Collection<ClueProxy> values) {
        clues.setAcceptableValues(values);
    }

    public void setOutcomesPickerValues(Collection<OutcomeProxy> values) {
        outcomes.setAcceptableValues(values);
    }
}
