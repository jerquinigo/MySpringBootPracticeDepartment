package com.training.department.services;

import com.training.department.entities.Employees;
import com.training.department.repos.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.Optional;

@Service
@Transactional
public class EmployeesServiceImpl implements EmployeesService{

    @Autowired
    private EmployeesRepository employeesRepository;

    @Override
    public Collection<Employees> getAllEmployees() {
        return employeesRepository.findAll();
    }

    @Override
    public Optional<Employees> getEmployeeById(Integer id) {
        return employeesRepository.findById(id);
    }
}
