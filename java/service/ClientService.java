/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.mycompany.boutique1.Client;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GNAWASSI
 */
public class ClientService {
     static List<Client> list=new ArrayList<Client>();
    public void  ajouter(Client e){
        if(list.contains(e)){
            System.out.println("L'élément est déjà dans la liste");
    }
        else{
            list.add(e);
        }
    }
    public void modifier(Client e){
        int id=list.indexOf(e);
        list.set(id, e);
    }
    public Client trouver(Integer id){
        return list.get(id);
    }
   
    public void supprimer(Integer id){
        Client e =list.get(id);
        if(list.contains(e)){
            list.remove(e);
        }    
    }
    public void supprimer(Client e){
         if(list.contains(e)){
             list.remove(e);
         }
     }
    public List<Client> lister(){
        return list;
    }
    public List<Client>lister(int debut, int nombre){
        List<Client> list1=new ArrayList<Client>();
        for(int i=debut;i<=nombre;i++){
            Client e = list.get(i);            
            list1.add(e);                  
        }
        return list1;
    }
   
    
}
