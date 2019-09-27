package com.leo.thymeleaf.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Leo Liu
 * @create 27/09/2019
 */
@Getter
@Setter
@Entity
@Table(name="t_address")
public class Address extends CommonEntity{
    private static final long serialVersionUID = 9149845872569901865L;
    private String province;
    private String city;
    private String area;
    private String name;
}