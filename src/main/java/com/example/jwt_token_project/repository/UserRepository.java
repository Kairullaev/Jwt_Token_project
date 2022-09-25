package com.example.jwt_token_project.repository;


import com.example.jwt_token_project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByEmail(String email);


//    User findUserByAuthoritiesEAndEmail(String email);

//    @Query("email = email !")

}
