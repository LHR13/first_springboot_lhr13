package com.lhr13.first_springboot_lhr13;

import com.lhr13.first_springboot_lhr13.service.HelloService;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FirstSpringbootLhr13ApplicationTests {

    @Autowired
    HelloService helloService;

    @Test
    public void contextLoads() {
        String hello = helloService.sayHello("LHR13");
        Assert.assertThat(hello, Matchers.is("hello LHR13 !"));
    }

}
