package com.wuzy.dubbo.service;

import com.wuzy.dubbo.entity.Person;

import java.util.List;

public interface PersonService {

    Person getPersonByName(String name);

    List<Person> listPerson();

}
