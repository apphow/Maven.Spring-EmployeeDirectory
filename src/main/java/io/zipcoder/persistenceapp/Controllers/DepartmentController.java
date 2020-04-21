package io.zipcoder.persistenceapp.Controllers;

import io.zipcoder.persistenceapp.Services.DepartmentServices;
import io.zipcoder.persistenceapp.models.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DepartmentController {


    private DepartmentServices departmentService;

    @Autowired
    public DepartmentController(DepartmentServices departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/API/department")
    public ResponseEntity<Department> create(@RequestBody Department department) {
        return new ResponseEntity<Department>((Department) departmentService.create(department), HttpStatus.CREATED);
    }

    @PutMapping("/API/newDepartmentManagerUpdate")
    public ResponseEntity<Department> update(@PathVariable int departmentNumber, @RequestBody Department department) {
        return new ResponseEntity<Department>((Department) departmentService.update(department), HttpStatus.OK);
    }

    @PutMapping("/API/updateDepartmentName")
    public  ResponseEntity<Department> updateDepartmentName(@PathVariable int departmentNumber, @RequestBody String departmentName){
        return new ResponseEntity<Department>(departmentService.changeDepartmentName(departmentNumber, departmentName), HttpStatus.OK);
    }



}
