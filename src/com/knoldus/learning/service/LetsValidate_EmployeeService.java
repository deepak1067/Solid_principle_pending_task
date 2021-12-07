package com.knoldus.learning.service;

import com.knoldus.learning.entity.Employee;

@FunctionalInterface
public interface LetsValidate_EmployeeService {
    boolean validateEmployee(Employee e);
}
