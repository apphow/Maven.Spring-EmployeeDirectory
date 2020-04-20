package io.zipcoder.persistenceapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

    @Id
    int departmentNumber;
    String departmentName;
    String departmentManager;

    public Department(){}

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
}
