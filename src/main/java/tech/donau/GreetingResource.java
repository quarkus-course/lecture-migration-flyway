package tech.donau;

import org.flywaydb.core.Flyway;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    Flyway flyway;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {

        return "hello " + flyway.info().current().getDescription();
    }
}