package BD;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author romero
 */
@Entity
@Table(name = "Administrador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Administrador.findAll", query = "SELECT a FROM Administrador a"),
    @NamedQuery(name = "Administrador.findByADMlogin", query = "SELECT a FROM Administrador a WHERE a.aDMlogin = :aDMlogin"),
    @NamedQuery(name = "Administrador.findByADMsenha", query = "SELECT a FROM Administrador a WHERE a.aDMsenha = :aDMsenha")})
public class Administrador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ADM_login")
    private String aDMlogin;
    @Basic(optional = false)
    @Column(name = "ADM_senha")
    private String aDMsenha;

    public Administrador() {
    }

    public Administrador(String aDMlogin) {
        this.aDMlogin = aDMlogin;
    }

    public Administrador(String aDMlogin, String aDMsenha) {
        this.aDMlogin = aDMlogin;
        this.aDMsenha = aDMsenha;
    }

    public String getADMlogin() {
        return aDMlogin;
    }

    public void setADMlogin(String aDMlogin) {
        this.aDMlogin = aDMlogin;
    }

    public String getADMsenha() {
        return aDMsenha;
    }

    public void setADMsenha(String aDMsenha) {
        this.aDMsenha = aDMsenha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aDMlogin != null ? aDMlogin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administrador)) {
            return false;
        }
        Administrador other = (Administrador) object;
        if ((this.aDMlogin == null && other.aDMlogin != null) || (this.aDMlogin != null && !this.aDMlogin.equals(other.aDMlogin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BD.Administrador[ aDMlogin=" + aDMlogin + " ]";
    }
    
}
