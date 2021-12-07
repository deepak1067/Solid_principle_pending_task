package com.knoldus.learning.controller;

import com.knoldus.learning.entity.Employee;
import com.knoldus.learning.service.Save_Employee_Service;
import com.knoldus.learning.service.Save_Employee_Service_Implement;
import com.knoldus.learning.service.LetsValidate_EmployeeService;
import com.knoldus.learning.service.LetsValidate_Employee_Service_Implement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeControllerApplication {

    public static void main(String[] a) {
        LetsValidate_EmployeeService validateEmployeeService = new LetsValidate_Employee_Service_Implement();
        Save_Employee_Service save_emplservice = new Save_Employee_Service_Implement();
        List<Employee> employeeList = new ArrayList<>();

        //remove below for loop and
        // read data from emplName.csv, csv have id, and name in each row.
        // focus on Functional Interface and mark them Functional if it is.
        // focus on Single responsibility principle.
        // -1,Jiten
        // 2,Ram

//        loop has been replaced by csv file
        File newfile = new File("src/com/knoldus/learning/controller/emplName.csv");

        String line;
        try {
            FileReader f1 = new FileReader(newfile);
            BufferedReader br = new BufferedReader(f1);
            while ((line = br.readLine()) != null) {

                String[] attributes = line.split(",");

                Employee employee = new Employee(Integer.parseInt(attributes[0]), attributes[1]);
                employeeList.add(employee);
            }

            System.out.println("Total employee size  :  " + employeeList.size());

            //employeeList iterate and call validate service, then save.
            for (Employee emp : employeeList) {
                if (validateEmployeeService.validateEmployee(emp))
                    save_emplservice.saveEmployee(emp);

            }
//       Now error removed
                System.out.println("Saved employee  : " + save_emplservice.getEmployeeCount());
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    }
