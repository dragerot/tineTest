package tine.repository;


import org.springframework.stereotype.Repository;
import tine.model.Person;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonDictionaryImpl implements PersonRepository {

    @Override
    public List<Person> findAll() {
        return cratePersonMock();
    }

    private List<Person> cratePersonMock(){
        List<Person> personList= new ArrayList<Person>();
        personList.add(new Person("03086529520","Tore Gard"));
        personList.add(new Person("03086529521","Gitter"));
        personList.add(new Person("03086529522","Norla"));
        personList.add(new Person("0308652952e","Norlawewe"));
        return personList;
    }
}