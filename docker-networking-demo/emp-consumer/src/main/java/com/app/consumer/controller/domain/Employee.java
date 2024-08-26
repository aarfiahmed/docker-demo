package com.app.consumer.controller.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Employee {
    String name;
    String salary;
    String address;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}