package com.leo.thymeleaf.params;

import lombok.Getter;
import lombok.Setter;
import com.leo.thymeleaf.params.UserParam.ValidateGroup.CreateUser;
import javax.validation.constraints.NotBlank;
import java.time.ZonedDateTime;

/**
 * @author Leo Liu
 * @create 27/09/2019
 */
@Getter
@Setter
public class UserParam {
  private String id;

  @NotBlank(message = "user name must not blank", groups = {CreateUser.class})
  private String name;

  @NotBlank(message = "gender must not blank", groups = {CreateUser.class})
  private String gender;

  @NotBlank(message = "age must not blank", groups = {CreateUser.class})
  private Integer age;

  private AddressParam addressParam;

  private ZonedDateTime createFrom;
  private ZonedDateTime createTo;

  public interface ValidateGroup {
    interface CreateUser {}
  }
}
