package com.knoldus.learning.service;

import com.knoldus.learning.entity.Employee;

public class LetsValidate_Employee_Service_Implement implements LetsValidate_EmployeeService {
    @Override
    public boolean validateEmployee(Employee e) {
        if(e.getId() <=0){
            return false;
        }
        return e.getName() != null && !e.getName().isEmpty();
    }
}
