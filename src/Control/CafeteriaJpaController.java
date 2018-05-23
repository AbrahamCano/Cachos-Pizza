/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Control.exceptions.NonexistentEntityException;
import Tablas.Cafeteria;
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
 * @author mac
 */
public class CafeteriaJpaController implements Serializable {

    public CafeteriaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cafeteria cafeteria) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(cafeteria);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cafeteria cafeteria) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            cafeteria = em.merge(cafeteria);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = cafeteria.getIdCafeteria();
                if (findCafeteria(id) == null) {
                    throw new NonexistentEntityException("The cafeteria with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cafeteria cafeteria;
            try {
                cafeteria = em.getReference(Cafeteria.class, id);
                cafeteria.getIdCafeteria();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cafeteria with id " + id + " no longer exists.", enfe);
            }
            em.remove(cafeteria);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cafeteria> findCafeteriaEntities() {
        return findCafeteriaEntities(true, -1, -1);
    }

    public List<Cafeteria> findCafeteriaEntities(int maxResults, int firstResult) {
        return findCafeteriaEntities(false, maxResults, firstResult);
    }

    private List<Cafeteria> findCafeteriaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cafeteria.class));
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

    public Cafeteria findCafeteria(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cafeteria.class, id);
        } finally {
            em.close();
        }
    }

    public int getCafeteriaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cafeteria> rt = cq.from(Cafeteria.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
