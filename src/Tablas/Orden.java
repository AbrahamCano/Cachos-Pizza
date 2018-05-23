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
@Table(name = "orden")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orden.findAll", query = "SELECT o FROM Orden o"),
    @NamedQuery(name = "Orden.findByIdOrden", query = "SELECT o FROM Orden o WHERE o.idOrden = :idOrden"),
    @NamedQuery(name = "Orden.findByOrdenDia", query = "SELECT o FROM Orden o WHERE o.ordenDia = :ordenDia"),
    @NamedQuery(name = "Orden.findByTotal", query = "SELECT o FROM Orden o WHERE o.total = :total"),
    @NamedQuery(name = "Orden.findByTotalC", query = "SELECT o FROM Orden o WHERE o.totalC = :totalC"),
    @NamedQuery(name = "Orden.findByTotalP", query = "SELECT o FROM Orden o WHERE o.totalP = :totalP"),
    @NamedQuery(name = "Orden.findByIdPersonal", query = "SELECT o FROM Orden o WHERE o.idPersonal = :idPersonal"),
    @NamedQuery(name = "Orden.findByIdCafeteria", query = "SELECT o FROM Orden o WHERE o.idCafeteria = :idCafeteria"),
    @NamedQuery(name = "Orden.findByIdPizzeria", query = "SELECT o FROM Orden o WHERE o.idPizzeria = :idPizzeria"),
    @NamedQuery(name = "Orden.findByDia", query = "SELECT o FROM Orden o WHERE o.dia = :dia"),
    @NamedQuery(name = "Orden.findByMes", query = "SELECT o FROM Orden o WHERE o.mes = :mes"),
    @NamedQuery(name = "Orden.findByAnio", query = "SELECT o FROM Orden o WHERE o.anio = :anio"),
    @NamedQuery(name = "Orden.findByHora", query = "SELECT o FROM Orden o WHERE o.hora = :hora")})
public class Orden implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_orden")
    private Integer idOrden;
    @Basic(optional = false)
    @Column(name = "ordenDia")
    private int ordenDia;
    @Basic(optional = false)
    @Column(name = "total")
    private int total;
    @Basic(optional = false)
    @Column(name = "totalC")
    private int totalC;
    @Basic(optional = false)
    @Column(name = "totalP")
    private int totalP;
    @Basic(optional = false)
    @Column(name = "id_personal")
    private int idPersonal;
    @Basic(optional = false)
    @Column(name = "id_cafeteria")
    private int idCafeteria;
    @Basic(optional = false)
    @Column(name = "id_pizzeria")
    private int idPizzeria;
    @Basic(optional = false)
    @Column(name = "dia")
    private int dia;
    @Basic(optional = false)
    @Column(name = "mes")
    private int mes;
    @Basic(optional = false)
    @Column(name = "anio")
    private int anio;
    @Basic(optional = false)
    @Column(name = "hora")
    private String hora;

    public Orden() {
    }

    public Orden(Integer idOrden) {
        this.idOrden = idOrden;
    }

    public Orden(Integer idOrden, int ordenDia, int total, int totalC, int totalP, int idPersonal, int idCafeteria, int idPizzeria, int dia, int mes, int anio, String hora) {
        this.idOrden = idOrden;
        this.ordenDia = ordenDia;
        this.total = total;
        this.totalC = totalC;
        this.totalP = totalP;
        this.idPersonal = idPersonal;
        this.idCafeteria = idCafeteria;
        this.idPizzeria = idPizzeria;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.hora = hora;
    }

    public Integer getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Integer idOrden) {
        this.idOrden = idOrden;
    }

    public int getOrdenDia() {
        return ordenDia;
    }

    public void setOrdenDia(int ordenDia) {
        this.ordenDia = ordenDia;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalC() {
        return totalC;
    }

    public void setTotalC(int totalC) {
        this.totalC = totalC;
    }

    public int getTotalP() {
        return totalP;
    }

    public void setTotalP(int totalP) {
        this.totalP = totalP;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public int getIdCafeteria() {
        return idCafeteria;
    }

    public void setIdCafeteria(int idCafeteria) {
        this.idCafeteria = idCafeteria;
    }

    public int getIdPizzeria() {
        return idPizzeria;
    }

    public void setIdPizzeria(int idPizzeria) {
        this.idPizzeria = idPizzeria;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrden != null ? idOrden.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orden)) {
            return false;
        }
        Orden other = (Orden) object;
        if ((this.idOrden == null && other.idOrden != null) || (this.idOrden != null && !this.idOrden.equals(other.idOrden))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tablas.Orden[ idOrden=" + idOrden + " ]";
    }
    
}
