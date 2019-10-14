package com.wuzy.dubbo.service.impl;

import com.wuzy.dubbo.entity.Person;
import com.wuzy.dubbo.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService
{

    List<Person> persons = new ArrayList<>();
    {
        Person p = new Person();
        p.setAge(25);
        p.setName("wuzy");
        p.setBirthday(new Date());
        Person p2 = new Person();
        p2.setAge(26);
        p2.setName("jzx");
        p2.setBirthday(new Date());
        persons.add(p);
        persons.add(p2);
    }
    @Override
    public Person getPersonByName(String name) {
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getName().equalsIgnoreCase(name)){
                return persons.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Person> listPerson() {
        return persons;
    }
}
