package com.training.department.controllers;


import com.training.department.entities.Dept;
import com.training.department.services.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping(path="/alldept")
    public Collection<Dept> getAllDepts() {
        return deptService.getAllDepts();
    }


    @GetMapping(path="{id}")
    @ResponseBody
    public Optional<Dept> getDeptById(@PathVariable Integer id) {
        return deptService.getDeptById(id);
    }
}
