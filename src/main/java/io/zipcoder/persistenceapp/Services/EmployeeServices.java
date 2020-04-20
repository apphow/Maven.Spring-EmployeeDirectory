package io.zipcoder.persistenceapp.Services;

import io.zipcoder.persistenceapp.models.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServices {

    private static EmployeeServices employeeRepository;


    public static Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Object create(Employee employee) {
        return employeeRepository.create(employee);
    }

    public Object update(int id, Employee employee) {
        return employeeRepository.update(id, employee);
    }
}
