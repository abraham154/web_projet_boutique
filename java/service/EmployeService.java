/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.mycompany.boutique1.Employe;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GNAWASSI
 */
public class EmployeService {
     static List<Employe> list=new ArrayList<Employe>();
    public void  ajouter(Employe e){
        if(list.contains(e)){
            System.out.println("L'élément est déjà dans la liste");
    }
        else{
            list.add(e);
        }
    }
    public void modifier(Employe e){
        int id=list.indexOf(e);
        list.set(id, e);
    }
    public Employe trouver(Integer id){
        return list.get(id);
    }
   
    public void supprimer(Integer id){
        Employe e =list.get(id);
        if(list.contains(e)){
            list.remove(e);
        }    
    }
    public void supprimer(Employe e){
         if(list.contains(e)){
             list.remove(e);
         }
     }
    public List<Employe> lister(){
        return list;
    }
    public List<Employe>lister(int debut, int nombre){
        List<Employe> list1=new ArrayList<Employe>();
        for(int i=debut;i<=nombre;i++){
           Employe e = list.get(i);            
            list1.add(e);                  
        }
        return list1;
    }
   
    
}
