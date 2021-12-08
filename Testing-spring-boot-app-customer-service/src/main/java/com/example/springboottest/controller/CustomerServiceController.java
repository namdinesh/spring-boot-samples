package com.example.springboottest.controller;

import com.example.springboottest.model.Customer;
import com.example.springboottest.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class CustomerServiceController {

    private CustomerService customerService;

    @GetMapping
    @RequestMapping(name="/customers")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }


}
