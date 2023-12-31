package com.example.sample_project.repo;

import com.example.sample_project.entity.Plant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantRepo extends JpaRepository<Plant,Integer> {
}
