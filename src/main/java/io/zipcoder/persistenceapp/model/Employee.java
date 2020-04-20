package io.zipcoder.persistenceapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    int departmentNumber;
    int number;
    String firstName;
    String lastName;
    String title;
    String phoneNumber;
    String email;
    String hireDate;
    String Manger;

    public Employee() {
    }

    public Employee(int departmentNumber, int number, String firstName, String lastName, String title, String phoneNumber, String email, String hireDate, String manger) {
        this.departmentNumber = departmentNumber;
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.hireDate = hireDate;
        Manger = manger;
    }
}

