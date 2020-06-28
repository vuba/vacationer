package com.vuba.vacationer.employee;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

    Optional<Employee> findEmployeeByCompanyId(String companyId);
}
