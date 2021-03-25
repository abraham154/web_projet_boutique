/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs;

import com.mycompany.boutique1.Personne;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import service.PersonneService;

/**
 *
 * @author GNAWASSI
 */
@Path("/personne")
public class PersnneResource {
     PersonneService personne=new PersonneService();
    
    @GET
    @Path("{id}")
    public Personne trouver(@PathParam("id")Integer id ){
        return personne.trouver(id);
    }
    public List<Personne> lister(@PathParam("debut")int debut, @PathParam("nombre")int nombre){
        return personne.lister(debut, nombre);
    }
    public List<Personne> lister(){
        return personne.lister();
    }
    
    @POST
    public void ajouter(@PathParam("e")Personne e){
        personne.ajouter(e);
    }
    @PUT
    public void modifier(@PathParam("e")Personne e){
        personne.modifier(e);
    }
    @DELETE
    @Path("{id}")
    public void supprimer(@PathParam("id")Integer id){
       personne.supprimer(id);
    }
    public void supprimer(@PathParam("e")Personne e){
        personne.supprimer(e);
    }
}
