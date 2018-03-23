package com.sudalover.rest;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.RequestContextFilter;

@Component
public class JerseyConfig extends ResourceConfig  {

    public JerseyConfig() {
        register(RequestContextFilter.class);

        register(UserRest.class);
    }
}
