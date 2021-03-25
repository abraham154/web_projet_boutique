/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs;

import com.mycompany.boutique1.ProduitAchete;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import service.ProduitAcheteService;

/**
 *
 * @author GNAWASSI
 */
@Path("/produit-achete")
public class ProduitAcheteResource {
     ProduitAcheteService produitAchete=new ProduitAcheteService();
    
    @GET
    @Path("{id}")
    public ProduitAchete trouver(@PathParam("id")Integer id ){
        return produitAchete.trouver(id);
    }
    public List<ProduitAchete> lister(@PathParam("debut")int debut, @PathParam("nombre")int nombre){
        return produitAchete.lister(debut, nombre);
    }
    public List<ProduitAchete> lister(){
        return produitAchete.lister();
    }
    
    @POST
    public void ajouter(@PathParam("e")ProduitAchete e){
        produitAchete.ajouter(e);
    }
    @PUT
    public void modifier(@PathParam("e")ProduitAchete e){
        produitAchete.modifier(e);
    }
    @DELETE
    @Path("{id}")
    public void supprimer(@PathParam("id")Integer id){
       produitAchete.supprimer(id);
    }
    public void supprimer(@PathParam("e")ProduitAchete e){
        produitAchete.supprimer(e);
    }
}
