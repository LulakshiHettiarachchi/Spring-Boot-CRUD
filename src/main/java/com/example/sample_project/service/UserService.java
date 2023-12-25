package com.example.sample_project.service;

import com.example.sample_project.dto.UserDTO;
import com.example.sample_project.entity.User;
import com.example.sample_project.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
