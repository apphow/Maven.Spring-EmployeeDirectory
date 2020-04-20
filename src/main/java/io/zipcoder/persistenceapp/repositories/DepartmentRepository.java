package io.zipcoder.persistenceapp.repositories;

import io.zipcoder.persistenceapp.models.Department;
import io.zipcoder.persistenceapp.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {
    public Object save(Department department);

    Object create(Employee employee);
}
