package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleServiceResource {

    @GET
    @Path("/service")
    public String getHelloWorld() {
        return "Hello World";
    }
}
