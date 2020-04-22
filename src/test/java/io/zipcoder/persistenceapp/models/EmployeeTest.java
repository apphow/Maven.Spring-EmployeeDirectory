package io.zipcoder.persistenceapp.models;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

    Employee employee = new Employee();

    @Before
    public void setUp() {
        employee.setLastName("Smith");
        employee.setFirstName("Parker");
        employee.setEmployeeNumber(10);
        employee.setManager("John Smith");
        employee.setTitle("Project Manager");
        employee.setHireDate("May 30, 2019");
        employee.setManagerId(8);
        employee.setPhoneNumber("415-228-7836");
        employee.setEmail("me@gmail.com");

    }

    @Test
    public void getFirstName() {
        Assert.assertEquals("Parker", employee.getFirstName());
    }

    @Test
    public void setFirstName() {
        employee.setFirstName("Parker");
        Assert.assertEquals("Parker", employee.getFirstName());
    }

    @Test
    public void getLastName() { Assert.assertEquals("Smith", employee.getLastName());
    }

    @Test
    public void setLastName() {
        employee.setLastName("Smith");
        Assert.assertEquals("Smith", employee.getLastName());
    }

    @Test
    public void getTitle() {
        Assert.assertEquals("Project Manager", employee.getTitle());
    }

    @Test
    public void setTitle() {
        employee.setTitle("Project Manager");
        Assert.assertEquals("Project Manager", employee.getTitle());
    }

    @Test
    public void getPhoneNumber() {
        Assert.assertEquals("415-228-7836", employee.getPhoneNumber());
    }

    @Test
    public void setPhoneNumber() {
        employee.setPhoneNumber("415-228-7836");
        Assert.assertEquals("415-228-7836", employee.getPhoneNumber());
    }

    @Test
    public void getEmail() {
        Assert.assertEquals("me@gmail.com", employee.getEmail());
    }

    @Test
    public void setEmail() {
        employee.setEmail("me@gmail.com");
        Assert.assertEquals("me@gmail.com", employee.getEmail());
    }

    @Test
    public void getHireDate() {
        Assert.assertEquals("May 30, 2019", employee.getHireDate());
    }

    @Test
    public void setHireDate() {
        employee.setHireDate("May 15, 2019");
        Assert.assertEquals("May 15, 2019", employee.getHireDate());
    }

    @Test
    public void getManager() {
        Assert.assertEquals("John Smith", employee.getManager());
    }

    @Test
    public void setManager() {
        employee.setManager("John Smith");
        Assert.assertEquals("John Smith", employee.getManager());
    }

    @Test
    public void getEmployeeNumber() {
        Assert.assertEquals(10, employee.getEmployeeNumber());
    }

    @Test
    public void setEmployeeNumber() {
        employee.setEmployeeNumber(88);
        Assert.assertEquals(88, employee.getEmployeeNumber());
    }
}