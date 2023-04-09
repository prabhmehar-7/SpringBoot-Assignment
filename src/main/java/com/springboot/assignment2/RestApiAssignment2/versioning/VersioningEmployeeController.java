package com.springboot.assignment2.RestApiAssignment2.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningEmployeeController {

    //Question10
    //URI versioning
    @GetMapping("/v1/users")
    public UserV1 getFirstVersionUsers(){
        return new UserV1("User1" , 27) ;
    }

    //Question10
    //URI versioning
    @GetMapping("/v2/users")
    public UserV2 getSecondVersionUsers(){
        return new UserV2("Newer" , 1 , 27 , "Gurugram") ;
    }

    //Request Parameter Versioning
    @GetMapping(path = "/users" , params ="version=1")
    public UserV1 requestParameterFirstVersion(){
        return new UserV1("User1" , 27) ;
    }

    //Request Parameter Versioning
    @GetMapping(path = "/users" , params ="version=2")
    public UserV2 requestParameterSecondVersion(){
        return new UserV2("Newer" , 1 , 27 , "Gurugram") ;
    }

    //Custom Header Versioning
    @GetMapping(path = "/users" , headers = "X-API-VERSION=1")
    public UserV1 customHeaderFirstVersion(){
        return new UserV1("User1" , 27) ;
    }

    //Custom Header Versioning
    @GetMapping(path = "/users" , headers ="X-API-VERSION=2")
    public UserV2 customHeaderSecondVersion(){
        return new UserV2("Newer" , 1 , 27 , "Gurugram") ;
    }

    //mediaType versioning
    @GetMapping(path = "/users" , headers = "application/vnd.company.app-v1+json")
    public UserV1 mediaTypeFirstVersion(){
        return new UserV1("User1" , 27) ;
    }

    //mediaType versioning
    @GetMapping(path = "/users" , produces ="application/vnd.company.app-v2+json")
    public UserV2 mediaTypeSecondVersion(){
        return new UserV2("Newer" , 1 , 27 , "Gurugram") ;
    }

}
