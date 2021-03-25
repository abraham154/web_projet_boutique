/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.mycompany.boutique1.Categorie;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GNAWASSI
 */
public class CategorieService {
    static List<Categorie> list=new ArrayList<Categorie>();
    public void  ajouter(Categorie e){
        if(list.contains(e)){
            System.out.println("L'élément est déjà dans la liste");
    }
        else{
            list.add(e);
        }
    }
    public void modifier(Categorie e){
        int id=list.indexOf(e);
        list.set(id, e);
    }
    public Categorie trouver(Integer id){
        return list.get(id);
    }
   
    public void supprimer(Integer id){
        Categorie e =list.get(id);
        if(list.contains(e)){
            list.remove(e);
        }    
    }
    public void supprimer(Categorie e){
         if(list.contains(e)){
             list.remove(e);
         }
     }
    public List<Categorie> lister(){
        return list;
    }
    public List<Categorie>lister(int debut, int nombre){
        List<Categorie> list1=new ArrayList<Categorie>();
        for(int i=debut;i<=nombre;i++){
            Categorie e = list.get(i);            
            list1.add(e);                  
        }
        return list1;
    }
    
}
