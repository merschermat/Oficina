/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author romero
 */
@Entity
@Table(name = "Evento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Evento.findAll", query = "SELECT e FROM Evento e"),
    @NamedQuery(name = "Evento.findByEVid", query = "SELECT e FROM Evento e WHERE e.eVid = :eVid"),
    @NamedQuery(name = "Evento.findByEVnome", query = "SELECT e FROM Evento e WHERE e.eVnome = :eVnome"),
    @NamedQuery(name = "Evento.findByEVdescricao", query = "SELECT e FROM Evento e WHERE e.eVdescricao = :eVdescricao"),
    @NamedQuery(name = "Evento.findByEVdtinicial", query = "SELECT e FROM Evento e WHERE e.eVdtinicial = :eVdtinicial"),
    @NamedQuery(name = "Evento.findByEVdtfinal", query = "SELECT e FROM Evento e WHERE e.eVdtfinal = :eVdtfinal"),
    @NamedQuery(name = "Evento.findByEVhrinicial", query = "SELECT e FROM Evento e WHERE e.eVhrinicial = :eVhrinicial"),
    @NamedQuery(name = "Evento.findByEVhrfinal", query = "SELECT e FROM Evento e WHERE e.eVhrfinal = :eVhrfinal")})
public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "EV_id")
    private Integer eVid;
    @Basic(optional = false)
    @Column(name = "EV_nome")
    private String eVnome;
    @Column(name = "EV_descricao")
    private String eVdescricao;
    @Basic(optional = false)
    @Column(name = "EV_dt_inicial")
    @Temporal(TemporalType.DATE)
    private Date eVdtinicial;
    @Basic(optional = false)
    @Column(name = "EV_dt_final")
    @Temporal(TemporalType.DATE)
    private Date eVdtfinal;
    @Basic(optional = false)
    @Column(name = "EV_hr_inicial")
    @Temporal(TemporalType.TIME)
    private Date eVhrinicial;
    @Basic(optional = false)
    @Column(name = "EV_hr_final")
    @Temporal(TemporalType.TIME)
    private Date eVhrfinal;
    @JoinTable(name = "Evento_tem_TAG", joinColumns = {
        @JoinColumn(name = "evento_EV_id", referencedColumnName = "EV_id")}, inverseJoinColumns = {
        @JoinColumn(name = "tag_TAG_id", referencedColumnName = "TAG_id")})
    @ManyToMany
    private Collection<Tag> tagCollection;
    @ManyToMany(mappedBy = "eventoCollection")
    private Collection<Bloco> blocoCollection;
    @JoinTable(name = "Evento_tem_Interessados", joinColumns = {
        @JoinColumn(name = "evento_EV_id", referencedColumnName = "EV_id")}, inverseJoinColumns = {
        @JoinColumn(name = "interessados_INT_ra", referencedColumnName = "INT_ra")})
    @ManyToMany
    private Collection<Interessados> interessadosCollection;

    public Evento() {
    }

    public Evento(Integer eVid) {
        this.eVid = eVid;
    }

    public Evento(Integer eVid, String eVnome, Date eVdtinicial, Date eVdtfinal, Date eVhrinicial, Date eVhrfinal) {
        this.eVid = eVid;
        this.eVnome = eVnome;
        this.eVdtinicial = eVdtinicial;
        this.eVdtfinal = eVdtfinal;
        this.eVhrinicial = eVhrinicial;
        this.eVhrfinal = eVhrfinal;
    }

    public Integer getEVid() {
        return eVid;
    }

    public void setEVid(Integer eVid) {
        this.eVid = eVid;
    }

    public String getEVnome() {
        return eVnome;
    }

    public void setEVnome(String eVnome) {
        this.eVnome = eVnome;
    }

    public String getEVdescricao() {
        return eVdescricao;
    }

    public void setEVdescricao(String eVdescricao) {
        this.eVdescricao = eVdescricao;
    }

    public Date getEVdtinicial() {
        return eVdtinicial;
    }

    public void setEVdtinicial(Date eVdtinicial) {
        this.eVdtinicial = eVdtinicial;
    }

    public Date getEVdtfinal() {
        return eVdtfinal;
    }

    public void setEVdtfinal(Date eVdtfinal) {
        this.eVdtfinal = eVdtfinal;
    }

    public Date getEVhrinicial() {
        return eVhrinicial;
    }

    public void setEVhrinicial(Date eVhrinicial) {
        this.eVhrinicial = eVhrinicial;
    }

    public Date getEVhrfinal() {
        return eVhrfinal;
    }

    public void setEVhrfinal(Date eVhrfinal) {
        this.eVhrfinal = eVhrfinal;
    }

    @XmlTransient
    public Collection<Tag> getTagCollection() {
        return tagCollection;
    }

    public void setTagCollection(Collection<Tag> tagCollection) {
        this.tagCollection = tagCollection;
    }

    @XmlTransient
    public Collection<Bloco> getBlocoCollection() {
        return blocoCollection;
    }

    public void setBlocoCollection(Collection<Bloco> blocoCollection) {
        this.blocoCollection = blocoCollection;
    }

    @XmlTransient
    public Collection<Interessados> getInteressadosCollection() {
        return interessadosCollection;
    }

    public void setInteressadosCollection(Collection<Interessados> interessadosCollection) {
        this.interessadosCollection = interessadosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eVid != null ? eVid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evento)) {
            return false;
        }
        Evento other = (Evento) object;
        if ((this.eVid == null && other.eVid != null) || (this.eVid != null && !this.eVid.equals(other.eVid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BD.Evento[ eVid=" + eVid + " ]";
    }
    
}
