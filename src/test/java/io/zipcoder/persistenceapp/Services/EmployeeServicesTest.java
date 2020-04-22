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

import static org.mockito.Mockito.any;
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
        Employee e = new Employee(3, 3, "Chelsea", "Bott", "Doctor", "415-228-7836", "che@gmail.com", "May 15, 2019", 33);
        Mockito.when(employeeRepository.findByEmployeeNumber(3)).thenReturn(e);
        Assert.assertEquals(e, employeeServices.findByEmployeeNumber(3));
    }

    @Test
    public void update() {
        Employee e = new Employee(3, 3, "Chelsea", "Bott", "Doctor", "415-228-7836", "che@gmail.com", "May 15, 2019", 33);

        e.setLastName("Friar");

        Mockito.when(employeeRepository.findByEmployeeNumber(3)).thenReturn(e);
        Mockito.when(employeeRepository.save((Employee) any())).thenReturn(e);

        e = (Employee) employeeServices.update(3, e);
        Assert.assertEquals("Friar", e.getLastName());


    }


    @Test
    public void updateManager() {
        Employee e = new Employee();
        e.setEmployeeNumber(3);
        e.setManager("John Smith");

        Mockito.when(employeeRepository.findByEmployeeNumber(3)).thenReturn(e);
        Mockito.when(employeeRepository.save((Employee) any())).thenReturn(e);

        e = (Employee) employeeServices.updateManager(3,10);
        Assert.assertEquals("John Smith", e.getManager());

    }

    @Test
    public void updateTitle() {
        Employee e = new Employee();
        e.setEmployeeNumber(3);
        e.setTitle("Boss");
        e.setTitle("President");

        Mockito.when(employeeRepository.findByEmployeeNumber(3)).thenReturn(e);
        Mockito.when(employeeRepository.save((Employee) any())).thenReturn(e);

        e = (Employee) employeeServices.updateTitle(3, e.getTitle());
        Assert.assertEquals("President", e.getTitle());

    }
    @Test
    public void delete() {
        int employeeNumber = 10;
        Employee e = new Employee();
        e.setEmployeeNumber(employeeNumber);
        Mockito.when(employeeRepository.findByEmployeeNumber(employeeNumber)).thenReturn(e);
        Assert.assertEquals(e, employeeServices.delete(employeeNumber));
    }
}