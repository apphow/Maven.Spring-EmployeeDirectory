package io.zipcoder.persistenceapp.Controllers;

import io.zipcoder.persistenceapp.Services.EmployeeServices;
import io.zipcoder.persistenceapp.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/API/employee")
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

    @PutMapping("/API/employee/{number}")
    public ResponseEntity<Employee> update(@PathVariable int number, @RequestBody Employee employee) {
        return new ResponseEntity<Employee>((Employee) employeeService.update(number, employee), HttpStatus.OK);
    }

    @PutMapping("/API/setManager")
    public ResponseEntity<Employee> updateManager(@PathVariable int employeeNumber, @RequestParam int managerId) {
        return new ResponseEntity<Employee>((Employee) employeeService.updateManager(employeeNumber, managerId), HttpStatus.OK);
    }

    @PutMapping("/API/updateTitle")
    public ResponseEntity<Employee> updateTitle(@PathVariable int employeeNumber, @RequestBody String title) {
        return new ResponseEntity<Employee>((Employee) employeeService.updateTitle(employeeNumber, title), HttpStatus.OK);
}

    @GetMapping("/employees")
    public List<Employee> findAll() { return (List<Employee>) employeeService.findAll();}


    @DeleteMapping("/employee/{number}")
    public ResponseEntity<Employee> delete(@PathVariable int number) {
        employeeService.delete(number);
        return ResponseEntity.ok().build();
    }
}
