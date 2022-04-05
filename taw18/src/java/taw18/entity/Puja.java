/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taw18.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dani
 */
@Entity
@Table(name = "puja")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Puja.findAll", query = "SELECT p FROM Puja p"),
    @NamedQuery(name = "Puja.findByIdPuja", query = "SELECT p FROM Puja p WHERE p.idPuja = :idPuja"),
    @NamedQuery(name = "Puja.findByPujaActual", query = "SELECT p FROM Puja p WHERE p.pujaActual = :pujaActual"),
    @NamedQuery(name = "Puja.findByFechaPuja", query = "SELECT p FROM Puja p WHERE p.fechaPuja = :fechaPuja")})
public class Puja implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPuja")
    private Integer idPuja;
    @Basic(optional = false)
    @NotNull
    @Column(name = "puja_actual")
    private double pujaActual;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_puja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPuja;
    @JoinColumn(name = "Productos_ID", referencedColumnName = "idProductos")
    @ManyToOne(optional = false)
    private Productos productosID;
    @JoinColumn(name = "Comprador_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Usuario compradorID;

    public Puja() {
    }

    public Puja(Integer idPuja) {
        this.idPuja = idPuja;
    }

    public Puja(Integer idPuja, double pujaActual, Date fechaPuja) {
        this.idPuja = idPuja;
        this.pujaActual = pujaActual;
        this.fechaPuja = fechaPuja;
    }

    public Integer getIdPuja() {
        return idPuja;
    }

    public void setIdPuja(Integer idPuja) {
        this.idPuja = idPuja;
    }

    public double getPujaActual() {
        return pujaActual;
    }

    public void setPujaActual(double pujaActual) {
        this.pujaActual = pujaActual;
    }

    public Date getFechaPuja() {
        return fechaPuja;
    }

    public void setFechaPuja(Date fechaPuja) {
        this.fechaPuja = fechaPuja;
    }

    public Productos getProductosID() {
        return productosID;
    }

    public void setProductosID(Productos productosID) {
        this.productosID = productosID;
    }

    public Usuario getCompradorID() {
        return compradorID;
    }

    public void setCompradorID(Usuario compradorID) {
        this.compradorID = compradorID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPuja != null ? idPuja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Puja)) {
            return false;
        }
        Puja other = (Puja) object;
        if ((this.idPuja == null && other.idPuja != null) || (this.idPuja != null && !this.idPuja.equals(other.idPuja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "taw18.entity.Puja[ idPuja=" + idPuja + " ]";
    }
    
}
