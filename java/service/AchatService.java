/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.mycompany.boutique1.Achat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GNAWASSI
 */
public class AchatService {
     static List<Achat> list=new ArrayList<Achat>();
    public void  ajouter(Achat e){
        if(list.contains(e)){
            System.out.println("L'élément est déjà dans la liste");
    }
        else{
            list.add(e);
        }
    }
    public void modifier(Achat e){
        int id=list.indexOf(e);
        list.set(id, e);
    }
    public Achat trouver(Integer id){
        return list.get(id);
    }
   
    public void supprimer(Integer id){
        Achat e =list.get(id);
        if(list.contains(e)){
            list.remove(e);
        }    
    }
    public void supprimer(Achat e){
         if(list.contains(e)){
             list.remove(e);
         }
     }
    public List<Achat> lister(){
        return list;
    }
    public List<Achat>lister(int debut, int nombre){
        List<Achat> list1=new ArrayList<Achat>();
        for(int i=debut;i<=nombre;i++){
            Achat e = list.get(i);            
            list1.add(e);                  
        }
        return list1;
    }
   
    
}
