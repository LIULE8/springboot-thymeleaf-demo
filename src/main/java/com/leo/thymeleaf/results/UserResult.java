package com.leo.thymeleaf.results;

import lombok.*;

import java.time.ZonedDateTime;

/**
 * @author Leo Liu
 * @create 27/09/2019
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResult {
  private String name;
  private String gender;
  private Integer age;
  private ZonedDateTime createTime;
  private ZonedDateTime updateTime;
  private AddressResult addressResult;
}
