package com.thetestroom.controllers;

import com.thetestroom.beans.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class HelloController {

    static Logger log = Logger.getLogger(HelloController.class.getName());

    @Autowired
    private Hello hello;

    @RequestMapping("/hello/{name}")
    public String hi(@PathVariable("name") String name) {
        hello.setName(name);
        log.info("/hello/" + name + " has been called");
        return "hello " + hello.getName();
    }

}
