// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package eu.musesproject.server.rt2ae;

import eu.musesproject.server.rt2ae.Accessrequest;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

privileged aspect Accessrequest_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager Accessrequest.entityManager;
    
    public static final EntityManager Accessrequest.entityManager() {
        EntityManager em = new Accessrequest().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Accessrequest.countAccessrequests() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Accessrequest o", Long.class).getSingleResult();
    }
    
    public static List<Accessrequest> Accessrequest.findAllAccessrequests() {
        return entityManager().createQuery("SELECT o FROM Accessrequest o", Accessrequest.class).getResultList();
    }
    
    public static Accessrequest Accessrequest.findAccessrequest(Integer accessrequestId) {
        if (accessrequestId == null) return null;
        return entityManager().find(Accessrequest.class, accessrequestId);
    }
    
    public static List<Accessrequest> Accessrequest.findAccessrequestbyTimestampandThreat(Calendar time,int threatid) {
        return entityManager().createQuery("SELECT o FROM Accessrequest o where o.time =:time and threat_id =:threatid").setParameter("time", time).setParameter("threat_id", threatid).getResultList();
    }
    
    public static List<Accessrequest> Accessrequest.findAccessrequestEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Accessrequest o", Accessrequest.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void Accessrequest.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Accessrequest.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Accessrequest attached = Accessrequest.findAccessrequest(this.accessrequestId);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Accessrequest.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Accessrequest.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Accessrequest Accessrequest.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Accessrequest merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
