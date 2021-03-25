/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.mycompany.boutique1.Personne;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GNAWASSI
 */
public class PersonneService {
     static List<Personne> list=new ArrayList<Personne>();
    public void  ajouter(Personne e){
        if(list.contains(e)){
            System.out.println("L'élément est déjà dans la liste");
    }
        else{
            list.add(e);
        }
    }
    public void modifier(Personne e){
        int id=list.indexOf(e);
        list.set(id, e);
    }
    public Personne trouver(Integer id){
        return list.get(id);
    }
   
    public void supprimer(Integer id){
        Personne e =list.get(id);
        if(list.contains(e)){
            list.remove(e);
        }    
    }
    public void supprimer(Personne e){
         if(list.contains(e)){
             list.remove(e);
         }
     }
    public List<Personne> lister(){
        return list;
    }
    public List<Personne>lister(int debut, int nombre){
        List<Personne> list1=new ArrayList<Personne>();
        for(int i=debut;i<=nombre;i++){
            Personne e = list.get(i);            
            list1.add(e);                  
        }
        return list1;
    }
   
}
