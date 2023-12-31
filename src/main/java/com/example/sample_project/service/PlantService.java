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
