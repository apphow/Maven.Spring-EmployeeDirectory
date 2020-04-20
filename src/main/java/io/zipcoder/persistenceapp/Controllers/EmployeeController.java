package io.zipcoder.persistenceapp.Controllers;

import io.zipcoder.persistenceapp.Services.EmployeeServices;
import io.zipcoder.persistenceapp.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private  EmployeeServices employeeService;

    @Autowired
    public EmployeeController(EmployeeServices employeeServices) {
        this.employeeService = employeeServices;
    }

    @PostMapping(value = "/employee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<Employee>((Employee) employeeService.create(employee), HttpStatus.CREATED);
    }
}
