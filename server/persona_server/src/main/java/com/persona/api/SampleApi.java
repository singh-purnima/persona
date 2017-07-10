package com.persona.api;

import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/api/sample")
@Produces(MediaType.APPLICATION_JSON)
public class SampleApi {

    @GET
    @Path("/status")
    @Produces(MediaType.APPLICATION_JSON)
    public String helloWorld() {
        return "My time is " + (new Date()).toString();
    }

    @GET
    @Path("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    public SampleResponse hello(@NotNull @QueryParam("name") String name) {
        return new SampleResponse("Hello " + name + "!!!");
    }


}
