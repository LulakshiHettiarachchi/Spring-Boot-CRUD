package com.example.sample_project.service;

import com.example.sample_project.dto.UserDTO;
import com.example.sample_project.entity.User;
import com.example.sample_project.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;
    public UserDTO saveUser(UserDTO UserDTO){
        userRepo.save(modelMapper.map(UserDTO, User.class));
        return UserDTO;
    }
    public List<UserDTO> getUser(){
        User user1 = new User();
        System.out.println("user1.getId()**********");
        System.out.println(user1.getId());
        System.out.println(user1.getName());
        List<User> userList = userRepo.findAll();
        return modelMapper.map(userList,new TypeToken<List<UserDTO>>(){}.getType());
    }
    public UserDTO updateUser(UserDTO UserDTO){
        userRepo.save(modelMapper.map(UserDTO, User.class));
        return UserDTO;
    }
    public boolean deleteUser(UserDTO userDTO){
        userRepo.delete(modelMapper.map(userDTO,User.class));
        return true;
    }
    public UserDTO getUserByUserID(String UserID){
//        User user = userRepo.getUserByUserID(UserID);
        User user = userRepo.getOne(Integer.valueOf(UserID));

        return modelMapper.map(user,UserDTO.class);
    }

    public UserDTO getUserByUserIDAndAddress(String UserID,String Address){
        User user = userRepo.getUserByUserIDAndAddress(UserID,Address);
        return modelMapper.map(user,UserDTO.class);
    }
}
