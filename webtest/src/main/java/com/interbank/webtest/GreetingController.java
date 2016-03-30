package com.interbank.webtest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/test1/{name}")
    String test1(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
    
    @RequestMapping("/test2")
    String test2() {
        return "Hello!";
    }
} 