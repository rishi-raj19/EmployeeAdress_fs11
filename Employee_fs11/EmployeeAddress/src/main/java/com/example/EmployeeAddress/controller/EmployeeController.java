package com.example.EmployeeAddress.controller;

import com.example.EmployeeAddress.model.Address;
import com.example.EmployeeAddress.model.Employee;
import com.example.EmployeeAddress.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("employee")
    public Iterable<Employee> getAllEmployees()
    {
        return employeeService.getAllEmployees();
    }

    @GetMapping("employeewithid")
    public Employee getEmployeebyid(@RequestParam("id") Long employeeId)
    {
        return employeeService.getEmployeebyid(employeeId);
    }

    @PostMapping("employee")
    public String addEmployee(@RequestBody @Valid Employee employee)
    {
        return employeeService.addEmployee(employee);
    }

//    @PostMapping("employee")
//    public String addEmployee(@RequestBody @Valid List<Employee> employee
//    {
//        return employeeService.addEmployee(employee);
//    }

    @PutMapping("employe")

    public String UpdateEmployeet (@RequestParam Long employeeId, @RequestParam String contact)
    {
        return employeeService.UpdateEmployee (employeeId,contact);
    }
    @DeleteMapping("employee")

    public String DeleteEmployee(@RequestParam("id") Long employeeId)
    {
        return employeeService.DeleteEmployee(employeeId);
    }

}
