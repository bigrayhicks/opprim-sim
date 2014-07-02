// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package eu.musesproject.server.rt2ae;

import eu.musesproject.server.rt2ae.Accessrequest;
import eu.musesproject.server.rt2ae.Asset;
import eu.musesproject.server.rt2ae.Device;
import eu.musesproject.server.rt2ae.Opportunity;
import eu.musesproject.server.rt2ae.Riskcommunication;
import eu.musesproject.server.rt2ae.Riskinformation;
import eu.musesproject.server.rt2ae.Threat;
import eu.musesproject.server.rt2ae.User;
import eu.musesproject.server.rt2ae.UserAction;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

privileged aspect Accessrequest_Roo_DbManaged {
    
    @OneToMany(mappedBy = "accessrequestId")
    private Set<Riskinformation> Accessrequest.riskinformations;
    
    @ManyToOne
    @JoinColumn(name = "asset_id", referencedColumnName = "asset_id")
    private Asset Accessrequest.assetId;
    
    @ManyToOne
    @JoinColumn(name = "opportunity_id", referencedColumnName = "opportunity_id")
    private Opportunity Accessrequest.opportunityId;
    
    @ManyToOne
    @JoinColumn(name = "device_id", referencedColumnName = "device_id")
    private Device Accessrequest.deviceId;
    
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
    private User Accessrequest.userId;
    
    @ManyToOne
    @JoinColumn(name = "riskcommunicationid", referencedColumnName = "riskcommunication_id")
    private Riskcommunication Accessrequest.riskcommunicationid;
    
    @ManyToOne
    @JoinColumn(name = "threatid", referencedColumnName = "threat_id")
    private Threat Accessrequest.threatid;
    
    @ManyToOne
    @JoinColumn(name = "useraction_id", referencedColumnName = "useraction_id")
    private UserAction Accessrequest.useractionId;
    
    @Column(name = "time")
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "MM")
    private Timestamp Accessrequest.time;
    
    @Column(name = "solved")
    private Short Accessrequest.solved;
    
    public Set<Riskinformation> Accessrequest.getRiskinformations() {
        return riskinformations;
    }
    
    public void Accessrequest.setRiskinformations(Set<Riskinformation> riskinformations) {
        this.riskinformations = riskinformations;
    }
    
    public Asset Accessrequest.getAssetId() {
        return assetId;
    }
    
    public void Accessrequest.setAssetId(Asset assetId) {
        this.assetId = assetId;
    }
    
    public Opportunity Accessrequest.getOpportunityId() {
        return opportunityId;
    }
    
    public void Accessrequest.setOpportunityId(Opportunity opportunityId) {
        this.opportunityId = opportunityId;
    }
    
    public Device Accessrequest.getDeviceId() {
        return deviceId;
    }
    
    public void Accessrequest.setDeviceId(Device deviceId) {
        this.deviceId = deviceId;
    }
    
    public User Accessrequest.getUserId() {
        return userId;
    }
    
    public void Accessrequest.setUserId(User userId) {
        this.userId = userId;
    }
    
    public Riskcommunication Accessrequest.getRiskcommunicationid() {
        return riskcommunicationid;
    }
    
    public void Accessrequest.setRiskcommunicationid(Riskcommunication riskcommunicationid) {
        this.riskcommunicationid = riskcommunicationid;
    }
    
    public Threat Accessrequest.getThreatid() {
        return threatid;
    }
    
    public void Accessrequest.setThreatid(Threat threatid) {
        this.threatid = threatid;
    }
    
    public UserAction Accessrequest.getUseractionId() {
        return useractionId;
    }
    
    public void Accessrequest.setUseractionId(UserAction useractionId) {
        this.useractionId = useractionId;
    }
    
    public Timestamp Accessrequest.getTime() {
        return time;
    }
    
    public void Accessrequest.setTime(Timestamp time) {
        this.time = time;
    }
    
    public Short Accessrequest.getSolved() {
        return solved;
    }
    
    public void Accessrequest.setSolved(Short solved) {
        this.solved = solved;
    }
    
}
