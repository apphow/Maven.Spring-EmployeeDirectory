package io.zipcoder.persistenceapp.Services;

import io.zipcoder.persistenceapp.Controllers.EmployeeController;
import io.zipcoder.persistenceapp.models.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeControllerTest {

    @Mock
    private EmployeeServices employeeServices;

    @InjectMocks
    private EmployeeController employeeController;

    @Test
    public Iterable<Employee> findAll(){
       return null;
    }
}
