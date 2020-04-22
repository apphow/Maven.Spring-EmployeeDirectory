package io.zipcoder.persistenceapp.Services;

import io.zipcoder.persistenceapp.models.Employee;
import io.zipcoder.persistenceapp.repositories.EmployeeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class EmployeeServicesTest {

    @Mock
    EmployeeRepository employeeRepository;

    @InjectMocks
    EmployeeServices employeeServices;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findByEmployeeNumber() {
        Employee e = new Employee();
        employeeServices.create(e);
        e.setEmployeeNumber(2);

        when(employeeRepository.findByEmployeeNumber(2)).thenReturn(e);

        Assert.assertEquals(employeeServices.findByEmployeeNumber(2), e);
    }

    @Test
    public void findAll() {
        Employee e = new Employee();
        Employee e2 = new Employee();
        e.setEmployeeNumber(1);
        e2.setEmployeeNumber(2);
        employeeServices.create(e);
        employeeServices.create(e2);

        Iterable<Employee> employees1 = employeeRepository.findAll();
        when(employeeRepository.findAll()).thenReturn(employees1);

        Assert.assertEquals(employees1, employeeServices.findAll());
    }

    @Test
    public void create() {
        Employee e = new Employee(3, "Chelsea", "Bott", "Doctor", "415-228-7836", "che@gmail.com", "May 15, 2019", 33);
        Mockito.when(employeeRepository.findByEmployeeNumber(3)).thenReturn(e);
        Assert.assertEquals(e, employeeServices.findByEmployeeNumber(3));
    }

    @Test
    public void update() {
        int eid = 1;
        Employee e = new Employee();

        e.setEmail("me@gmail.com");

        when(employeeRepository.findByEmployeeNumber(eid)).thenReturn(e);

        Assert.assertEquals(e.getEmail(), "me@gmail.com");
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