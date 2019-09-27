package com.leo.thymeleaf.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;

/**
 * @author Leo Liu
 * @create 27/09/2019
 */
@Getter
@Setter
@MappedSuperclass
class CommonEntity extends ChangeLog {
  private static final long serialVersionUID = 4790352477881010187L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private BigInteger id;

  @Version private long version;
}
