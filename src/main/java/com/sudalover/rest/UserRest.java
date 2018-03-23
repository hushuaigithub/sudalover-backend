package com.sudalover.rest;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("/user")
public class UserRest  {

    @GET
    @Path("/test")
    public String test() {
        System.out.println("==================");
        return "hello world!";
    }
}
