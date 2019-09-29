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
public class AddressResult {
    private String province;
    private String city;
    private String area;
    private String name;
    private ZonedDateTime createTime;
    private ZonedDateTime updateTime;
}