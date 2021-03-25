/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.mycompany.boutique1.ProduitAchete;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GNAWASSI
 */
public class ProduitAcheteService {
     static List<ProduitAchete> list=new ArrayList<ProduitAchete>();
    public void  ajouter(ProduitAchete e){
        if(list.contains(e)){
            System.out.println("L'élément est déjà dans la liste");
    }
        else{
            list.add(e);
        }
    }
    public void modifier(ProduitAchete e){
        int id=list.indexOf(e);
        list.set(id, e);
    }
    public ProduitAchete trouver(Integer id){
        return list.get(id);
    }
   
    public void supprimer(Integer id){
        ProduitAchete e =list.get(id);
        if(list.contains(e)){
            list.remove(e);
        }    
    }
    public void supprimer(ProduitAchete e){
         if(list.contains(e)){
             list.remove(e);
         }
     }
    public List<ProduitAchete> lister(){
        return list;
    }
    public List<ProduitAchete>lister(int debut, int nombre){
        List<ProduitAchete> list1=new ArrayList<ProduitAchete>();
        for(int i=debut;i<=nombre;i++){
            ProduitAchete e = list.get(i);            
            list1.add(e);                  
        }
        return list1;
    }
   
    
}
