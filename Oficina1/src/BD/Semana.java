/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author romero
 */
@Entity
@Table(name = "Semana")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Semana.findAll", query = "SELECT s FROM Semana s"),
    @NamedQuery(name = "Semana.findByAtividadeATid", query = "SELECT s FROM Semana s WHERE s.semanaPK.atividadeATid = :atividadeATid"),
    @NamedQuery(name = "Semana.findBySEdia", query = "SELECT s FROM Semana s WHERE s.semanaPK.sEdia = :sEdia")})
public class Semana implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SemanaPK semanaPK;
    @JoinColumn(name = "atividade_AT_id", referencedColumnName = "AT_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Atividade atividade;

    public Semana() {
    }

    public Semana(SemanaPK semanaPK) {
        this.semanaPK = semanaPK;
    }

    public Semana(int atividadeATid, int sEdia) {
        this.semanaPK = new SemanaPK(atividadeATid, sEdia);
    }

    public SemanaPK getSemanaPK() {
        return semanaPK;
    }

    public void setSemanaPK(SemanaPK semanaPK) {
        this.semanaPK = semanaPK;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (semanaPK != null ? semanaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Semana)) {
            return false;
        }
        Semana other = (Semana) object;
        if ((this.semanaPK == null && other.semanaPK != null) || (this.semanaPK != null && !this.semanaPK.equals(other.semanaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BD.Semana[ semanaPK=" + semanaPK + " ]";
    }
    
}
