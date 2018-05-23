/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mac
 */
@Entity
@Table(name = "cafeteria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cafeteria.findAll", query = "SELECT c FROM Cafeteria c"),
    @NamedQuery(name = "Cafeteria.findByIdCafeteria", query = "SELECT c FROM Cafeteria c WHERE c.idCafeteria = :idCafeteria"),
    @NamedQuery(name = "Cafeteria.findByArticulos", query = "SELECT c FROM Cafeteria c WHERE c.articulos = :articulos"),
    @NamedQuery(name = "Cafeteria.findByEstado", query = "SELECT c FROM Cafeteria c WHERE c.estado = :estado")})
public class Cafeteria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cafeteria")
    private Integer idCafeteria;
    @Basic(optional = false)
    @Column(name = "articulos")
    private String articulos;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;

    public Cafeteria() {
    }

    public Cafeteria(Integer idCafeteria) {
        this.idCafeteria = idCafeteria;
    }

    public Cafeteria(Integer idCafeteria, String articulos, String estado) {
        this.idCafeteria = idCafeteria;
        this.articulos = articulos;
        this.estado = estado;
    }

    public Integer getIdCafeteria() {
        return idCafeteria;
    }

    public void setIdCafeteria(Integer idCafeteria) {
        this.idCafeteria = idCafeteria;
    }

    public String getArticulos() {
        return articulos;
    }

    public void setArticulos(String articulos) {
        this.articulos = articulos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCafeteria != null ? idCafeteria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cafeteria)) {
            return false;
        }
        Cafeteria other = (Cafeteria) object;
        if ((this.idCafeteria == null && other.idCafeteria != null) || (this.idCafeteria != null && !this.idCafeteria.equals(other.idCafeteria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tablas.Cafeteria[ idCafeteria=" + idCafeteria + " ]";
    }
    
}
