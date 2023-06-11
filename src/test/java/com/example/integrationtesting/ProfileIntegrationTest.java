package com.example.integrationtesting;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test2")
public class ProfileIntegrationTest {
    @Autowired
    private EnviromentConfig enviromentConfig;

    @Test
    void test(){
        enviromentConfig.someMethod();
    }
}
