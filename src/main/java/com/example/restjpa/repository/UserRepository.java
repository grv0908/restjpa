package com.example.restjpa.repository;

import com.example.restjpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Gaurav Rajput
 * Created on 26/11/19
 */


public interface UserRepository extends JpaRepository<User, Integer> {

}
