
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Mauro
 */
@Entity
@Table(name = "image")
@NamedQueries({
    @NamedQuery(name = "Image.findAll", query = "SELECT i FROM Image i")
    , @NamedQuery(name = "Image.findById", query = "SELECT i FROM Image i WHERE i.id = :id")
    , @NamedQuery(name = "Image.findByTable", query = "SELECT i FROM Image i WHERE i.table = :table")
    , @NamedQuery(name = "Image.findByUrl", query = "SELECT i FROM Image i WHERE i.url = :url")
    , @NamedQuery(name = "Image.findByIdref", query = "SELECT i FROM Image i WHERE i.idref = :idref")})
public class Image implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "table")
    private int table;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "url")
    private String url;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_ref")
    private int idref;

    public Image() {
    }

    public Image(Integer id) {
        this.id = id;
    }

    public Image(Integer id, int table, String url, int idref) {
        this.id = id;
        this.table = table;
        this.url = url;
        this.idref = idref;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTable() {
        return table;
    }

    public void setTable(int table) {
        this.table = table;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getIdref() {
        return idref;
    }

    public void setIdref(int idref) {
        this.idref = idref;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Image)) {
            return false;
        }
        Image other = (Image) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Image[ id=" + id + " ]";
    }
    
}
