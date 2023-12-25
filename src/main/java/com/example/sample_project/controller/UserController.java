package com.example.sample_project.controller;

import com.example.sample_project.dto.UserDTO;
import com.example.sample_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;
@GetMapping("/getUser")
    public String getUser(){
    return "user Lulz";
}

@PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){

        return userService.saveUser(userDTO);
    }
    @PutMapping("/updateUser")
    public String updateUser(){
        return "user Lulz updated";
    }
    @DeleteMapping("/deleteUser")
    public String deletUser(){
        return "user Lulz deleted";
    }

}
