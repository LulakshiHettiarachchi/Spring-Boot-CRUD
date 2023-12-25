package com.example.sample_project.repo;

import com.example.sample_project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//in <> entity name and id type is given
public interface UserRepo extends JpaRepository<User,Integer> {

}
