package com.example.helloWorld.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/")
    public String gettingGreeting() {
        return "Hello world and Lord Dae Ron!";
    }
}
