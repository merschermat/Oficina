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
import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
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
@Table(name = "Atividade")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Atividade.findAll", query = "SELECT a FROM Atividade a"),
    @NamedQuery(name = "Atividade.findByATid", query = "SELECT a FROM Atividade a WHERE a.aTid = :aTid"),
    @NamedQuery(name = "Atividade.findByATnome", query = "SELECT a FROM Atividade a WHERE a.aTnome = :aTnome"),
    @NamedQuery(name = "Atividade.findByATdescricao", query = "SELECT a FROM Atividade a WHERE a.aTdescricao = :aTdescricao"),
    @NamedQuery(name = "Atividade.findByATdtinicial", query = "SELECT a FROM Atividade a WHERE a.aTdtinicial = :aTdtinicial"),
    @NamedQuery(name = "Atividade.findByATdtfinal", query = "SELECT a FROM Atividade a WHERE a.aTdtfinal = :aTdtfinal"),
    @NamedQuery(name = "Atividade.findByAThrinicial", query = "SELECT a FROM Atividade a WHERE a.aThrinicial = :aThrinicial"),
    @NamedQuery(name = "Atividade.findByAThrfinal", query = "SELECT a FROM Atividade a WHERE a.aThrfinal = :aThrfinal")})
public class Atividade implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "AT_id")
    private Integer aTid;
    @Basic(optional = false)
    @Column(name = "AT_nome")
    private String aTnome;
    @Column(name = "AT_descricao")
    private String aTdescricao;
    @Basic(optional = false)
    @Column(name = "AT_dt_inicial")
    @Temporal(TemporalType.DATE)
    private Date aTdtinicial;
    @Basic(optional = false)
    @Column(name = "AT_dt_final")
    @Temporal(TemporalType.DATE)
    private Date aTdtfinal;
    @Basic(optional = false)
    @Column(name = "AT_hr_inicial")
    @Temporal(TemporalType.TIME)
    private Date aThrinicial;
    @Basic(optional = false)
    @Column(name = "AT_hr_final")
    @Temporal(TemporalType.TIME)
    private Date aThrfinal;
    @JoinTable(name = "Atividade_no_Bloco", joinColumns = {
        @JoinColumn(name = "atividade_AT_id", referencedColumnName = "AT_id")}, inverseJoinColumns = {
        @JoinColumn(name = "bloco_BC_id", referencedColumnName = "BC_id")})
    @ManyToMany
    private Collection<Bloco> blocoCollection;
    @JoinTable(name = "Atividade_tem_Interessados", joinColumns = {
        @JoinColumn(name = "atvidade_AT_id", referencedColumnName = "AT_id")}, inverseJoinColumns = {
        @JoinColumn(name = "interessados_INT_ra", referencedColumnName = "INT_ra")})
    @ManyToMany
    private Collection<Interessados> interessadosCollection;
    @JoinTable(name = "Atividade_tem_TAG", joinColumns = {
        @JoinColumn(name = "atividade_AT_id", referencedColumnName = "AT_id")}, inverseJoinColumns = {
        @JoinColumn(name = "tag_TAG_id", referencedColumnName = "TAG_id")})
    @ManyToMany
    private Collection<Tag> tagCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "atividade")
    private Collection<Semana> semanaCollection;

    public Atividade() {
    }

    public Atividade(Integer aTid) {
        this.aTid = aTid;
    }

    public Atividade(Integer aTid, String aTnome, Date aTdtinicial, Date aTdtfinal, Date aThrinicial, Date aThrfinal) {
        this.aTid = aTid;
        this.aTnome = aTnome;
        this.aTdtinicial = aTdtinicial;
        this.aTdtfinal = aTdtfinal;
        this.aThrinicial = aThrinicial;
        this.aThrfinal = aThrfinal;
    }

    public Integer getATid() {
        return aTid;
    }

    public void setATid(Integer aTid) {
        this.aTid = aTid;
    }

    public String getATnome() {
        return aTnome;
    }

    public void setATnome(String aTnome) {
        this.aTnome = aTnome;
    }

    public String getATdescricao() {
        return aTdescricao;
    }

    public void setATdescricao(String aTdescricao) {
        this.aTdescricao = aTdescricao;
    }

    public Date getATdtinicial() {
        return aTdtinicial;
    }

    public void setATdtinicial(Date aTdtinicial) {
        this.aTdtinicial = aTdtinicial;
    }

    public Date getATdtfinal() {
        return aTdtfinal;
    }

    public void setATdtfinal(Date aTdtfinal) {
        this.aTdtfinal = aTdtfinal;
    }

    public Date getAThrinicial() {
        return aThrinicial;
    }

    public void setAThrinicial(Date aThrinicial) {
        this.aThrinicial = aThrinicial;
    }

    public Date getAThrfinal() {
        return aThrfinal;
    }

    public void setAThrfinal(Date aThrfinal) {
        this.aThrfinal = aThrfinal;
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

    @XmlTransient
    public Collection<Tag> getTagCollection() {
        return tagCollection;
    }

    public void setTagCollection(Collection<Tag> tagCollection) {
        this.tagCollection = tagCollection;
    }

    @XmlTransient
    public Collection<Semana> getSemanaCollection() {
        return semanaCollection;
    }

    public void setSemanaCollection(Collection<Semana> semanaCollection) {
        this.semanaCollection = semanaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aTid != null ? aTid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Atividade)) {
            return false;
        }
        Atividade other = (Atividade) object;
        if ((this.aTid == null && other.aTid != null) || (this.aTid != null && !this.aTid.equals(other.aTid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BD.Atividade[ aTid=" + aTid + " ]";
    }
    
}
