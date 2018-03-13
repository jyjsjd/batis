/**
 * Copyright 2018 asiainfo Inc.
 **/

package com.asiainfo.entity;

import lombok.ToString;
import org.apache.ibatis.type.Alias;

/**
 * @Author: jingyang
 * @CreateDate: 2018/3/13
 * @Version: v1.0
 */
@Alias("Address")
@ToString
public class Address {

  private Integer id;

  private String street;

  private String city;

  private String province;

  private String country;

  private String username;

  public Address() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }
}
