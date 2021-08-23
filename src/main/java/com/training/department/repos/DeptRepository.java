package com.training.department.repos;

import com.training.department.entities.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface DeptRepository extends JpaRepository<Dept, Integer> {

}
