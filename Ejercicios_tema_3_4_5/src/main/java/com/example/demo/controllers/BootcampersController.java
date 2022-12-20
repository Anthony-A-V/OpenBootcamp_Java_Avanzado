package com.example.demo.controllers;

import com.example.demo.models.Bootcamper;
import com.example.demo.services.BootcamperService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.util.List;

//curl -X POST localhost:8080/bootcampers -H "Content-Type: application/json" -d "{"""nombre""": """Anthony"""}" -D - -v
@Component
@Path("/")
public class BootcampersController {
    private final BootcamperService bootcamperService;

    public BootcampersController(BootcamperService bootcamperService) {
        this.bootcamperService = bootcamperService;

        this.bootcamperService.add(new Bootcamper("uno"));
        this.bootcamperService.add(new Bootcamper("dos"));
        this.bootcamperService.add(new Bootcamper("tres"));
        this.bootcamperService.add(new Bootcamper("cuatro"));
        this.bootcamperService.add(new Bootcamper("cinco"));
    }

    @GET
    @Path("/bootcampers")
    @Produces("application/json")
    public List<Bootcamper> listarTodos() {
        return bootcamperService.getAll();
    }

    @GET
    @Path("/bootcampers/{nombre}")
    @Produces("application/json")
    public Bootcamper listarUno(@PathParam("nombre") String nombre) {
        return bootcamperService.get(nombre);
    }

    @POST
    @Path("/bootcampers")
    @Produces("application/json")
    @Consumes("application/json")
    public Response meterBootcamper(Bootcamper bootcamper) {
        this.bootcamperService.add(bootcamper);

        return Response.created(
                URI.create("/bootcampers/" + bootcamper.getNombre())
        ).build();
    }

    @DELETE
    @Path("/bootcampers/{nombre}")
    @Produces("application/json")
    public String eliminarBootcamper(@PathParam("nombre") String nombre) {
        this.bootcamperService.remove(nombre);
        return "Eliminado correctamente";
    }
}