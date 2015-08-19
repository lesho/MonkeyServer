package com.monkeyserver.rest;

import com.monkeyserver.utils.ConfHolder;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/configuration")
public class ConfigurationService {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateConfig(ConfHolder config) {
        ConfHolder configuration = ConfHolder.getInstance();
        configuration.setConfiguration(config.getConfiguration());
        return Response.status(200).entity("Configuration saved: " + configuration.getConfiguration() + "\n").build();
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Response resetConfig(ConfHolder config) {
        ConfHolder configuration = ConfHolder.getInstance();
        configuration.resetDefaultConfig();
        return Response.status(200).entity("Configuration deleted\n").build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getConfig() {
        return Response.status(200).entity(ConfHolder.getInstance()).build();
    }
}
