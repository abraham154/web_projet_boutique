/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs;

import com.mycompany.boutique1.Achat;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import service.AchatService;

/**
 *
 * @author GNAWASSI
 */
@Path("/achat")
public class AchatResource {
     AchatService achat=new AchatService();
    
    @GET
    @Path("{id}")
    public Achat trouver(@PathParam("id")Integer id ){
        return achat.trouver(id);
    }
    public List<Achat> lister(@PathParam("debut")int debut, @PathParam("nombre")int nombre){
        return achat.lister(debut, nombre);
    }
    public List<Achat> lister(){
        return achat.lister();
    }
    
    @POST
    public void ajouter(@PathParam("e")Achat e){
        achat.ajouter(e);
    }
    @PUT
    public void modifier(@PathParam("e")Achat e){
        achat.modifier(e);
    }
    @DELETE
    @Path("{id}")
    public void supprimer(@PathParam("id")Integer id){
        achat.supprimer(id);
    }
    public void supprimer(@PathParam("e")Achat e){
        achat.supprimer(e);
    }
    
}
