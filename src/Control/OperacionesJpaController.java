/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Control.exceptions.NonexistentEntityException;
import Control.exceptions.PreexistingEntityException;
import Tablas.Operaciones;
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
public class OperacionesJpaController implements Serializable {

    public OperacionesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Operaciones operaciones) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(operaciones);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findOperaciones(operaciones.getIdOperaciones()) != null) {
                throw new PreexistingEntityException("Operaciones " + operaciones + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Operaciones operaciones) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            operaciones = em.merge(operaciones);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = operaciones.getIdOperaciones();
                if (findOperaciones(id) == null) {
                    throw new NonexistentEntityException("The operaciones with id " + id + " no longer exists.");
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
            Operaciones operaciones;
            try {
                operaciones = em.getReference(Operaciones.class, id);
                operaciones.getIdOperaciones();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The operaciones with id " + id + " no longer exists.", enfe);
            }
            em.remove(operaciones);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Operaciones> findOperacionesEntities() {
        return findOperacionesEntities(true, -1, -1);
    }

    public List<Operaciones> findOperacionesEntities(int maxResults, int firstResult) {
        return findOperacionesEntities(false, maxResults, firstResult);
    }

    private List<Operaciones> findOperacionesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Operaciones.class));
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

    public Operaciones findOperaciones(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Operaciones.class, id);
        } finally {
            em.close();
        }
    }

    public int getOperacionesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Operaciones> rt = cq.from(Operaciones.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
