/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Controladores.exceptions.PreexistingEntityException;
import Entidades.Audifonos;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Admini
 */
public class AudifonosJpaController implements Serializable {

    public AudifonosJpaController() {
        this.emf = Persistence.createEntityManagerFactory("Software1PU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Audifonos audifonos) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(audifonos);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findAudifonos(audifonos.getCodigo()) != null) {
                throw new PreexistingEntityException("Audifonos " + audifonos + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Audifonos audifonos) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            audifonos = em.merge(audifonos);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = audifonos.getCodigo();
                if (findAudifonos(id) == null) {
                    throw new NonexistentEntityException("The audifonos with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Audifonos audifonos;
            try {
                audifonos = em.getReference(Audifonos.class, id);
                audifonos.getCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The audifonos with id " + id + " no longer exists.", enfe);
            }
            em.remove(audifonos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Audifonos> findAudifonosEntities() {
        return findAudifonosEntities(true, -1, -1);
    }

    public List<Audifonos> findAudifonosEntities(int maxResults, int firstResult) {
        return findAudifonosEntities(false, maxResults, firstResult);
    }

    private List<Audifonos> findAudifonosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Audifonos.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Audifonos findAudifonos(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Audifonos.class, id);
        } finally {
            em.close();
        }
    }

    public int getAudifonosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Audifonos> rt = cq.from(Audifonos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
