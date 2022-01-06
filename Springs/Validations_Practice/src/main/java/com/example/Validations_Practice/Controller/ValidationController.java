package com.example.Validations_Practice.Controller;

import com.example.Validations_Practice.Entities.TheatreEntity;
import com.example.Validations_Practice.Models.TheatreModel;
import com.example.Validations_Practice.Services.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ValidationController {

  /*  @Autowired
    ValidationService vs;
    @Autowired
    TheatreEntity theatreEntity;
    @PostMapping("/add")
    public void addName(@Valid @RequestBody TheatreModel theatreModel)
    {
        vs.add(theatreEntity);
    }*/

/*    @GetMapping("/get")
    public List<Theatre> getAll()
    {

        return vs.get();
    }*/

/*    @GetMapping("/getOne/{id}")
    public Theatre getOne(Integer id)
    {

        return vs.getOne(id);
    }*/

}
