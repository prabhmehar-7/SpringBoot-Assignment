package com.springboot.assignment2.RestApiAssignment2.employee;


import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.aspectj.bridge.Message;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@RestController
public class EmployeeService {

    private EmployeeDaoService service ;
//    private MessageSource messageSource ; -> this wont work . why ?

//    EmployeeService(){}

    public EmployeeService(EmployeeDaoService service){
        this.service = service ;
    }

    //Question-3 and Question-7
    //will return all the employees
    @Operation(summary = "This will get you all the employees.")
    @GetMapping("/employees")
    public List<Employee> allEmployees(){
        return service.allEmployees() ;
    }

    //Question-4
    //this will get us a particular employee in XML
    //to get response in XML we will send Accept header with value application/xml
    //@PathVariable -> it gives us the Path Parameter . in this case i.e "id"
    @GetMapping("/employees/{id}")
    public Employee findOneEmployee(@PathVariable int id){
        Employee emp = service.findOneEmployee(id) ;
        if(emp == null){
            throw new NoEmployeeFoundException("id : " + id + " Does Not Exist") ;
        }
        return emp ;
    }

    //Question-3 -> we can send XML body to this method
    //will add a new employee
    //@RequestBody -> we get the body or object from the request
    //@Valid -> to validate certain parameters
    @PostMapping("/employees")
    public void createEmployee(@Valid @RequestBody Employee employee){
        service.createEmployee(employee) ;
    }

    //will delete a particular employee
    @DeleteMapping("/employees/{id}")
    public void removeEmployee(@PathVariable int id){
        Employee employee = service.removeEmployee(id) ;
        if(employee == null){
            throw new NoEmployeeFoundException("id : " + id + " Em[ployee Not Found") ;
        }
    }

    //Question-5
    //URL -> localhost:8080/swagger-ui.html
    //@Hidden is used to hide the endpoint from being included in the documentation
    @Hidden
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
