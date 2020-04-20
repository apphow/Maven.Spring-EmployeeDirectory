package io.zipcoder.persistenceapp.Controllers;

import io.zipcoder.persistenceapp.Services.DepartmentServices;
import io.zipcoder.persistenceapp.models.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/department")
public class DepartmentController {

    private DepartmentServices departmentService;

    @Autowired
    public DepartmentController(DepartmentServices departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/department")
    public ResponseEntity<Department> create(@RequestBody Department department) {
        return new ResponseEntity<Department>((Department) departmentService.create(department), HttpStatus.CREATED);
    }

}
