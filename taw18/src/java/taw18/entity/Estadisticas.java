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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dani
 */
@Entity
@Table(name = "estadisticas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estadisticas.findAll", query = "SELECT e FROM Estadisticas e"),
    @NamedQuery(name = "Estadisticas.findByIdEstadisticas", query = "SELECT e FROM Estadisticas e WHERE e.idEstadisticas = :idEstadisticas"),
    @NamedQuery(name = "Estadisticas.findByFiltro", query = "SELECT e FROM Estadisticas e WHERE e.filtro = :filtro"),
    @NamedQuery(name = "Estadisticas.findByOrden", query = "SELECT e FROM Estadisticas e WHERE e.orden = :orden"),
    @NamedQuery(name = "Estadisticas.findByFechaInicio", query = "SELECT e FROM Estadisticas e WHERE e.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "Estadisticas.findByFechaFin", query = "SELECT e FROM Estadisticas e WHERE e.fechaFin = :fechaFin")})
public class Estadisticas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEstadisticas")
    private Integer idEstadisticas;
    @Size(max = 45)
    @Column(name = "filtro")
    private String filtro;
    @Size(max = 45)
    @Column(name = "orden")
    private String orden;
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @JoinColumn(name = "Usuario_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Usuario usuarioID;

    public Estadisticas() {
    }

    public Estadisticas(Integer idEstadisticas) {
        this.idEstadisticas = idEstadisticas;
    }

    public Integer getIdEstadisticas() {
        return idEstadisticas;
    }

    public void setIdEstadisticas(Integer idEstadisticas) {
        this.idEstadisticas = idEstadisticas;
    }

    public String getFiltro() {
        return filtro;
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Usuario getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(Usuario usuarioID) {
        this.usuarioID = usuarioID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstadisticas != null ? idEstadisticas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadisticas)) {
            return false;
        }
        Estadisticas other = (Estadisticas) object;
        if ((this.idEstadisticas == null && other.idEstadisticas != null) || (this.idEstadisticas != null && !this.idEstadisticas.equals(other.idEstadisticas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "taw18.entity.Estadisticas[ idEstadisticas=" + idEstadisticas + " ]";
    }
    
}
