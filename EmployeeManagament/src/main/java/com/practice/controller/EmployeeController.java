package com.practice.controller;

import com.practice.entity.Employee;
import com.practice.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    IEmployeeService employeeService;

    @PostMapping("/save")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        Employee emp = employeeService.saveEmp(employee);
        return new ResponseEntity<>(emp, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Employee>> getEmpById(@PathVariable int id){
        Optional<Employee> employee = employeeService.getEmpById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PatchMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp){
        Employee employee = employeeService.updateEmployee(emp);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmp(@PathVariable int id){
         employeeService.deleteEmp(id);
    }

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        List<Employee> empList = employeeService.getEmployees();
        return new ResponseEntity<>(empList, HttpStatus.OK);
    }
}
