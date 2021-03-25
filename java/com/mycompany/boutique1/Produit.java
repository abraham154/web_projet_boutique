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
public class Produit {
    private Long id;
    private String libelle;
    private double prixunitaire;
    private LocalDate datePeremption;
    private Categorie categorie;

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getPrixunitaire() {
        return prixunitaire;
    }

    public void setPrixunitaire(double prixunitaire) {
        this.prixunitaire = prixunitaire;
    }

    public LocalDate getDatePeremption() {
        return datePeremption;
    }

    public void setDatePeremption(LocalDate datePeremption) {
        this.datePeremption = datePeremption;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.id);
        hash = 17 * hash + Objects.hashCode(this.libelle);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.prixunitaire) ^ (Double.doubleToLongBits(this.prixunitaire) >>> 32));
        hash = 17 * hash + Objects.hashCode(this.datePeremption);
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
        final Produit other = (Produit) obj;
        if (Double.doubleToLongBits(this.prixunitaire) != Double.doubleToLongBits(other.prixunitaire)) {
            return false;
        }
        if (!Objects.equals(this.libelle, other.libelle)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.datePeremption, other.datePeremption)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", libelle=" + libelle + ", prixunitaire=" + prixunitaire + ", datePeremption=" + datePeremption + '}';
    }
    public boolean estPerime(){
        
        int jour=datePeremption.getDayOfMonth()-LocalDate.now().getDayOfMonth();
        int mois=datePeremption.getMonthValue()-LocalDate.now().getMonthValue();
        int annee=datePeremption.getYear()-LocalDate.now().getYear();
        if(jour<0&&mois<0&&annee<0){
            return false;
        }else{
            return true;
        }
        
    }
    public boolean estPerime(LocalDate ref){
        LocalDate ref1=ref;
        int jour=ref1.getDayOfMonth()-LocalDate.now().getDayOfMonth();
        int mois=ref1.getMonthValue()-LocalDate.now().getMonthValue();
        int annee=ref1.getYear()-LocalDate.now().getYear();
        if(jour<0&&mois<0&&annee<0){
            return false;
        }else{
            return true;
        }
    }
   
}
