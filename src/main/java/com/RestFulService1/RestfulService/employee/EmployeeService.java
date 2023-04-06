package com.RestFulService1.RestfulService.employee;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeService {
    
    private EmployeeDaoService service ;

    public EmployeeService(EmployeeDaoService service){
        this.service = service ;
    }

    //Question-3
    //will return all the employees
    @GetMapping("/employees")
    public List<Employee> allEmployees(){
        return service.allEmployees() ;
    }

    //Question-4
    //this will get us a particular employee
    //@PathVariable -> it gives us the Path Parameter . in this case i.e "id"
    @GetMapping("/employees/{id}")
    public Employee findOneEmployee(@PathVariable int id){
        Employee emp = service.findOneEmployee(id) ;
        if(emp == null){
            throw new NoEmployeeFoundException("id : " + id + " Does Not Exist") ;
        }
        return emp ;
    }

    //Question-5 + Question-9
    //will add a new employee
    //@RequestBody -> we get the body or object from the request
    //@Valid -> to validate certain parameters
    @PostMapping("/employees")
    public void createEmployee(@Valid @RequestBody Employee employee){
        service.createEmployee(employee) ;
    }

    //Question-7
    //will delete a particular employee
    @DeleteMapping("/employee/{id}")
    public void removeEmployee(@PathVariable int id){
        Employee employee = service.removeEmployee(id) ;
        if(employee == null){
            throw new NoEmployeeFoundException("id : " + id + " Em[ployee Not Found") ;
        }
    }

    //Question-8
    @PutMapping("/employees/{id}")
    public void updateEmployee(@PathVariable int id , @RequestBody Employee employee){
        Employee emp = service.findOneEmployee(id) ;
        if(employee == null){
            throw new NoEmployeeFoundException("id : " + id + " No Employee Found") ;
        }
        emp.setName(employee.getName()) ;
        emp.setAge(employee.getAge());
    }

}
