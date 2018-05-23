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
@Table(name = "operaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Operaciones.findAll", query = "SELECT o FROM Operaciones o"),
    @NamedQuery(name = "Operaciones.findByIdOperaciones", query = "SELECT o FROM Operaciones o WHERE o.idOperaciones = :idOperaciones"),
    @NamedQuery(name = "Operaciones.findByAdmin", query = "SELECT o FROM Operaciones o WHERE o.admin = :admin"),
    @NamedQuery(name = "Operaciones.findByFecha", query = "SELECT o FROM Operaciones o WHERE o.fecha = :fecha"),
    @NamedQuery(name = "Operaciones.findByTipo", query = "SELECT o FROM Operaciones o WHERE o.tipo = :tipo")})
public class Operaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_operaciones")
    private Integer idOperaciones;
    @Basic(optional = false)
    @Column(name = "admin")
    private String admin;
    @Basic(optional = false)
    @Column(name = "fecha")
    private String fecha;
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;

    public Operaciones() {
    }

    public Operaciones(Integer idOperaciones) {
        this.idOperaciones = idOperaciones;
    }

    public Operaciones(Integer idOperaciones, String admin, String fecha, String tipo) {
        this.idOperaciones = idOperaciones;
        this.admin = admin;
        this.fecha = fecha;
        this.tipo = tipo;
    }

    public Integer getIdOperaciones() {
        return idOperaciones;
    }

    public void setIdOperaciones(Integer idOperaciones) {
        this.idOperaciones = idOperaciones;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOperaciones != null ? idOperaciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Operaciones)) {
            return false;
        }
        Operaciones other = (Operaciones) object;
        if ((this.idOperaciones == null && other.idOperaciones != null) || (this.idOperaciones != null && !this.idOperaciones.equals(other.idOperaciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tablas.Operaciones[ idOperaciones=" + idOperaciones + " ]";
    }
    
}
