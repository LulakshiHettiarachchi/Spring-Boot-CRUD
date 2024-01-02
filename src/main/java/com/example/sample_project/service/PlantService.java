package com.example.sample_project.service;

import com.example.sample_project.dto.PlantDTO;
import com.example.sample_project.entity.Plant;
import com.example.sample_project.repo.PlantRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PlantService {
    @Autowired
    private PlantRepo plantRepo;

    @Autowired
    private ModelMapper modelMapper;
    public PlantDTO savePlant(PlantDTO plantDTO){
        plantRepo.save(modelMapper.map(plantDTO,Plant.class));

        return plantDTO;
    }
    public List<PlantDTO> getPlant(){
        List<Plant> plantList = plantRepo.findAll();
        return modelMapper.map(plantList,new TypeToken<List<PlantDTO>>(){}.getType());
    }

}
//The use of @Autowired in Spring is part of the dependency injection mechanism

//@Autowired annotation is used to inject an instance of the ModelMapper class
// into the PlantService class.
// ModelMapper is a library commonly used for mapping or converting
// objects from one type to another

//By injecting the repository, the PlantService class can use methods
//provided by PlantRepo to perform database operations
//like saving and retrieving plant data.

//The concept of a transaction ensures that a series of
// database operations are executed
// in an atomic, consistent, isolated, and durable manner,
// often abbreviated as ACID properties: