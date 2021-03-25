/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs;

import com.mycompany.boutique1.Employe;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import service.EmployeService;

/**
 *
 * @author GNAWASSI
 */
@Path("/employe")
public class EmployeResource {
     EmployeService employe=new EmployeService();
    
    @GET
    @Path("{id}")
    public Employe trouver(@PathParam("id")Integer id ){
        return employe.trouver(id);
    }
    public List<Employe> lister(@PathParam("debut")int debut, @PathParam("nombre")int nombre){
        return employe.lister(debut, nombre);
    }
    public List<Employe> lister(){
        return employe.lister();
    }
    
    @POST
    public void ajouter(@PathParam("e")Employe e){
        employe.ajouter(e);
    }
    @PUT
    public void modifier(@PathParam("e")Employe e){
        employe.modifier(e);
    }
    @DELETE
    @Path("{id}")
    public void supprimer(@PathParam("id")Integer id){
       employe.supprimer(id);
    }
    public void supprimer(@PathParam("e")Employe e){
        employe.supprimer(e);
    }
}
