package com.training.department.controllers;

import com.training.department.entities.Employees;
import com.training.department.services.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping(path="/api/employee")
public class EmployeesController {

    @Autowired
    private EmployeesService employeesService;

    @GetMapping(path="/allemployees")
    public Collection<Employees> getAllEmployees() {
        return employeesService.getAllEmployees();
    }

    @GetMapping(path="{id}")
    @ResponseBody
    public Optional<Employees> getEmployeeById(@PathVariable Integer id) {
        return employeesService.getEmployeeById(id);
    }
}
