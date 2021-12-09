package com.spring.boot;

import com.spring.boot.repository.HelloRepositry;
import com.spring.boot.services.HelloService;
import com.spring.boot.services.HelloServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class HelloServiceMockTest {
    @Mock
    private HelloRepositry helloRepositry;

    @InjectMocks
    private HelloService helloService = new HelloServiceImpl();

    @BeforeEach
    void setupMockOutput(){
        when(helloRepositry.getMessage()).thenReturn("Simple Spring Boot Testing Application");
    }

    @DisplayName("Test Mocking Hello Service")
    @Test
    void testMessage(){
        assertEquals("Simple Spring Boot Testing Application",helloService.getMessage());
    }
}
