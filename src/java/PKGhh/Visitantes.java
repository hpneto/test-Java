/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PKGhh;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Henrique
 */
@Entity
@Table(name = "visitantes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Visitantes.findAll", query = "SELECT v FROM Visitantes v")
    , @NamedQuery(name = "Visitantes.findByRg", query = "SELECT v FROM Visitantes v WHERE v.rg = :rg")
    , @NamedQuery(name = "Visitantes.findByNome", query = "SELECT v FROM Visitantes v WHERE v.nome = :nome")
    , @NamedQuery(name = "Visitantes.findByEmail", query = "SELECT v FROM Visitantes v WHERE v.email = :email")
    , @NamedQuery(name = "Visitantes.findByTelefone", query = "SELECT v FROM Visitantes v WHERE v.telefone = :telefone")
    , @NamedQuery(name = "Visitantes.findByCidade", query = "SELECT v FROM Visitantes v WHERE v.cidade = :cidade")
    , @NamedQuery(name = "Visitantes.findByDatainicial", query = "SELECT v FROM Visitantes v WHERE v.datainicial = :datainicial")
    , @NamedQuery(name = "Visitantes.findByDatafinal", query = "SELECT v FROM Visitantes v WHERE v.datafinal = :datafinal")})
public class Visitantes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "rg")
    private String rg;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nome")
    private String nome;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "email")
    private String email;
    @Size(max = 15)
    @Column(name = "telefone")
    private String telefone;
    @Size(max = 15)
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "datainicial")
    @Temporal(TemporalType.DATE)
    private Date datainicial;
    @Column(name = "datafinal")
    @Temporal(TemporalType.DATE)
    private Date datafinal;
    @Lob
    @Column(name = "foto")
    private byte[] foto;

    public Visitantes() {
    }

    public Visitantes(String rg) {
        this.rg = rg;
    }

    public Visitantes(String rg, String nome, String email) {
        this.rg = rg;
        this.nome = nome;
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Date getDatainicial() {
        return datainicial;
    }

    public void setDatainicial(Date datainicial) {
        this.datainicial = datainicial;
    }

    public Date getDatafinal() {
        return datafinal;
    }

    public void setDatafinal(Date datafinal) {
        this.datafinal = datafinal;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rg != null ? rg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Visitantes)) {
            return false;
        }
        Visitantes other = (Visitantes) object;
        if ((this.rg == null && other.rg != null) || (this.rg != null && !this.rg.equals(other.rg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PKGhh.Visitantes[ rg=" + rg + " ]";
    }
    
}
