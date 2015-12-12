package tine.repository;


import org.springframework.stereotype.Repository;
import tine.model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Repository
public class PersonDictionaryImpl implements PersonRepository {
    static List<Person> persons;

    PersonDictionaryImpl(){
        persons=cratePersonMock();
    }

    @Override
    public List<Person> findAll() {
        return persons;
    }

    @Override
    public Person getPerson(String ssn){

        class PersonPredicate implements Predicate<Person> {
            private String id;

            public PersonPredicate(String id){
                this.id=id;
            }

            @Override
            public boolean test(Person person) {
                return person.getId().equals(id);
            }

        }
        return persons.stream().filter(new PersonPredicate(ssn)).findFirst().get();
    }



    private static List<Person> cratePersonMock(){
        List<Person> personList= new ArrayList<Person>();
        personList.add(new Person("03086529520","Tore Gard"));
        personList.add(new Person("03086529521","Gitter"));
        personList.add(new Person("03086529522","Norla"));
        personList.add(new Person("0308652952e","Norlawewe"));
        return personList;
    }
}