package com.wuzy;

import com.wuzy.dubbo.entity.Person;
import com.wuzy.dubbo.service.PersonService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

public class ConsumerRunService {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        classPathXmlApplicationContext.start();
        PersonService personService = (PersonService) classPathXmlApplicationContext.getBean("personService");
        Scanner sc = new Scanner(System.in);
        while (true){
            String next = sc.next();
            Person person = personService.getPersonByName(next);
            if (person == null){
                System.out.println("null");
                continue;
            }
            System.out.println(person.toString());
            System.out.println("==============================");
            List<Person> people = personService.listPerson();
            for (Person p:
                 people) {
                System.out.println(p.toString());
            }
            System.out.println("======================");
        }
    }
}
