/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.boutique1;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author GNAWASSI
 */
public class Achat {
    private Long id;
    private double remise=0;
    private LocalDate dateAchat;
    private Employe employe;
    private List <ProduitAchete> b;
    public Achat() {this.b=b; }
    public List<ProduitAchete> getList() {return(this.b);}
    public void remove(ProduitAchete b){this.remove(b);}
    public void add(ProduitAchete b){
        if(!this.b.contains(b)){
            this.b.add(b);
        }
    }
    public boolean contains(ProduitAchete b){
        if(this.b==b){
            return true;
        }else{
            return false;
        }
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Achat(Long id, LocalDate dateAchat, Employe employe) {
        this.id = id;
        this.dateAchat = dateAchat;
        this.employe = employe;
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public LocalDate getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(LocalDate dateAchat) {
        this.dateAchat = dateAchat;
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.dateAchat);
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
        final Achat other = (Achat) obj;
        if (Double.doubleToLongBits(this.remise) != Double.doubleToLongBits(other.remise)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dateAchat, other.dateAchat)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Achat{" + "id=" + id + ", remise=" + remise + ", dateAchat=" + dateAchat + '}';
    }
    public double getRemiseTotale(){
        for(int i =0; i<b.size();i++){
            return this.remise+=b.get(i).getRemise();
        }
        return 0;
    }
    public double getPrixTotal(){
        double prixTotal=0;
        for(int i=0;i<b.size();i++){
            prixTotal+=b.get(i).getPrixtotal();
            return prixTotal;
        }
        return 0;
    }

    public Achat getA() {
       return this;
    }
}
