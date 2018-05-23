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
@Table(name = "datosAlmacenados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatosAlmacenados.findAll", query = "SELECT d FROM DatosAlmacenados d"),
    @NamedQuery(name = "DatosAlmacenados.findByNumeroUno", query = "SELECT d FROM DatosAlmacenados d WHERE d.numeroUno = :numeroUno"),
    @NamedQuery(name = "DatosAlmacenados.findByNumeroDos", query = "SELECT d FROM DatosAlmacenados d WHERE d.numeroDos = :numeroDos"),
    @NamedQuery(name = "DatosAlmacenados.findByCadenaUno", query = "SELECT d FROM DatosAlmacenados d WHERE d.cadenaUno = :cadenaUno"),
    @NamedQuery(name = "DatosAlmacenados.findByCadenaDos", query = "SELECT d FROM DatosAlmacenados d WHERE d.cadenaDos = :cadenaDos")})
public class DatosAlmacenados implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "numeroUno")
    private Integer numeroUno;
    @Basic(optional = false)
    @Column(name = "numeroDos")
    private int numeroDos;
    @Basic(optional = false)
    @Column(name = "cadenaUno")
    private String cadenaUno;
    @Basic(optional = false)
    @Column(name = "cadenaDos")
    private String cadenaDos;

    public DatosAlmacenados() {
    }

    public DatosAlmacenados(Integer numeroUno) {
        this.numeroUno = numeroUno;
    }

    public DatosAlmacenados(Integer numeroUno, int numeroDos, String cadenaUno, String cadenaDos) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
        this.cadenaUno = cadenaUno;
        this.cadenaDos = cadenaDos;
    }

    public Integer getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(Integer numeroUno) {
        this.numeroUno = numeroUno;
    }

    public int getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(int numeroDos) {
        this.numeroDos = numeroDos;
    }

    public String getCadenaUno() {
        return cadenaUno;
    }

    public void setCadenaUno(String cadenaUno) {
        this.cadenaUno = cadenaUno;
    }

    public String getCadenaDos() {
        return cadenaDos;
    }

    public void setCadenaDos(String cadenaDos) {
        this.cadenaDos = cadenaDos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroUno != null ? numeroUno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatosAlmacenados)) {
            return false;
        }
        DatosAlmacenados other = (DatosAlmacenados) object;
        if ((this.numeroUno == null && other.numeroUno != null) || (this.numeroUno != null && !this.numeroUno.equals(other.numeroUno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tablas.DatosAlmacenados[ numeroUno=" + numeroUno + " ]";
    }
    
}
