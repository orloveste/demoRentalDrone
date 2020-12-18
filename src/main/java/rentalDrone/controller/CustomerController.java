package rentalDrone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rentalDrone.model.Customer;
import rentalDrone.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    //create
    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }
    //get list db
    @RequestMapping(method = RequestMethod.GET)
    public List<Customer> findAllCustomers() {
        return customerService.getAllCunsomers();
    }

    //get endpoint
    @RequestMapping(value = "/id", method = RequestMethod.GET)
    public Customer findCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    //put - update
    /*@PutMapping({"/id"})
    public Customer updateCustomerById(@RequestBody Customer newCustomer, @PathVariable Long id) {
        return  customerService.updateCostumerById(id);
    }*/ //v1
    //   @PutMapping("/employees/{id}")
//  Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
//
//    return repository.findById(id)
//      .map(employee -> {
//        employee.setName(newEmployee.getName());
//        employee.setRole(newEmployee.getRole());
//        return repository.save(employee);
//      })
//      .orElseGet(() -> {
//        newEmployee.setId(id);
//        return repository.save(newEmployee);
//      });
//  }

    //delete
    @DeleteMapping
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void deleteCustomerById(Long id) {
        customerService.deleteCustomerById(id);
    }

}
