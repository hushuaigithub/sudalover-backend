package com.sudalover.rest;

import com.sudalover.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("/user")
public class UserRest  {

    @Autowired
    private UserService userService;

    @GET
    @Path("/test")
    public String test() {
        System.out.println("==================");
        return "hello world!" + userService.getUserInfo();
    }
}
