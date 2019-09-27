package com.leo.thymeleaf.services.impl;

import com.google.common.collect.Lists;
import com.leo.thymeleaf.converts.UserConverter;
import com.leo.thymeleaf.entities.User;
import com.leo.thymeleaf.params.UserParam;
import com.leo.thymeleaf.repositories.UserRepository;
import com.leo.thymeleaf.results.UserResult;
import com.leo.thymeleaf.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Predicate;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

/**
 * @author Leo Liu
 * @create 27/09/2019
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {
  @Autowired private UserRepository userRepository;

  @Override
  public Page<UserResult> searchByCriteria(Pageable pageable, UserParam userParam) {
    Specification<User> specification =
        (root, query, builder) -> {
          List<Predicate> predicates = Lists.newArrayList();
          if (isNotBlank(userParam.getName())) {
            predicates.add(builder.like(root.get("name"), "%" + userParam.getName() + "%"));
          }
          if (isNotBlank(userParam.getGender())) {
            predicates.add(builder.equal(root.get("gender"), userParam.getGender()));
          }
          if (userParam.getAge() != null) {
            predicates.add(builder.equal(root.get("age"), userParam.getAge()));
          }
          Predicate[] p = new Predicate[predicates.size()];
          return query.where(predicates.toArray(p)).getRestriction();
        };
    Page<User> userPages = userRepository.findAll(specification, pageable);
    return userPages.map(UserConverter::convert2Result);
  }

  @Override
  public void createUser(UserParam userParam) {
    User user = UserConverter.createFrom(userParam);
    userRepository.save(user);
  }
}
