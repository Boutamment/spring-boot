package com.Boutamment.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController {
 @GetMapping("/")
public String hello(@RequestParam(required = false) String param) {
    if (param == null) param = "Spring Boot 🚀";
    return "Hello " + param;
}


    
    public String hello(){
<<<<<<< HEAD
        return "Hello java";
=======
        return "Hello Spring boot";
>>>>>>> 2a4182d87df7ba919833b5dbebd957669b9e438d
    }
}
