package com.example.practice.spring.controller;

import com.example.practice.spring.services.PracticeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class PracticeController {

    @Autowired
    private PracticeServices ps;

    @PostMapping("/addEmp/{id}/{name}")
    public void add(@PathVariable String id, @PathVariable String name)
    {
        ps.add(id,name);
    }



    @GetMapping("/get-emps")
    public Map<String, String> getAll(){
        return ps.getAll();
    }

    @GetMapping("/get-emp/{id}")
    public  String getId(@PathVariable String id){
        return ps.getId(id);
    }

    @DeleteMapping("/delete-emp/{id}")
    public String delete(@PathVariable String id){
        return ps.delete(id);
    }
}
