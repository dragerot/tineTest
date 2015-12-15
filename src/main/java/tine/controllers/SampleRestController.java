package tine.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tine.model.Customer;
import tine.model.Person;
import tine.services.CustomerService;
import tine.services.PersonService;

import java.util.List;

@RestController
@RequestMapping(value="/samplerest")
public class SampleRestController {

    @Autowired
    PersonService personService;
    @Autowired
    CustomerService customerService;

    @RequestMapping(value="/person/{id}", method= RequestMethod.GET,produces="application/json" )
    public Person getPerson(@PathVariable String id) {
         Person person=new Person("03086529520","Tore Gard");
         personService.getPerson(id);
          return personService.getPerson(id);
    }

    @RequestMapping(value="/persons", method=RequestMethod.GET,produces="application/json" )
    List<Person> findAllPersons() {
        return personService.findAll();
    }
//
//    @RequestMapping(value="/{user}", method=RequestMethod.DELETE)
//    public User deleteUser(@PathVariable Long user) {
//        // ...
//    }

    @RequestMapping(value="/customers", method=RequestMethod.GET,produces="application/json" )
    List<Customer> findAllCustomers() {
        return customerService.findAll();
    }
}
