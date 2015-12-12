package tine.services;


import tine.model.Person;

import java.util.List;


public interface PersonService {
    public List<Person> findAll();
    public Person getPerson(String ssn);
}
