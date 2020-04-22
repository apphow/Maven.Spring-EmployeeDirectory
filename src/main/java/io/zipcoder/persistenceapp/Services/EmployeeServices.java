package io.zipcoder.persistenceapp.Services;

import io.zipcoder.persistenceapp.models.Employee;
import io.zipcoder.persistenceapp.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServices {

    @Autowired
    EmployeeRepository employeeRepository;

    public void EmployeeService(EmployeeRepository employeeRepository) { this.employeeRepository = employeeRepository;}

    public Employee findByEmployeeNumber(int employeeNumber){return employeeRepository.findByEmployeeNumber(employeeNumber);}

    public Iterable<Employee> findAll() { return employeeRepository.findAll();}

    public Employee create(Employee employee) {
        return employeeRepository.save(employee);
    }


    public Employee update(int employeeNumber, Employee newInfo) {
        Optional<Employee> employee = Optional.ofNullable(employeeRepository.findByEmployeeNumber(employeeNumber));
        Employee existing = findByEmployeeNumber(employeeNumber);
        employeeRepository.save(existing);
        return existing;
    }

    public Employee updateManager(int employeeNumber, int ManagerId ) {
        Employee e = findByEmployeeNumber(employeeNumber);
        e.setManagerId(ManagerId);
        return employeeRepository.save(e);
    }

    public Object updateTitle(int employeeNumber, String newTitle) {
        Employee e = findByEmployeeNumber(employeeNumber);
        e.setTitle(newTitle);
        return employeeRepository.save(e);
    }

    public Employee delete(int employeeNumber) {
        Employee employee = findByEmployeeNumber(employeeNumber);
        employeeRepository.delete(employee);
        return employee;
    }
}
