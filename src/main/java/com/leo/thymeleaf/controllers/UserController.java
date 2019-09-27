package com.leo.thymeleaf.controllers;

import com.leo.thymeleaf.entities.User;
import com.leo.thymeleaf.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Leo Liu
 * @create 16/09/2019
 */
@Slf4j
@RestController
@RequestMapping("user")
public class UserController {

  @Autowired private UserRepository userRepository;

  @PostMapping
  public void save(@RequestBody User user) {
    log.info("user:{}", user);
    userRepository.save(user);
  }

  @GetMapping
  public List<User> findAll() {
    return userRepository.findAll();
  }
}
