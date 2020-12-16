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
//    public Costumer updateCostumer(Long id) {
//        getCostumerById(id);
//        return costumerRepository.saveAndFlush(id)
//    }

    //delete
    public void deleteCustomerById(Long id) {
        customerRepository.deleteById(id);
    }

}
