/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.boutique1;

/**
 *
 * @author GNAWASSI
 */
public class ProduitAchete {
    private int quantite=1;
    private double remise=0;
    private Produit produit;
    private Achat achat;
    
    
    public Achat getAchat() {return this.achat;}
    public void setAchat(Achat achat){ 
        if(achat!=null && !achat.getA().contains(this)) { 
            if (this.achat != null) this.achat.remove(this);
            this.setAchat(achat);
            this.achat.getA().add(this);
        }
    }
    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
    
    public ProduitAchete() {
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }
    public double getPrixTotal(){
        return this.quantite*produit.getPrixunitaire()-this.remise;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.quantite;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.remise) ^ (Double.doubleToLongBits(this.remise) >>> 32));
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
        final ProduitAchete other = (ProduitAchete) obj;
        if (this.quantite != other.quantite) {
            return false;
        }
        if (Double.doubleToLongBits(this.remise) != Double.doubleToLongBits(other.remise)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProduitAchete{" + "quantite=" + quantite + ", remise=" + remise + '}';
    }
    public double getPrixtotal(){
        return 0;
    }

    public ProduitAchete getProduitAchete() {
        return this;
    }


    public ProduitAchete get() {
        return this;
    }
    public void remove(ProduitAchete c){this.remove(c);}
}
