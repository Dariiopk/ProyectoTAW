/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taw18.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Dani
 */
@Embeddable
public class GrupoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idGrupo")
    private int idGrupo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Usuario_ID")
    private int usuarioID;

    public GrupoPK() {
    }

    public GrupoPK(int idGrupo, int usuarioID) {
        this.idGrupo = idGrupo;
        this.usuarioID = usuarioID;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public int getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(int usuarioID) {
        this.usuarioID = usuarioID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idGrupo;
        hash += (int) usuarioID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GrupoPK)) {
            return false;
        }
        GrupoPK other = (GrupoPK) object;
        if (this.idGrupo != other.idGrupo) {
            return false;
        }
        if (this.usuarioID != other.usuarioID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "taw18.entity.GrupoPK[ idGrupo=" + idGrupo + ", usuarioID=" + usuarioID + " ]";
    }
    
}
