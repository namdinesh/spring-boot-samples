package com.spring.boot.services;

import com.spring.boot.repository.HelloRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService{

    @Autowired
    private HelloRepositry helloRepositry;

    @Override
    public String getMessage() {
        return helloRepositry.getMessage();
    }
}
