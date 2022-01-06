package com.example.Validations_Practice.Services;

import com.example.Validations_Practice.Entities.TheatreEntity;
import com.example.Validations_Practice.Models.TheatreModel;
import com.example.Validations_Practice.Repositories.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ValidationService {


    @Autowired
    private TheatreRepository repository;

/*    public void add(TheatreEntity theatreEntity){

        repository.save(theatreEntity);
    }


  public List<TheatreModel> get(){
        //return li;
    }


    public TheatreModel getOne(Integer id)
    {
            return repository.findByName();
    }*/

}
