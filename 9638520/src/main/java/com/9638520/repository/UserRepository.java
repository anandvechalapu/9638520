package com.9638520.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.9638520.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User findByUsername(String username);
    
    User findByEmail(String email);
    
    User findByUsernameAndPassword(String username, String password);
    
    User findByEmailAndPassword(String email, String password);
    
    void deleteByUsername(String username);
}