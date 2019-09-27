package com.leo.thymeleaf.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.ZonedDateTime;

/**
 * @author Leo Liu
 * @create 27/09/2019
 */
@Getter
@Setter
@MappedSuperclass
public class ChangeLog implements Serializable {
  private static final long serialVersionUID = 5586802513361320816L;
  private String createBy;
  private String updateBy;
  @CreationTimestamp private ZonedDateTime createTime;
  @UpdateTimestamp private ZonedDateTime updateTime;
}
