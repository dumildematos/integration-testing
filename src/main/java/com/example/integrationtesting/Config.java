package com.example.integrationtesting;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public EnviromentConfig forTest(){
        return new EnviromentConfig("I am in test!");
    }

    @Bean
    public EnviromentConfig forProduction(){
        return new EnviromentConfig("I am in Production");
    }
}
