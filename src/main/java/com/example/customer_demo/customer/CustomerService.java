package com.example.customer_demo.customer;//package com.javawhizz.App.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    public List<Customer> getCustomers() {
        return customerRepo.findAll();
    }
    public Customer save(Customer customer){
        return customerRepo.save(customer);
    }
}
