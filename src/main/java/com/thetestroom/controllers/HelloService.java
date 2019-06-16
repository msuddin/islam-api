package com.thetestroom.controllers;

import com.thetestroom.beans.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {

    @Autowired
    private Account account;

    @RequestMapping("/hello/{name}")
    public String hi(@PathVariable("name") String name) {
        account.setName(name);
        return "hello " + account.getName();
    }

}
