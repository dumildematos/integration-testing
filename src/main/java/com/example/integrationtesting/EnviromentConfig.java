package com.example.integrationtesting;

public class EnviromentConfig {

    private String somePhrase;

    public EnviromentConfig(String somePhrase){
        this.somePhrase = somePhrase;
    }

    public void someMethod() {
        System.out.println(somePhrase);
    }
}
