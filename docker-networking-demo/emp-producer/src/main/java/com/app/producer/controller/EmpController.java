package com.app.producer.controller;

import com.app.producer.domain.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {


    @GetMapping
    public List<Employee> getAllEmployees(){
        return List.of(new Employee("Rahul","1000","Noida"), new Employee("John","2000","USA"));
    }
}
