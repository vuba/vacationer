package com.vuba.vacationer.employee;

import io.swagger.annotations.ApiOperation;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
@Data
@Slf4j
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping()
    @ApiOperation(value = "find all employees for given page")
    public List<Employee> findAllEmployees(Pageable page){
        LOG.debug("find all employees called with page [{}]", page);
        return employeeService.findAllEmployees(page);
    }

    @GetMapping("/{companyId")
    public Employee findEmployeeWithCompanyId(@PathVariable("companyId")String companyId){
        LOG.debug("find employee with company id [{}]", companyId);
        return employeeService.findEmployeeByCompanyId(companyId);
    }

    @PostMapping()
    public Employee addEmployee(@RequestBody Employee employee){
        LOG.debug("add employee [{}]", employee);
        return employeeService.addEmployee(employee);
    }
}
