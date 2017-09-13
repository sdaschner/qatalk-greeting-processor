package com.sebastian_daschner.greeting_processor;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class ConfigurationExposer {

    @Produces
    @Config("")
    public String exposeConfig(InjectionPoint injectionPoint) {
        Config config = injectionPoint.getAnnotated().getAnnotation(Config.class);
        return System.getenv(config.value());
    }

}
