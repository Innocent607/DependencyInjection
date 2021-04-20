package com.fnbspringboot.DependencyInjection.services;

import com.fnbspringboot.DependencyInjection.repositories.GreetingRepository;
import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting(){
        return "Hello - Repository Greeting Service";
    }

    @Override
    public String getSpanishGreeting(){
        return "Servicio de Saludo Repositorio";
    }

    @Override
    public String getGermanGreeting(){
        return "Repositorer GruBdienst";
    }
}
