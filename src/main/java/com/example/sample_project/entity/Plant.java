package com.example.sample_project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.cdi.Eager;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Plant {
    @Id
    private int id;
    private String name;
    private int price;

}
//@Data: This Lombok annotation combines several other annotations
// (@ToString, @EqualsAndHashCode, @Getter, and @Setter) to generate common methods
// such as toString(), equals(), hashCode(), and getters and setters
// for all fields in the class.