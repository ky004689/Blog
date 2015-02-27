/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Yo
 */
@Entity
@XmlRootElement
public class Utilisateur extends Personne implements Serializable {
  private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomUtilisateur; 
    private String motDePasse; 
    private UserStatus statutCompte; 
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date derniereConnexion; 
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Users[ id=" + id + " ]";
    }

    public Date getDerniereConnexion() {
        return derniereConnexion;
    }

    public void setDerniereConnexion(Date derniereConnexion) {
        this.derniereConnexion = derniereConnexion;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public UserStatus getStatutCompte() {
        return statutCompte;
    }

    public void setStatutCompte(UserStatus statutCompte) {
        this.statutCompte = statutCompte;
    }
    
}
