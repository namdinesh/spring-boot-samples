package com.example.springboottest;

import com.example.springboottest.model.Customer;
import com.example.springboottest.repository.CustomerRepository;
import com.example.springboottest.service.CustomerService;
import com.example.springboottest.service.CustomerServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class CustomerServiceMockTest {

    @Mock
    private CustomerRepository customerRepository;

    @InjectMocks
    private CustomerService customerService = new CustomerServiceImpl(customerRepository);

    @BeforeAll
    public void setMockOutput(){
        when(customerRepository.findAll()).thenReturn(List.of(new Customer(),new Customer(),new Customer()));
    }

    @DisplayName("Test Mock Customer Service")
    @Test
    public void testCustomer(){
        assertEquals(3,customerService.getAllCustomers().size());
    }


}
