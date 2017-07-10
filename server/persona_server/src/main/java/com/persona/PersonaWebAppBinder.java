package com.persona;

import com.persona.api.SampleApi;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

import javax.inject.Singleton;

public class PersonaWebAppBinder extends AbstractBinder {
    @Override
    protected void configure() {
        bind(SampleApi.class).in(Singleton.class);
    }
}
