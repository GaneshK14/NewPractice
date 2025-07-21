package com.practice.service;

import com.practice.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
    Employee saveEmp(Employee employee);

    Optional<Employee> getEmpById(int id);

    Employee updateEmployee(Employee emp);

    void deleteEmp(int id);

    List<Employee> getEmployees();
}
