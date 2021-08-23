package com.training.department.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "dept")
public class Dept implements Serializable {

    @Id
    @Column(name="deptid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer deptId;
    @Column(name="deptname")
    private String deptName;

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

    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
