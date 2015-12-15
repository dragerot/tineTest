package tine.services;




import tine.model.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> findAll();
    List<Customer> findByLastName(String lastName);
}
