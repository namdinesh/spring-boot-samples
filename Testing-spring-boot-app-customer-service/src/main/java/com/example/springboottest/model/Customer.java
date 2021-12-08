package com.example.springboottest.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="customer")
public class Customer {
    @Id
    private Long id;
    private String name;
    private LocalDateTime dateOfJoin;
}
