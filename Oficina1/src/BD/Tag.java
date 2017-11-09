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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "TAG")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tag.findAll", query = "SELECT t FROM Tag t"),
    @NamedQuery(name = "Tag.findByTAGid", query = "SELECT t FROM Tag t WHERE t.tAGid = :tAGid"),
    @NamedQuery(name = "Tag.findByTAGnome", query = "SELECT t FROM Tag t WHERE t.tAGnome = :tAGnome")})
public class Tag implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TAG_id")
    private Integer tAGid;
    @Basic(optional = false)
    @Column(name = "TAG_nome")
    private String tAGnome;
    @ManyToMany(mappedBy = "tagCollection")
    private Collection<Atividade> atividadeCollection;
    @ManyToMany(mappedBy = "tagCollection")
    private Collection<Evento> eventoCollection;

    public Tag() {
    }

    public Tag(Integer tAGid) {
        this.tAGid = tAGid;
    }

    public Tag(Integer tAGid, String tAGnome) {
        this.tAGid = tAGid;
        this.tAGnome = tAGnome;
    }

    public Integer getTAGid() {
        return tAGid;
    }

    public void setTAGid(Integer tAGid) {
        this.tAGid = tAGid;
    }

    public String getTAGnome() {
        return tAGnome;
    }

    public void setTAGnome(String tAGnome) {
        this.tAGnome = tAGnome;
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
        hash += (tAGid != null ? tAGid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tag)) {
            return false;
        }
        Tag other = (Tag) object;
        if ((this.tAGid == null && other.tAGid != null) || (this.tAGid != null && !this.tAGid.equals(other.tAGid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BD.Tag[ tAGid=" + tAGid + " ]";
    }
    
}
