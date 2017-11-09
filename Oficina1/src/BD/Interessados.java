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
@Table(name = "Interessados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Interessados.findAll", query = "SELECT i FROM Interessados i"),
    @NamedQuery(name = "Interessados.findByINTra", query = "SELECT i FROM Interessados i WHERE i.iNTra = :iNTra")})
public class Interessados implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "INT_ra")
    private Double iNTra;
    @ManyToMany(mappedBy = "interessadosCollection")
    private Collection<Atividade> atividadeCollection;
    @ManyToMany(mappedBy = "interessadosCollection")
    private Collection<Evento> eventoCollection;

    public Interessados() {
    }

    public Interessados(Double iNTra) {
        this.iNTra = iNTra;
    }

    public Double getINTra() {
        return iNTra;
    }

    public void setINTra(Double iNTra) {
        this.iNTra = iNTra;
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
        hash += (iNTra != null ? iNTra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Interessados)) {
            return false;
        }
        Interessados other = (Interessados) object;
        if ((this.iNTra == null && other.iNTra != null) || (this.iNTra != null && !this.iNTra.equals(other.iNTra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BD.Interessados[ iNTra=" + iNTra + " ]";
    }
    
}
