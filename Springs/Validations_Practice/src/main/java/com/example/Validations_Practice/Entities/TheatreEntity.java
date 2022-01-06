package com.example.Validations_Practice.Entities;


import javax.persistence.*;

@Entity
@Table(name = "Theatre")
public class TheatreEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private  Integer id;

    @Column(name = "MovieName")
    private String movieName;

    @Column(name = "Location")
    private String location;

    @Column(name = "Minutes")
    private Integer minutes;

    public TheatreEntity(){}

    public TheatreEntity(Integer id, String movieName, String location, Integer minutes) {
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
