/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author romero
 */
@Embeddable
public class SemanaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "atividade_AT_id")
    private int atividadeATid;
    @Basic(optional = false)
    @Column(name = "SE_dia")
    private int sEdia;

    public SemanaPK() {
    }

    public SemanaPK(int atividadeATid, int sEdia) {
        this.atividadeATid = atividadeATid;
        this.sEdia = sEdia;
    }

    public int getAtividadeATid() {
        return atividadeATid;
    }

    public void setAtividadeATid(int atividadeATid) {
        this.atividadeATid = atividadeATid;
    }

    public int getSEdia() {
        return sEdia;
    }

    public void setSEdia(int sEdia) {
        this.sEdia = sEdia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) atividadeATid;
        hash += (int) sEdia;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SemanaPK)) {
            return false;
        }
        SemanaPK other = (SemanaPK) object;
        if (this.atividadeATid != other.atividadeATid) {
            return false;
        }
        if (this.sEdia != other.sEdia) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BD.SemanaPK[ atividadeATid=" + atividadeATid + ", sEdia=" + sEdia + " ]";
    }
    
}
