package io.zipcoder.persistenceapp.repositories;

import io.zipcoder.persistenceapp.models.Employee;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    Employee findByEmployeeNumber(int employeeNumber);


    OngoingStubbing<Employee> save();
}
