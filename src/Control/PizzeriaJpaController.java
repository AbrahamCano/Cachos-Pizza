/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Control.exceptions.NonexistentEntityException;
import Tablas.Pizzeria;
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
public class PizzeriaJpaController implements Serializable {

    public PizzeriaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Pizzeria pizzeria) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(pizzeria);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Pizzeria pizzeria) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            pizzeria = em.merge(pizzeria);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = pizzeria.getIdPizzeria();
                if (findPizzeria(id) == null) {
                    throw new NonexistentEntityException("The pizzeria with id " + id + " no longer exists.");
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
            Pizzeria pizzeria;
            try {
                pizzeria = em.getReference(Pizzeria.class, id);
                pizzeria.getIdPizzeria();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The pizzeria with id " + id + " no longer exists.", enfe);
            }
            em.remove(pizzeria);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Pizzeria> findPizzeriaEntities() {
        return findPizzeriaEntities(true, -1, -1);
    }

    public List<Pizzeria> findPizzeriaEntities(int maxResults, int firstResult) {
        return findPizzeriaEntities(false, maxResults, firstResult);
    }

    private List<Pizzeria> findPizzeriaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Pizzeria.class));
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

    public Pizzeria findPizzeria(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Pizzeria.class, id);
        } finally {
            em.close();
        }
    }

    public int getPizzeriaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Pizzeria> rt = cq.from(Pizzeria.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
