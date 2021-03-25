/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.boutique1;

import java.util.Objects;

/**
 *
 * @author GNAWASSI
 */
public class Client extends Personne{
      private String carteVisa;

    public String getCarteVisa() {
        return carteVisa;
    }

    public void setCarteVisa(String carteVisa) {
        this.carteVisa = carteVisa;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.carteVisa);
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
        final Client other = (Client) obj;
        if (!Objects.equals(this.carteVisa, other.carteVisa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Client{" + "carteVisa=" + carteVisa + '}';
    }
      
    
}
