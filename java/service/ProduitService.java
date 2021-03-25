/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.mycompany.boutique1.Produit;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GNAWASSI
 */
public class ProduitService {
     static List<Produit> list=new ArrayList<Produit>();
    public void  ajouter(Produit e){
        if(list.contains(e)){
            System.out.println("L'élément est déjà dans la liste");
    }
        else{
            list.add(e);
        }
    }
    public void modifier(Produit e){
        int id=list.indexOf(e);
        list.set(id, e);
    }
    public Produit trouver(Integer id){
        return list.get(id);
    }
   
    public void supprimer(Integer id){
        Produit e =list.get(id);
        if(list.contains(e)){
            list.remove(e);
        }    
    }
    public void supprimer(Produit e){
         if(list.contains(e)){
             list.remove(e);
         }
     }
    public List<Produit> lister(){
        return list;
    }
    public List<Produit>lister(int debut, int nombre){
        List<Produit> list1=new ArrayList<Produit>();
        for(int i=debut;i<=nombre;i++){
            Produit e = list.get(i);            
            list1.add(e);                  
        }
        return list1;
    }
   
}
