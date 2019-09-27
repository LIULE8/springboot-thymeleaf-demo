package com.leo.thymeleaf.repositories;

import com.leo.thymeleaf.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

/**
 * @author Leo Liu
 * @create 16/09/2019
 */
public interface UserRepository extends JpaRepository<User, BigInteger> {

}