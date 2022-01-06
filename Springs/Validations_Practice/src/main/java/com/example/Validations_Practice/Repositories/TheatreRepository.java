package com.example.Validations_Practice.Repositories;

import com.example.Validations_Practice.Entities.TheatreEntity;
import com.example.Validations_Practice.Models.TheatreModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TheatreRepository extends JpaRepository<TheatreEntity,Integer> {

//    List<TheatreEntity> findByName(String name);
    List<TheatreEntity> findByMovieName(String movie);
    List<TheatreEntity> findByLocation(String location);

    /*@Query("update theatre set theatre.movieName :=mN and theatre.Location:=l and theatre.minutes:=min")
    List<TheatreEntity> updateTheatre(@Param("mN") String movieName, @Param("l") String Location, @Param("min") Integer minutes);*/




}