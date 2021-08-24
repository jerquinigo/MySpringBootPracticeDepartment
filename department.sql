DROP DATABASE IF EXISTS department;
CREATE DATABASE department;
use department;

CREATE TABLE dept(
deptId INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
deptName VARCHAR(200)
);

CREATE TABLE employees(
employeeId INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
firstName VARCHAR(200),
lastName VARCHAR(200),
deptId INT NOT NULL,
FOREIGN KEY (deptId) REFERENCES dept(deptId)
);

INSERT INTO dept (deptId, deptName) values(1, "frontend team");

INSERT INTO employees (employeeId, firstName, lastName, deptId) values(1, "Jonathan", "E", 1);
INSERT INTO employees (employeeId, firstName, lastName, deptId)  values(2, "David", "Raul", 1);

select * from employees;