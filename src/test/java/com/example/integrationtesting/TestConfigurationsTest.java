package com.example.integrationtesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.integrationtesting.configuration.beans.*;
import org.springframework.context.annotation.Import;

@SpringBootTest(classes = {TestBean.class, BeanForTest.class})
@Import(TestConfs.class)
public class TestConfigurationsTest {

    @Autowired
    private TestBean testBean;

    @Autowired
    private BeanForTest beanForTest;

    @Autowired
    private String moreOneBean;

    @Test
    public void notRealBean(){
        Assertions.assertEquals("I am not a real Bean", testBean.someMethod());
    }

    @Test
    public void beanForTests(){
        Assertions.assertEquals("Use on test only", beanForTest.beanForTest());
    }

    @Test
    public void moreOneBean(){
        Assertions.assertEquals("More one bean for tests", moreOneBean);
    }

}
