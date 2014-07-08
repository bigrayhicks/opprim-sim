// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package eu.musesproject.server.rt2ae;

import eu.musesproject.server.rt2ae.Accessrequest;
import eu.musesproject.server.rt2ae.Decision;
import eu.musesproject.server.rt2ae.Riskcommunication;
import eu.musesproject.server.rt2ae.Risktreatment;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

privileged aspect Riskcommunication_Roo_DbManaged {
    
    @OneToMany(mappedBy = "riskcommunicationid")
    private Set<Accessrequest> Riskcommunication.accessrequests;
    
    @OneToMany(mappedBy = "riskcommunicationId")
    private Set<Decision> Riskcommunication.decisions;
    
    @OneToMany(mappedBy = "riskcommunicationId")
    private Set<Risktreatment> Riskcommunication.risktreatments;
    
    @Column(name = "textualDescription", length = 255)
    @NotNull
    private String Riskcommunication.textualDescription;
    
    public Set<Accessrequest> Riskcommunication.getAccessrequests() {
        return accessrequests;
    }
    
    public void Riskcommunication.setAccessrequests(Set<Accessrequest> accessrequests) {
        this.accessrequests = accessrequests;
    }
    
    public Set<Decision> Riskcommunication.getDecisions() {
        return decisions;
    }
    
    public void Riskcommunication.setDecisions(Set<Decision> decisions) {
        this.decisions = decisions;
    }
    
    public Set<Risktreatment> Riskcommunication.getRisktreatments() {
        return risktreatments;
    }
    
    public void Riskcommunication.setRisktreatments(Set<Risktreatment> risktreatments) {
        this.risktreatments = risktreatments;
    }
    
    public String Riskcommunication.getTextualDescription() {
        return textualDescription;
    }
    
    public void Riskcommunication.setTextualDescription(String textualDescription) {
        this.textualDescription = textualDescription;
    }
    
}