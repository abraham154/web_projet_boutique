/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.boutique1;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author GNAWASSI
 */
public class Personne {
     protected long id;
     protected String prenom;
     protected LocalDate dateNaissance;
     protected String nom;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
     
    @Override
    public String toString() {
        return "Personne{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 97 * hash + Objects.hashCode(this.nom);
        hash = 97 * hash + Objects.hashCode(this.prenom);
        hash = 97 * hash + Objects.hashCode(this.dateNaissance);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Personne other = (Personne) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
   
    
     public int getAge(){
       
        return LocalDate.now().getYear()-this.dateNaissance.getYear();
    }
 public int getAge(LocalDate ref){
       LocalDate ref1=ref;
        return LocalDate.now().getYear()-ref1.getYear();
    }
    
    
}
