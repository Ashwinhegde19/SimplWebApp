package com.example.simplewebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        System.out.println("Greet is being called");
        return "This is Greeting from HomeController";
    }

    @RequestMapping("/about")
        public String about() {
            return "This is about page";
        }

}
