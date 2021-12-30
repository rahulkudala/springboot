package com.example.Validations_Practice.Services;

import com.example.Validations_Practice.Models.Theatre;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ValidationService {

    Map<String, Theatre> tmap = new HashMap<>();

    public void add(Theatre t){

        tmap.put(t.getMovieName(),t);
    }

    public  Map<String,Theatre> get(){
        return tmap;
    }

}
