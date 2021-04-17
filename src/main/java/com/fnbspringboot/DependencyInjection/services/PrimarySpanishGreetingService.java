package com.fnbspringboot.DependencyInjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
/*
    Spring Profiles provide a way to segregate parts of your
    application configuration and make it only available in
    certain environments.
 */
@Primary
public class PrimarySpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Servicio de Saludo Primario";
    }
}
