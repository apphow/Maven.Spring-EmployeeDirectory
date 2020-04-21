package io.zipcoder.persistenceapp.Services;

import io.zipcoder.persistenceapp.models.Department;
import io.zipcoder.persistenceapp.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServices {

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    EmployeeServices employeeService;

    public void DepartmentServices(DepartmentRepository departmentRepository) { this.departmentRepository = departmentRepository;}


    private Department departmentRepository(Department byDepartmentNumber) {
        return (Department) departmentRepository;
    }

    public Department findByDepartmentNumber(int departmentNumber){return departmentRepository(findByDepartmentNumber(departmentNumber));}

    public static Department save(Department department) {
        return (Department) department.save(department);
    }

    public Object create(Department department) {
        return departmentRepository.create(department);
    }

    public Object update(Department department) { return departmentRepository.update(department);
    }

    public Department changeDepartmentName(int departmentNumber, String departmentName) {
        Department current = findByDepartmentNumber(departmentNumber);
        return current;
    }
}
