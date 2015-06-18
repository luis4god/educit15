/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.app.rest.crud;

import ar.com.educacionit.app.rest.crud.data.DataStore;
import ar.com.educacionit.app.rest.crud.model.Vino;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author rdurante
 */
@Path("vinos")
public class RecursoVinos {

    @GET
    @Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Vino> obtenerVinos() {
        return DataStore.obtenerVinos();
    }

    @GET
    @Path("{id}")
    @Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Vino obtenerVinoById(@PathParam("id") Long id) {
        if (id == null) {
            throw new WebApplicationException(Response.Status.BAD_REQUEST);
        }
        return DataStore.obtenerVino(id);
    }

    @DELETE
    @Path("{id}")
    public void removerVino(@PathParam("id") Long id) {
        DataStore.removerVino(id);
    }

    /*
     @DELETE
     @Path("{id}") 
     public Response removerVinoResponse(@PathParam("id") Long id){
     DataStore.removerVino(id);
     return Response.noContent().build();
     }*/
    @POST
    @Consumes(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Vino agregar(Vino vino) {
        return DataStore.agregarVino(vino);
    }

    @PUT
    @Path("{id}")
    @Consumes(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Vino actualizar(Vino vino) {
        System.out.println("******************");
        System.out.println("Actualizando vino");
        System.out.println("******************");
        
        DataStore.actualizarVino(vino);
        return vino;
    }

}
