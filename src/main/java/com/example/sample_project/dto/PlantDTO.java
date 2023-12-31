package com.example.sample_project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PlantDTO {
    private int id;
    private String name;
    private String price;
}
