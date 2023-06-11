package com.example.integrationtesting.configuration.beans;

import org.springframework.context.annotation.Bean;

public class BeanForTest {

    @Bean
    public String beanForTest(){
        return "Use on test only";
    }

}
