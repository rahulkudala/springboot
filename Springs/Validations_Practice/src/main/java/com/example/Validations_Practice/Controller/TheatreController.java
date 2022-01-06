package com.example.Validations_Practice.Controller;


import com.example.Validations_Practice.Entities.TheatreEntity;
import com.example.Validations_Practice.Models.TheatreModel;
import com.example.Validations_Practice.Repositories.TheatreRepository;
import com.example.Validations_Practice.Services.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class TheatreController {

    @Autowired
    private TheatreService theatreService;

    @PostMapping("/add-theatre")
    public void addName( @RequestBody TheatreModel theatreModel)
    {
        theatreService.add(theatreModel);
    }

    @GetMapping("/get-threatres")
    public List<TheatreModel>  getAll(){
        return theatreService.get();
    }

    @GetMapping("/getOne/{id}")
    public TheatreModel getOne(@PathVariable Integer id){

        return theatreService.getOne(id);
    }

    @GetMapping("/get/byName/{name}")
    public List<TheatreModel> getByName(@PathVariable String name){
        return theatreService.getByName(name);
    }

    @GetMapping("/get/by-location/{location}")
    public List<TheatreModel> getByLocation(@PathVariable String location){
        return theatreService.getByLocation(location);
    }

    @DeleteMapping("/deletebyid/{id}")
    public String deleteId(@PathVariable Integer id){

        theatreService.deleteId(id);
        return "Deleted";
    }

    @DeleteMapping("/deleteAll")
    public String deleteAll(){
        theatreService.deleteAll();
        return "Deleted all Data!";
    }

    @PutMapping("/update/{id}")
    public String updateOne( @PathVariable Integer id, @RequestBody TheatreModel theatreModel){
        return theatreService.update(id,theatreModel);

    }
}