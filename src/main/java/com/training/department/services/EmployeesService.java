package com.training.department.services;

import com.training.department.entities.Employees;

import java.util.Collection;
import java.util.Optional;

public interface EmployeesService {

    Collection<Employees> getAllEmployees();
    Optional<Employees> getEmployeeById(Integer id);
}
