package io.zipcoder.persistenceapp.Services;

import com.sun.deploy.security.CertStore;
import io.zipcoder.persistenceapp.models.Department;
import io.zipcoder.persistenceapp.models.Employee;
import io.zipcoder.persistenceapp.repositories.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServices {
    private static DepartmentRepository departmentRepository;


    public static Department save(Department department) {
        return (Department) departmentRepository.save(department);
    }

    public Object create(Department employee) {
        return departmentRepository.create(employee);
    }
}
