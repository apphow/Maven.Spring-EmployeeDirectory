package io.zipcoder.persistenceapp.Controllers;

import io.zipcoder.persistenceapp.Services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeServices employeeServices;

}
