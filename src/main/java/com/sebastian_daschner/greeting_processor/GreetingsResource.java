package com.sebastian_daschner.greeting_processor;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("greetings")
public class GreetingsResource {

    @Inject
    @Config("PROCESSOR_GREETING")
    String greeting;

    @GET
    @Path("{name}")
    public String getGreeting(@PathParam("name") String name) {
        return greeting + ", " + name;
    }

}
