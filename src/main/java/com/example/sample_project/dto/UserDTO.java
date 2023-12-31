package com.example.sample_project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {
    private int id;
    private String name;
    private String address;

}
//    DAO acts as a bridge between the database and the application.
//    DTO acts as a data store from where the data is received
//    and transferred to different layers
//By creating two separate DTOs, you can maintain a clearer separation
// of concerns and ensure that each DTO carries only the relevant data for its specific use case.
// DTOs help in encapsulating data and sending only the necessary information,