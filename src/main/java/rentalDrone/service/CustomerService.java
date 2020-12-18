package rentalDrone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentalDrone.model.Customer;
import rentalDrone.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {
    //injecting repository
    @Autowired
    CustomerRepository customerRepository;
    //create
    public Customer createCustomer(Customer newCustomer) {
        return customerRepository.saveAndFlush(newCustomer);
    }
    //findAll ak read
    public List<Customer> getAllCunsomers() {
        return customerRepository.findAll();
    }
    //find by id ak read
    public Customer getCustomerById(Long id) {
        return customerRepository.getOne(id);
    }

    //update ToDo research first - how to do this?

    /*public Customer updateCostumerById(Long id) {
        return customerRepository.findById(id).map(customer -> {
           customer.setCustomerName(;
           customer.
        });
    }*/ //v2
    /*public Customer updateCostumerById(Long id) {
        Customer updateCustomer = customerRepository.getOne(id).hashCode()

        return customerRepository.saveAndFlush(id);
    }*/ //v1
//      .map(employee -> {
//        employee.setName(newEmployee.getName());
//        employee.setRole(newEmployee.getRole());
//        return repository.save(employee);
//      })
//      .orElseGet(() -> {
//        newEmployee.setId(id);
//        return repository.save(newEmployee);
//      });

    //delete
    public void deleteCustomerById(Long id) {
        customerRepository.deleteById(id);
    }


}
