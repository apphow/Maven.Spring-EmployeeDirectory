package io.zipcoder.persistenceapp.Services;

import io.zipcoder.persistenceapp.models.Employee;
import io.zipcoder.persistenceapp.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServicesTest {

    @Mock
    EmployeeRepository employeeRepository;

    @InjectMocks
    EmployeeServices employeeServices;

    @Test
    public void findByEmployeeNumber() {
        Employee e = new Employee();
        employeeServices.create(e);
        e.setEmployeeNumber(2);
    }

    @Test
    public void findAll() {
    }

    @Test
    public void create() {
    }

    @Test
    public void update() {
    }

    @Test
    public void updateManager() {
    }

    @Test
    public void updateTitle() {
    }

    @Test
    public void delete() {
    }
}