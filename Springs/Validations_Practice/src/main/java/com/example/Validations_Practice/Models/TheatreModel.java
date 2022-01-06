package com.example.Validations_Practice.Models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TheatreModel {

    @NotNull(message = "ID should not be Null")
    private  Integer id;

    @NotEmpty(message = " Movie name should not be empty")
    private String movieName;

    private String location;

    @NotNull(message = "Minutes should not be null")
    @Size(min = 80, message = "Duration atleast 80min +")
    private Integer minutes;


    /*@Min(value =1,message = " testValue should have atleast 1 character")
    @Max(value = 6,message = "Test Value should be less than 7 characters")*/


    public TheatreModel(Integer id, String movieName, String location, Integer minutes) {
        this.id = id;
        this.movieName = movieName;
        this.location = location;
        this.minutes = minutes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

}