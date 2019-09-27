package com.leo.thymeleaf.converts;

import com.leo.thymeleaf.entities.User;
import com.leo.thymeleaf.params.UserParam;
import com.leo.thymeleaf.results.AddressResult;
import com.leo.thymeleaf.results.UserResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;

import java.util.Objects;

/**
 * @author Leo Liu
 * @create 27/09/2019
 */
@Slf4j
public class UserConverter {

  public static User createFrom(UserParam userParam) {
    User user = new User();
    BeanUtils.copyProperties(userParam, user);
    return user;
  }

  public static UserResult convert2Result(User user) {
    UserResult result = new UserResult();
    BeanUtils.copyProperties(user, result);
    if (Objects.nonNull(user.getAddress())) {
      AddressResult addressResult = new AddressResult();
      BeanUtils.copyProperties(user.getAddress(), addressResult);
      result.setAddressResult(addressResult);
    }
    return result;
  }
}
