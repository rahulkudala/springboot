package com.example.practice.spring.services;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PracticeServices {

    private Map<String, String> emp = new HashMap<>();

    public  void add(String id, String name){
        emp.put(id,name);
    } // adding path variables

    public Map<String, String> getAll(){
        return emp;
    }  // returning all emp info
    public String getId(String id){
        return emp.get(id);
    }   // returning emp by id

    public String delete(String id){
        return emp.remove(id);
    }  // deleting emp by id



    private Map<String, String> nm = new HashMap<>();

    public void addNames(String name1, String name2){
        nm.put(name1,name2);
    }

    public Map<String,String> getNames(){ return nm; }

    public String getname(String name){
        return nm.get(name);
    }

    public String deleteName(String name){
        return nm.remove(name);
    }
}
