package com.example.springboot_project;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {

    @GetMapping("/page")
    public String page(){
        String a = "Welcome to ";
        String b = "Page Method";
        
        return a+b;
    }
    @GetMapping("/num")
    public int page2(){

        return 10*20;
    }

    @GetMapping("-name")
    public boolean med(){

        return true;
    }

}
