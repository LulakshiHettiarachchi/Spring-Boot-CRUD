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
//spring Data JPA is a part of the larger Spring Data project and specifically focuses
// on data access using the Java Persistence API (JPA)
//The repository interface provides methods for common CRUD operations such as save,
// findById, delete, and more.
// These methods are implemented by Spring Data JPA,
// and you can use them without writing explicit queries.

//why interface?
//Abstraction:
//dyanamic proxy generation
        //In the context of Spring and Java, a proxy is an object that acts as an
        // intermediary or placeholder for another object. It is used to
        // control access to the real object or to add additional behavior
        // before or after certain operations. Proxies are often created
        // dynamically at runtime.
//multiple inheritence