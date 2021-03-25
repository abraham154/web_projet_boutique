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
public class Employe extends Personne {
     private String cnss;
     private LocalDate dateEmbauche;

    public String getCnss() {
        return cnss;
    }

    public void setCnss(String cnss) {
        this.cnss = cnss;
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(LocalDate dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Employe other = (Employe) obj;
        if (!Objects.equals(this.cnss, other.cnss)) {
            return false;
        }
        if (!Objects.equals(this.dateEmbauche, other.dateEmbauche)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Employe{" + "cnss=" + cnss + ", dateEmbauche=" + dateEmbauche + '}';
    }
     
}
