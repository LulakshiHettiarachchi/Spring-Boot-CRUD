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
