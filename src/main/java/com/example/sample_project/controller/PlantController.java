package com.example.sample_project.controller;
import com.example.sample_project.dto.PlantDTO;
import com.example.sample_project.dto.UserDTO;
import com.example.sample_project.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/plant")
public class PlantController {
    @Autowired
    private PlantService plantService;

    @PostMapping(value = "/savePlant")
    private PlantDTO savePlant(@RequestBody PlantDTO plantDTO){
        return plantService.savePlant(plantDTO);
    }

    @GetMapping(value = "/getPlant")
    public List<PlantDTO> getPlant(){
        return plantService.getPlant();
    }

}
