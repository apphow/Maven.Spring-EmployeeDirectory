package io.zipcoder.persistenceapp.models;

import javax.persistence.*;

//https://examples.javacodegeeks.com/enterprise-java/jpa/jpa-relationship-annotations-example/
//https://docs.oracle.com/javaee/6/api/javax/persistence/OneToMany.html
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeNumber;
    String firstName;
    String lastName;
    String title;
    String phoneNumber;
    String email;
    String hireDate;
    int managerId;


    @OneToOne
    private Employee manager;

    @ManyToOne
    private Department departmentNumber;
    private Object Manager;

    public Employee(int employeeNumber, int departmentNumber, String firstName, String lastName, String title, String phoneNumber, String email, String hireDate, int manger) {
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.hireDate = hireDate;
        this.managerId = manger;
    }

    public Employee(){
        managerId = 0;
    }

    public Employee(int managerId) {
        this.managerId = managerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getManager() { return (String) Manager; }

    public void setManager(String manager) {
        this.Manager = manager;
    }

    public int getManagerId() {
        return (int) getManagerId();
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public int getEmployeeNumber() {
        return (int) employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
}

