package com.example.sample_project.controller;

import com.example.sample_project.dto.UserDTO;
import com.example.sample_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/getUser")
        public List<UserDTO> getUser(){
        return userService.getUser();
    }

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){

        return userService.saveUser(userDTO);
    }
    @PutMapping("/updateUser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){

        return userService.saveUser(userDTO);
    }
    @DeleteMapping("/deleteUser")
    public boolean deleteUser(@RequestBody UserDTO userDTO){

        return userService.deleteUser(userDTO);
    }
    @GetMapping("/getUserByUserID/{userID}")
    public UserDTO getUserByUserID(@PathVariable String userID){
        return userService.getUserByUserID(userID);
    }

    @GetMapping("/getUserByUserIDAndAddress/{userID}/{Address}")
    public UserDTO getUserByUserIDAndAddress(@PathVariable String userID,@PathVariable String Address){
        return userService.getUserByUserIDAndAddress(userID,Address);
    }

}
//CORS is a security feature implemented by web browsers that restricts web pages from making
// requests to a different domain than the one that served the web page.

//    This annotation is applied at the class
//level, meaning that CORS will be enabled
//for all endpoints within the UserController.
//@CrossOrigin(origins = "http://allowed-origin.com") allow request only  from this domain

////The use of @Autowired in Spring is part of the dependency injection mechanism
//create object instance and give accese to its methods

//DAO stands for Data Access Object, The main goal of this
// layer is access(Query) data efficiently from database and
// provide services to the Service layer