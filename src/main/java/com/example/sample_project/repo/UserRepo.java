package com.example.sample_project.repo;

import com.example.sample_project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//in <> entity name and id type is given
public interface UserRepo extends JpaRepository<User,Integer> {

    @Query(value = "select * from User where ID = ?1",nativeQuery = true)
    User getUserByUserID(String userID);

    @Query(value = "select * from User where ID = ?1 and ADDRESS = ?2 ",nativeQuery = true)
    User getUserByUserIDAndAddress(String userID,String address);
}
