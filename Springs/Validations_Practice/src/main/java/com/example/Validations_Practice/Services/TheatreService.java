package com.example.Validations_Practice.Services;

import com.example.Validations_Practice.Entities.TheatreEntity;
import com.example.Validations_Practice.Models.TheatreModel;
import com.example.Validations_Practice.Repositories.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TheatreService {

    @Autowired
    private TheatreRepository theatreRepository;

    public void add(TheatreModel t){

        TheatreEntity theatreEntity = new TheatreEntity();

        theatreEntity.setId(t.getId());
        theatreEntity.setMovieName(t.getMovieName());
        theatreEntity.setLocation(t.getLocation());
        theatreEntity.setMinutes(t.getMinutes());

        theatreRepository.save(theatreEntity);
    }

    public List<TheatreModel> get(){

        List<TheatreEntity> theatreDetails = theatreRepository.findAll();

        return theatreDetails.stream().map(theatre -> getTheatreModel(theatre)).collect(Collectors.toList());

    }

    public TheatreModel getOne(Integer id){

        Optional<TheatreEntity> optionalTheatreEntity = theatreRepository.findById(id);

        if(optionalTheatreEntity.isPresent())
            return getTheatreModel(optionalTheatreEntity.get());
        else
            return null;
    }

    public List<TheatreModel> getByName(String movie){

        List<TheatreEntity> theatreEntities = theatreRepository.findByMovieName(movie);
        return theatreEntities.stream().map(theatre -> getTheatreModel(theatre)).collect(Collectors.toList());
    }

    public List<TheatreModel> getByLocation(String location){

        List<TheatreEntity> theatreEntities = theatreRepository.findByLocation(location);
        return theatreEntities.stream().map(theatre -> getTheatreModel(theatre)).collect(Collectors.toList());
    }

    // Entity to Model Convertion
    private TheatreModel getTheatreModel(TheatreEntity theatreEntity){

        return new TheatreModel(theatreEntity.getId(),
                                theatreEntity.getMovieName(),
                                theatreEntity.getLocation(),
                                theatreEntity.getMinutes());

    }

    public void deleteId(Integer id) {

        theatreRepository.deleteById(id);

    }

    public String update( Integer id, TheatreModel t) {

       Optional<TheatreEntity> list = theatreRepository.findById(id);

//       System.out.println(list);
        if(list.isPresent()) {
            list.stream().forEach(m -> {
                m.setMinutes(t.getMinutes());
                m.setLocation(t.getLocation());
                m.setMovieName(t.getMovieName());
                theatreRepository.save(m);

            });
            return "Updated";
        }
        else{

            TheatreEntity theatreEntity = new TheatreEntity();

            theatreEntity.setId(t.getId());
            theatreEntity.setMovieName(t.getMovieName());
            theatreEntity.setLocation(t.getLocation());
            theatreEntity.setMinutes(t.getMinutes());

            theatreRepository.save(theatreEntity);

            return "Added";

        }




    }
    public void deleteAll() {

        theatreRepository.deleteAll();
    }
}
