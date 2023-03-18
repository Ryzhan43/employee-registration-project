package com.mryzhan.employeeregistrationproject.controller;

import com.mryzhan.employeeregistrationproject.bootstrap.DataGenerator;
import com.mryzhan.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/register")
    public String createEmployee(Model model) {

        model.addAttribute("states", DataGenerator.getAllStates());
        model.addAttribute("employee", new Employee());

        return "employee/employee-create";
    }
}
