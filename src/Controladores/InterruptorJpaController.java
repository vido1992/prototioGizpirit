/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Controladores.exceptions.PreexistingEntityException;
import Entidades.Interruptor;
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
public class InterruptorJpaController implements Serializable {

    public InterruptorJpaController() {
        this.emf = Persistence.createEntityManagerFactory("Software1PU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Interruptor interruptor) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(interruptor);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findInterruptor(interruptor.getCodigo()) != null) {
                throw new PreexistingEntityException("Interruptor " + interruptor + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Interruptor interruptor) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            interruptor = em.merge(interruptor);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = interruptor.getCodigo();
                if (findInterruptor(id) == null) {
                    throw new NonexistentEntityException("The interruptor with id " + id + " no longer exists.");
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
            Interruptor interruptor;
            try {
                interruptor = em.getReference(Interruptor.class, id);
                interruptor.getCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The interruptor with id " + id + " no longer exists.", enfe);
            }
            em.remove(interruptor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Interruptor> findInterruptorEntities() {
        return findInterruptorEntities(true, -1, -1);
    }

    public List<Interruptor> findInterruptorEntities(int maxResults, int firstResult) {
        return findInterruptorEntities(false, maxResults, firstResult);
    }

    private List<Interruptor> findInterruptorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Interruptor.class));
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

    public Interruptor findInterruptor(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Interruptor.class, id);
        } finally {
            em.close();
        }
    }

    public int getInterruptorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Interruptor> rt = cq.from(Interruptor.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
