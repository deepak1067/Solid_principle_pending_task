package com.knoldus.learning.service;

import com.knoldus.learning.entity.Employee;

public interface Save_Employee_Service {
    void saveEmployee(Employee employee);

    int getEmployeeCount();
}
