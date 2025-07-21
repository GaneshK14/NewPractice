package com.practice.service;

import com.practice.entity.Employee;
import com.practice.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

    @Autowired
    EmployeeRepo empRepo;
    @Override
    public Employee saveEmp(Employee employee) {
        return empRepo.save(employee);
    }

    @Override
    public Optional<Employee> getEmpById(int id) {
        return empRepo.findById(id);
    }

    @Override
    public Employee updateEmployee(Employee emp) {
        return empRepo.save(emp);
    }

    @Override
    public void deleteEmp(int id) {
        empRepo.deleteById(id);
    }

    @Override
    public List<Employee> getEmployees() {
        return empRepo.findAll();
    }

}
