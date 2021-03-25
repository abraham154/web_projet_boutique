/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import service.CategorieService;
import com.mycompany.boutique1.Categorie;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;


/**
 *
 * @author GNAWASSI
 */
@Path("/categorie")
public class CategorieResource {
    CategorieService categorie=new CategorieService();
    
    @GET
    @Path("{id}")
    public Categorie trouver(@PathParam("id")Integer id ){
        return categorie.trouver(id);
    }
    public List<Categorie> lister(@PathParam("debut")int debut, @PathParam("nombre")int nombre){
        return categorie.lister(debut, nombre);
    }
    public List<Categorie> lister(){
        return categorie.lister();
    }
    
    @POST
    public void ajouter(@PathParam("e")Categorie e){
        categorie.ajouter(e);
    }
    @PUT
    public void modifier(@PathParam("e")Categorie e){
        categorie.modifier(e);
    }
    @DELETE
    @Path("{id}")
    public void supprimer(@PathParam("id")Integer id){
        categorie.supprimer(id);
    }
    public void supprimer(@PathParam("e")Categorie e){
        categorie.supprimer(e);
    }
    
}
