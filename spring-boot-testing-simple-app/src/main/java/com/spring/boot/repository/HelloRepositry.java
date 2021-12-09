package com.spring.boot.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepositry {

    public String getMessage() {
        return "Simple Spring Boot Testing Application";
    }
}
