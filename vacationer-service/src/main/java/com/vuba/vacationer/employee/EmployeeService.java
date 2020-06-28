package com.vuba.vacationer.employee;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@Slf4j
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findAllEmployees(Pageable page){
        LOG.debug("find all employee called");
        return employeeRepository.findAll(page).toList();
    }

    public Employee findEmployeeByCompanyId(String companyId){
        LOG.debug("find employee by company id [{}]", companyId);
        Optional<Employee> optional = employeeRepository.findEmployeeByCompanyId(companyId);
        return optional.isPresent()? optional.get() : null;
    }

    public Employee addEmployee(Employee employee){
        LOG.debug("add employee [{}]", employee);
        employee = employeeRepository.save(employee);
        return employee;
    }
}
