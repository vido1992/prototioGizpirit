/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Controladores.exceptions.PreexistingEntityException;
import Entidades.Tomacorriente;
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
public class TomacorrienteJpaController implements Serializable {

    public TomacorrienteJpaController() {
        this.emf = Persistence.createEntityManagerFactory("Software1PU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Tomacorriente tomacorriente) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tomacorriente);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findTomacorriente(tomacorriente.getCodigo()) != null) {
                throw new PreexistingEntityException("Tomacorriente " + tomacorriente + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Tomacorriente tomacorriente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tomacorriente = em.merge(tomacorriente);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = tomacorriente.getCodigo();
                if (findTomacorriente(id) == null) {
                    throw new NonexistentEntityException("The tomacorriente with id " + id + " no longer exists.");
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
            Tomacorriente tomacorriente;
            try {
                tomacorriente = em.getReference(Tomacorriente.class, id);
                tomacorriente.getCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tomacorriente with id " + id + " no longer exists.", enfe);
            }
            em.remove(tomacorriente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Tomacorriente> findTomacorrienteEntities() {
        return findTomacorrienteEntities(true, -1, -1);
    }

    public List<Tomacorriente> findTomacorrienteEntities(int maxResults, int firstResult) {
        return findTomacorrienteEntities(false, maxResults, firstResult);
    }

    private List<Tomacorriente> findTomacorrienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Tomacorriente.class));
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

    public Tomacorriente findTomacorriente(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Tomacorriente.class, id);
        } finally {
            em.close();
        }
    }

    public int getTomacorrienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Tomacorriente> rt = cq.from(Tomacorriente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
