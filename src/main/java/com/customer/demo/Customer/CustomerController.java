package com.customer.demo.Customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final static List<Customer> customer = List.of(
            new Customer(1,"SHIVRAJ","khaire","shivrajmkhaire@gmail,com"),
            new Customer(2,"rahul","karanjkar","rahul@gmail.com"),
            new Customer(2,"sahil","karanjkar","sahil@gmail.com")
    );

    @GetMapping
    public List<Customer> findAllCustomers(){
        return customer;
    }
}
