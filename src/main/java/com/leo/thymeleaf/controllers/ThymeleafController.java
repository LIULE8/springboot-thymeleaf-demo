package com.leo.thymeleaf.controllers;

import com.leo.thymeleaf.entities.User;
import com.leo.thymeleaf.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigInteger;
import java.util.Optional;

/**
 * @author Leo Liu
 * @create 27/09/2019
 */
@Controller
@RequestMapping("page")
public class ThymeleafController {

  @Autowired private UserRepository userRepository;

  @GetMapping("{id}")
  public String show(Model model, @PathVariable(name = "id") long userId) {
    Optional<User> userOptional = userRepository.findById(BigInteger.valueOf(userId));
    if (userOptional.isPresent()) {
      User user = userOptional.get();
      model.addAttribute("uid", user.getId());
      model.addAttribute("name", user.getName());
    return "show";
    }
    return "error";
  }
}
