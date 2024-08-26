package com.app.consumer.controller;


import com.app.consumer.EmpConsumerApplication;
import com.app.consumer.controller.domain.Employee;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("getAllEmp")
@Log
public class EmpConsumerController {


   private final RestTemplate template;

   @Autowired
    public EmpConsumerController(RestTemplateBuilder restTemplateBuilder){
        template= restTemplateBuilder.build();

    }

    @GetMapping
    public List<Employee> getAllEmp(){
        ResponseEntity<List> response = template.exchange("http://producer:8080/emp", HttpMethod.GET, null, List.class);
        log.info("resposne recived from emp producer "+response.getBody());

        return response.getBody();
    }
}
