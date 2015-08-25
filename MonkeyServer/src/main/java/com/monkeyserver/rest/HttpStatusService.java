package com.monkeyserver.rest;

import com.monkeyserver.utils.ConfHolder;
import com.monkeyserver.utils.HttpCodes;
import com.monkeyserver.utils.HttpCodesMngr;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/status")
public class HttpStatusService {

    ConfHolder configuration = ConfHolder.getInstance();

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHttpStatuses() {
        HttpCodes httpCodes = new HttpCodes();
        return Response.status(200).entity(httpCodes).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMonkeyStatus() {
        HttpCodesMngr httpCodes = new HttpCodesMngr();
        int randomCode;

        if (configuration.getBoolean("assignedOnlyHttpCode")) {
            randomCode = httpCodes.getAssignedOnlyHttpCode();
        } else randomCode = httpCodes.getRandomCode();

        String statusMessage = httpCodes.getStatusMessage(randomCode);
        return Response.status(randomCode).entity(statusMessage).build();
    }

}
