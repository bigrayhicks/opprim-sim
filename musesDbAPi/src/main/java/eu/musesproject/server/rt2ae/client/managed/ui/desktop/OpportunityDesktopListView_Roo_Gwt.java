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
import eu.musesproject.server.rt2ae.client.managed.ui.editor.AssetSetEditor;
import eu.musesproject.server.rt2ae.client.managed.ui.editor.OutcomeSetEditor;
import eu.musesproject.server.rt2ae.client.proxy.AccessrequestProxy;
import eu.musesproject.server.rt2ae.client.proxy.AssetProxy;
import eu.musesproject.server.rt2ae.client.proxy.OpportunityProxy;
import eu.musesproject.server.rt2ae.client.proxy.OutcomeProxy;
import eu.musesproject.server.rt2ae.client.scaffold.place.AbstractProxyListView;
import java.util.HashSet;
import java.util.Set;

public abstract class OpportunityDesktopListView_Roo_Gwt extends AbstractProxyListView<OpportunityProxy> {

    @UiField
    CellTable<OpportunityProxy> table;

    protected Set<String> paths = new HashSet<String>();

    public void init() {
        paths.add("opportunityId");
        table.addColumn(new TextColumn<OpportunityProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(OpportunityProxy object) {
                return renderer.render(object.getOpportunityId());
            }
        }, "Opportunity Id");
        paths.add("accessrequests");
        table.addColumn(new TextColumn<OpportunityProxy>() {

            Renderer<java.util.Set> renderer = eu.musesproject.server.rt2ae.client.scaffold.place.CollectionRenderer.of(eu.musesproject.server.rt2ae.client.managed.ui.renderer.AccessrequestProxyRenderer.instance());

            @Override
            public String getValue(OpportunityProxy object) {
                return renderer.render(object.getAccessrequests());
            }
        }, "Accessrequests");
        paths.add("assets");
        table.addColumn(new TextColumn<OpportunityProxy>() {

            Renderer<java.util.Set> renderer = eu.musesproject.server.rt2ae.client.scaffold.place.CollectionRenderer.of(eu.musesproject.server.rt2ae.client.managed.ui.renderer.AssetProxyRenderer.instance());

            @Override
            public String getValue(OpportunityProxy object) {
                return renderer.render(object.getAssets());
            }
        }, "Assets");
        paths.add("outcomes");
        table.addColumn(new TextColumn<OpportunityProxy>() {

            Renderer<java.util.Set> renderer = eu.musesproject.server.rt2ae.client.scaffold.place.CollectionRenderer.of(eu.musesproject.server.rt2ae.client.managed.ui.renderer.OutcomeProxyRenderer.instance());

            @Override
            public String getValue(OpportunityProxy object) {
                return renderer.render(object.getOutcomes());
            }
        }, "Outcomes");
        paths.add("description");
        table.addColumn(new TextColumn<OpportunityProxy>() {

            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {

                public String render(java.lang.String obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(OpportunityProxy object) {
                return renderer.render(object.getDescription());
            }
        }, "Description");
        paths.add("costbenefit");
        table.addColumn(new TextColumn<OpportunityProxy>() {

            Renderer<java.lang.Double> renderer = new AbstractRenderer<java.lang.Double>() {

                public String render(java.lang.Double obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(OpportunityProxy object) {
                return renderer.render(object.getCostbenefit());
            }
        }, "Costbenefit");
    }
}
