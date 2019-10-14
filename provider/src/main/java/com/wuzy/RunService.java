package com.wuzy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class RunService {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.start();
        Object personService = applicationContext.getBean("personService");
        int read = System.in.read();
    }
}
