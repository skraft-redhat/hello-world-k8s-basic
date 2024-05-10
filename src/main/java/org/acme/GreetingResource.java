package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello!"
        + "\this is version 1.1"
        + "\tI'm running in pod " + System.getenv("HOSTNAME")
        + "\tI'm reachable via " +System.getenv("KUBERNETES_SERVICE_HOST")
        + "\n";
    }
}
