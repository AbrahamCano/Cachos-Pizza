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
@Table(name = "pizzeria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pizzeria.findAll", query = "SELECT p FROM Pizzeria p"),
    @NamedQuery(name = "Pizzeria.findByIdPizzeria", query = "SELECT p FROM Pizzeria p WHERE p.idPizzeria = :idPizzeria"),
    @NamedQuery(name = "Pizzeria.findByArticulos", query = "SELECT p FROM Pizzeria p WHERE p.articulos = :articulos"),
    @NamedQuery(name = "Pizzeria.findByEstado", query = "SELECT p FROM Pizzeria p WHERE p.estado = :estado")})
public class Pizzeria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pizzeria")
    private Integer idPizzeria;
    @Basic(optional = false)
    @Column(name = "articulos")
    private String articulos;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;

    public Pizzeria() {
    }

    public Pizzeria(Integer idPizzeria) {
        this.idPizzeria = idPizzeria;
    }

    public Pizzeria(Integer idPizzeria, String articulos, String estado) {
        this.idPizzeria = idPizzeria;
        this.articulos = articulos;
        this.estado = estado;
    }

    public Integer getIdPizzeria() {
        return idPizzeria;
    }

    public void setIdPizzeria(Integer idPizzeria) {
        this.idPizzeria = idPizzeria;
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
        hash += (idPizzeria != null ? idPizzeria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pizzeria)) {
            return false;
        }
        Pizzeria other = (Pizzeria) object;
        if ((this.idPizzeria == null && other.idPizzeria != null) || (this.idPizzeria != null && !this.idPizzeria.equals(other.idPizzeria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tablas.Pizzeria[ idPizzeria=" + idPizzeria + " ]";
    }
    
}
