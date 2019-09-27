package com.leo.thymeleaf.params;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * @author Leo Liu
 * @create 27/09/2019
 */
@Getter
@Setter
public class AddressParam {
  @NotBlank(message = "address province is not blank")
  private String province;

  @NotBlank(message = "address city is not blank")
  private String city;

  @NotBlank(message = "address area is not blank")
  private String area;

  private String name;
}
