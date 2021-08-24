package com.training.department.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "dept")
public class Dept implements Serializable {

    @Id
    @Column(name="deptid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer deptId;
    @Column(name="deptname")
    private String deptName;

    @JoinColumn(name="deptid", referencedColumnName="employeeid")
    @OneToMany(cascade={CascadeType.MERGE, CascadeType.PERSIST})

//    private List<Employees> employees;
//
//    public List<Employees> getEmployees() {
//        return employees;
//    }
//
//    public void setEmployees(List<Employees> employees) {
//        this.employees = employees;
//    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

//    public Dept(Integer deptId, String deptName) {
//        this.deptId = deptId;
//        this.deptName = deptName;
//    }
    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
