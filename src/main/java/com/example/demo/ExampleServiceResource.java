package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestHeader;

import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
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
    
    @POST
    @Path("/employees")
    public String enterEmployee(@NotNull @HeaderParam("name") String employee) throws Exception
    {
    	throw new Exception();
//    	return "okay";
    }
}
