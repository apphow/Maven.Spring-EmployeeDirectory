package io.zipcoder.persistenceapp.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Department implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int departmentNumber;
    String departmentName;
    String departmentManager;

    //Unidirectional. Employee has a ManyToOne relationship with the Deprment

    public Department() {
    }

    @JsonIgnore
    @OneToMany(mappedBy = "department")
    private Collection<Employee> employee;

    public Department(int departmentNumber, String departmentName, String departmentManager) {
        this.departmentNumber = departmentNumber;
        this.departmentName = departmentName;
        this.departmentManager = departmentManager;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentManager() {
        return departmentManager;
    }

    public void setDepartmentManager(String departmentManager) {
        this.departmentManager = departmentManager;
    }

    public Collection<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(Collection<Employee> employee) {
        this.employee = employee;
    }

    public Object save(Department department) {
        return department;
    }
}
