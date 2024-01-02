package com.example.sample_project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
//@Table(name = "myuser")
public class  User {
    @Id
    private int id;
    //use wrapper classes Integer

//    @Column(name ="user_name")
    private String name;
    private String address;


}
