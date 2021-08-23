package com.training.department.services;

import com.training.department.entities.Dept;


import java.util.Collection;
import java.util.Optional;

public interface DeptService {

    Collection<Dept> getAllDepts();
    Optional<Dept> getDeptById(Integer id);
}
