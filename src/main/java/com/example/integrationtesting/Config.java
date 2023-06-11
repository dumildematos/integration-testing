package com.example.integrationtesting;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Config {

    @Bean
    @Profile("test")
    public EnviromentConfig forTest(){
        return new EnviromentConfig("I am in test!");
    }

    @Bean
    @Profile("!test")
    public EnviromentConfig forProduction(){
        return new EnviromentConfig("I am in Production");
    }
}
