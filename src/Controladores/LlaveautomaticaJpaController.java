/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Controladores.exceptions.PreexistingEntityException;
import Entidades.Llaveautomatica;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Admini
 */
public class LlaveautomaticaJpaController implements Serializable {

    public LlaveautomaticaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Llaveautomatica llaveautomatica) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(llaveautomatica);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findLlaveautomatica(llaveautomatica.getCodigo()) != null) {
                throw new PreexistingEntityException("Llaveautomatica " + llaveautomatica + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Llaveautomatica llaveautomatica) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            llaveautomatica = em.merge(llaveautomatica);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = llaveautomatica.getCodigo();
                if (findLlaveautomatica(id) == null) {
                    throw new NonexistentEntityException("The llaveautomatica with id " + id + " no longer exists.");
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
            Llaveautomatica llaveautomatica;
            try {
                llaveautomatica = em.getReference(Llaveautomatica.class, id);
                llaveautomatica.getCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The llaveautomatica with id " + id + " no longer exists.", enfe);
            }
            em.remove(llaveautomatica);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Llaveautomatica> findLlaveautomaticaEntities() {
        return findLlaveautomaticaEntities(true, -1, -1);
    }

    public List<Llaveautomatica> findLlaveautomaticaEntities(int maxResults, int firstResult) {
        return findLlaveautomaticaEntities(false, maxResults, firstResult);
    }

    private List<Llaveautomatica> findLlaveautomaticaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Llaveautomatica.class));
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

    public Llaveautomatica findLlaveautomatica(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Llaveautomatica.class, id);
        } finally {
            em.close();
        }
    }

    public int getLlaveautomaticaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Llaveautomatica> rt = cq.from(Llaveautomatica.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
