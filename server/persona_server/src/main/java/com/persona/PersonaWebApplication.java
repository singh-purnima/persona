package com.persona;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class PersonaWebApplication extends ResourceConfig {

    public PersonaWebApplication() {
        register(JacksonFeature.class);
        register(new PersonaWebAppBinder());
    }
}
