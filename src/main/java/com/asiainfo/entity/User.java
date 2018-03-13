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
@Alias("User")
@ToString
public class User {

  private String username;

  private String fullName;

  private String lastName;

  private String firstName;

  private Address address;

  public User() {
  }

  public User(String username, String fullName, String lastName, String firstName) {
    this.username = username;
    this.fullName = fullName;
    this.lastName = lastName;
    this.firstName = firstName;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }
}
