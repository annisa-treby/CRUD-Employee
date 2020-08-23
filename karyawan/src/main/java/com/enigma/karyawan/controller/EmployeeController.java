package com.enigma.karyawan.controller;

import com.enigma.karyawan.entity.Employee;
import com.enigma.karyawan.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @CrossOrigin
    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @CrossOrigin
    @GetMapping
    public Page<Employee> employees(@RequestParam(defaultValue = "0", value = "page") Integer page, @RequestParam(defaultValue = "100", value = "size") Integer size){
        Pageable pageable = PageRequest.of(page, size);
        return employeeService.getAllEmployee(pageable);
    }

    @CrossOrigin
    @RequestMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Integer id){
        return employeeService.getEmployeeById(id);
    }

    @CrossOrigin
    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Integer id){
        employeeService.deleteEmployee(id);
    }

    @CrossOrigin
    @GetMapping("/idNumber/{idNumber}")
    public Employee getEmployeeByIdNumber(@PathVariable Long idNumber){
        return employeeService.getEmployeeByIdNumber(idNumber);
    }
}
