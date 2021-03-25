/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs;
import com.mycompany.boutique1.Produit;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import service.ProduitService;

/**
 *
 * @author GNAWASSI
 */
@Path("/produit")
public class ProduitResource {
     ProduitService produit=new ProduitService();
    
    @GET
    @Path("{id}")
    public Produit trouver(@PathParam("id")Integer id ){
        return produit.trouver(id);
    }
    public List<Produit> lister(@PathParam("debut")int debut, @PathParam("nombre")int nombre){
        return produit.lister(debut, nombre);
    }
    public List<Produit> lister(){
        return produit.lister();
    }
    
    @POST
    public void ajouter(@PathParam("e")Produit e){
        produit.ajouter(e);
    }
    @PUT
    public void modifier(@PathParam("e")Produit e){
        produit.modifier(e);
    }
    @DELETE
    @Path("{id}")
    public void supprimer(@PathParam("id")Integer id){
       produit.supprimer(id);
    }
    public void supprimer(@PathParam("e")Produit e){
        produit.supprimer(e);
    }
}
