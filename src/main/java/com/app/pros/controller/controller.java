package com.app.pros.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class controller {

    @RequestMapping("/Hello")
    public List<Topic> sayHi(){
        return Arrays.asList(
                new Topic("Spring", "Spring Framework", "Description"),
                new Topic("Spring2", "Spring Framework2", "Description2")
        );
    }
}
