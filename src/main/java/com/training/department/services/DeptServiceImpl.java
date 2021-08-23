package com.training.department.services;

import com.training.department.entities.Dept;
import com.training.department.repos.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.Optional;

@Service
@Transactional
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptRepository deptRepository;

    @Override
    public Collection<Dept> getAllDepts() {
        return deptRepository.findAll();
    }

    @Override
    public Optional<Dept> getDeptById(Integer id) {
        return deptRepository.findById(id);
    }
}
