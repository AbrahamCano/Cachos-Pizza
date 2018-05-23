/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Control.exceptions.NonexistentEntityException;
import Control.exceptions.PreexistingEntityException;
import Tablas.DatosAlmacenados;
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
public class DatosAlmacenadosJpaController implements Serializable {

    public DatosAlmacenadosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(DatosAlmacenados datosAlmacenados) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(datosAlmacenados);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findDatosAlmacenados(datosAlmacenados.getNumeroUno()) != null) {
                throw new PreexistingEntityException("DatosAlmacenados " + datosAlmacenados + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(DatosAlmacenados datosAlmacenados) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            datosAlmacenados = em.merge(datosAlmacenados);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = datosAlmacenados.getNumeroUno();
                if (findDatosAlmacenados(id) == null) {
                    throw new NonexistentEntityException("The datosAlmacenados with id " + id + " no longer exists.");
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
            DatosAlmacenados datosAlmacenados;
            try {
                datosAlmacenados = em.getReference(DatosAlmacenados.class, id);
                datosAlmacenados.getNumeroUno();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The datosAlmacenados with id " + id + " no longer exists.", enfe);
            }
            em.remove(datosAlmacenados);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<DatosAlmacenados> findDatosAlmacenadosEntities() {
        return findDatosAlmacenadosEntities(true, -1, -1);
    }

    public List<DatosAlmacenados> findDatosAlmacenadosEntities(int maxResults, int firstResult) {
        return findDatosAlmacenadosEntities(false, maxResults, firstResult);
    }

    private List<DatosAlmacenados> findDatosAlmacenadosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(DatosAlmacenados.class));
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

    public DatosAlmacenados findDatosAlmacenados(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(DatosAlmacenados.class, id);
        } finally {
            em.close();
        }
    }

    public int getDatosAlmacenadosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<DatosAlmacenados> rt = cq.from(DatosAlmacenados.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
