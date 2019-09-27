package com.leo.thymeleaf.controllers;

import com.leo.thymeleaf.params.UserParam;
import com.leo.thymeleaf.results.UserResult;
import com.leo.thymeleaf.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Leo Liu
 * @create 16/09/2019
 */
@Slf4j
@RestController
@RequestMapping("user")
public class UserController {

  @Autowired private UserService userService;

  @PostMapping
  public void createUser(
      @Validated(value = UserParam.ValidateGroup.CreateUser.class) @RequestBody
          UserParam userParam) {
    log.info("userParam: {}", userParam);
    userService.createUser(userParam);
  }

  @PostMapping("searchByCriteria")
  public Page<UserResult> searchByCriteria(Pageable pageable, @RequestBody UserParam userParam) {
    log.info("userParam: {}", userParam);
    return userService.searchByCriteria(pageable, userParam);
  }
}
