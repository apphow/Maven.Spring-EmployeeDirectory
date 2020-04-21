package io.zipcoder.persistenceapp.repositories;

import io.zipcoder.persistenceapp.models.Department;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {

    Object create(Department employee);

    Object update(Department department);

    Optional<Object> findById(int departmentNumber);
}
