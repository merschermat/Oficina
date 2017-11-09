/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author romero
 */
@Entity
@Table(name = "Bloco")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bloco.findAll", query = "SELECT b FROM Bloco b"),
    @NamedQuery(name = "Bloco.findByBCid", query = "SELECT b FROM Bloco b WHERE b.bCid = :bCid"),
    @NamedQuery(name = "Bloco.findByBCsala", query = "SELECT b FROM Bloco b WHERE b.bCsala = :bCsala")})
public class Bloco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BC_id")
    private String bCid;
    @Basic(optional = false)
    @Column(name = "BC_sala")
    private String bCsala;
    @ManyToMany(mappedBy = "blocoCollection")
    private Collection<Atividade> atividadeCollection;
    @JoinTable(name = "Evento_no_Bloco", joinColumns = {
        @JoinColumn(name = "bloco_BC_id", referencedColumnName = "BC_id")}, inverseJoinColumns = {
        @JoinColumn(name = "evento_EV_id", referencedColumnName = "EV_id")})
    @ManyToMany
    private Collection<Evento> eventoCollection;

    public Bloco() {
    }

    public Bloco(String bCid) {
        this.bCid = bCid;
    }

    public Bloco(String bCid, String bCsala) {
        this.bCid = bCid;
        this.bCsala = bCsala;
    }

    public String getBCid() {
        return bCid;
    }

    public void setBCid(String bCid) {
        this.bCid = bCid;
    }

    public String getBCsala() {
        return bCsala;
    }

    public void setBCsala(String bCsala) {
        this.bCsala = bCsala;
    }

    @XmlTransient
    public Collection<Atividade> getAtividadeCollection() {
        return atividadeCollection;
    }

    public void setAtividadeCollection(Collection<Atividade> atividadeCollection) {
        this.atividadeCollection = atividadeCollection;
    }

    @XmlTransient
    public Collection<Evento> getEventoCollection() {
        return eventoCollection;
    }

    public void setEventoCollection(Collection<Evento> eventoCollection) {
        this.eventoCollection = eventoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bCid != null ? bCid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bloco)) {
            return false;
        }
        Bloco other = (Bloco) object;
        if ((this.bCid == null && other.bCid != null) || (this.bCid != null && !this.bCid.equals(other.bCid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BD.Bloco[ bCid=" + bCid + " ]";
    }
    
}
