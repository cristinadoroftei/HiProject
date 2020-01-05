package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Main {

    @ResponseBody
    @GetMapping("/")
    public String f(){
        return "hello world it works!!";
    }
}
