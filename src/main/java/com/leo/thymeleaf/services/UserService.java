package com.leo.thymeleaf.services;

import com.leo.thymeleaf.entities.User;
import com.leo.thymeleaf.params.UserParam;
import com.leo.thymeleaf.results.UserResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author Leo Liu
 * @create 27/09/2019
 */
public interface UserService {

  void createUser(UserParam userParam);

  Page<UserResult> searchByCriteria(Pageable pageable, UserParam userParam);
}
