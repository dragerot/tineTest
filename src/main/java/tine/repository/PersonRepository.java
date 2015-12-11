package tine.repository;


import tine.model.Person;

import java.util.List;


public interface PersonRepository {
        public List<Person> findAll();
}
