package com.springboot.assignment2.RestApiAssignment2.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {

    @GetMapping("/static-filter")
    public User staticFiltering(){
        return new User(1 , "newer" , "Gurugram" , "Newers@World123") ;
    }

    @GetMapping("/dynamic-filter")
    public MappingJacksonValue dynamicFiltering(){
        User user = new User(1 , "newer" , "Gurugram" , "Newers@World123") ;
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(user) ;
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id","name","address") ;
        FilterProvider filters = new SimpleFilterProvider().addFilter("UserFilter" , filter);
        mappingJacksonValue.setFilters(filters) ;
        return mappingJacksonValue ;
    }

}
