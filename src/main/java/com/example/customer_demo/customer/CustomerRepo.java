package com.example.customer_demo.customer;//package com.javawhizz.App.customer;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
    List<Customer> findAll();
}
