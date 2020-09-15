/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Controladores.exceptions.PreexistingEntityException;
import Entidades.Controladorvoz;
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
public class ControladorvozJpaController implements Serializable {

    public ControladorvozJpaController() {
        this.emf = Persistence.createEntityManagerFactory("Software1PU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Controladorvoz controladorvoz) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(controladorvoz);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findControladorvoz(controladorvoz.getCodigo()) != null) {
                throw new PreexistingEntityException("Controladorvoz " + controladorvoz + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Controladorvoz controladorvoz) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            controladorvoz = em.merge(controladorvoz);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = controladorvoz.getCodigo();
                if (findControladorvoz(id) == null) {
                    throw new NonexistentEntityException("The controladorvoz with id " + id + " no longer exists.");
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
            Controladorvoz controladorvoz;
            try {
                controladorvoz = em.getReference(Controladorvoz.class, id);
                controladorvoz.getCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The controladorvoz with id " + id + " no longer exists.", enfe);
            }
            em.remove(controladorvoz);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Controladorvoz> findControladorvozEntities() {
        return findControladorvozEntities(true, -1, -1);
    }

    public List<Controladorvoz> findControladorvozEntities(int maxResults, int firstResult) {
        return findControladorvozEntities(false, maxResults, firstResult);
    }

    private List<Controladorvoz> findControladorvozEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Controladorvoz.class));
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

    public Controladorvoz findControladorvoz(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Controladorvoz.class, id);
        } finally {
            em.close();
        }
    }

    public int getControladorvozCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Controladorvoz> rt = cq.from(Controladorvoz.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
