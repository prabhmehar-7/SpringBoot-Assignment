package com.RestFulService1.RestfulService.employee;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//so that we can get the bean we have added @Component
@Component
public class EmployeeDaoService {
    private
    static List<Employee> emp = new ArrayList<>() ;

    //to dynamically handle the employee id
    static int idCount = 0 ;

    //as we run the code 3 employee objects will be created and will be added to list
    static{
        emp.add(new Employee(++idCount , "PK" , 28)) ;
        emp.add(new Employee(++idCount , "JK" , 27)) ;
        emp.add(new Employee(++idCount , "KK" , 29)) ;
    }

    public List<Employee> allEmployees(){
        return emp ;
    }

    //to get a particular employee
    public Employee findOneEmployee(int id){
        Employee employee = null ;
        for(Employee e : emp){
            if(e.getId() == id){
                employee = e ;
                break ;
            }
        }
        return employee ;
    }

    //this method will create an employee
    public void createEmployee(Employee employee){
        employee.setId(++idCount) ;
        emp.add(employee) ;
    }

    //this method will remove a particular employee
    public Employee removeEmployee(int id){
        Employee employee = null ;
        for(Employee e : emp){
            if(e.getId() == id){
                employee = e ;
                emp.remove(e) ;
                break ;
            }
        }
        return employee ;
    }

}
