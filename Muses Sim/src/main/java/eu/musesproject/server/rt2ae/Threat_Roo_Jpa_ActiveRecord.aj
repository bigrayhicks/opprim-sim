// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package eu.musesproject.server.rt2ae;

import eu.musesproject.server.rt2ae.Threat;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

privileged aspect Threat_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager Threat.entityManager;
    
    public static final EntityManager Threat.entityManager() {
        EntityManager em = new Threat().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Threat.countThreats() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Threat o", Long.class).getSingleResult();
    }
    
    public static List<Threat> Threat.findAllThreats() {
        return entityManager().createQuery("SELECT o FROM Threat o", Threat.class).getResultList();
    }
    
    public static Threat Threat.findThreat(Integer threatId) {
        if (threatId == null) return null;
        return entityManager().find(Threat.class, threatId);
    }
    
    public static List<Threat> Threat.findThreatbyDescription(String description) {
        return entityManager().createQuery("SELECT o FROM Threat o where o.description =:description", Threat.class).setParameter("description", description).getResultList();
    }
    
   
    
    public static List<Threat> Threat.findThreatEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Threat o", Threat.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void Threat.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Threat.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Threat attached = Threat.findThreat(this.threatId);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Threat.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Threat.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Threat Threat.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Threat merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
