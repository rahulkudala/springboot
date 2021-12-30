package com.example.Validations_Practice.Controller;

import com.example.Validations_Practice.Models.Theatre;
import com.example.Validations_Practice.Services.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Map;

@RestController

public class ValidationController {

    @Autowired
    ValidationService vs;
    @PostMapping("/add")
    public void addName( @Valid @RequestBody Theatre theatre)
    {

        vs.add(theatre);
        //return "Checked";
    }

    @GetMapping("/get")
    public Map<String,Theatre> getAll()
    {

        return vs.get();
        //return "Checked";
    }

}
