/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs;

import com.mycompany.boutique1.Client;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import service.ClientService;

/**
 *
 * @author GNAWASSI
 */
@Path("/client")
public class ClientResource {
     ClientService client=new ClientService();
    
    @GET
    @Path("{id}")
    public Client trouver(@PathParam("id")Integer id ){
        return client.trouver(id);
    }
    public List<Client> lister(@PathParam("debut")int debut, @PathParam("nombre")int nombre){
        return client.lister(debut, nombre);
    }
    public List<Client> lister(){
        return client.lister();
    }
    
    @POST
    public void ajouter(@PathParam("e")Client e){
        client.ajouter(e);
    }
    @PUT
    public void modifier(@PathParam("e")Client e){
        client.modifier(e);
    }
    @DELETE
    @Path("{id}")
    public void supprimer(@PathParam("id")Integer id){
        client.supprimer(id);
    }
    public void supprimer(@PathParam("e")Client e){
        client.supprimer(e);
    }
    
}
