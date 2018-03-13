/**
 * Copyright 2018 asiainfo Inc.
 **/

package com.asiainfo.mapper;

import com.asiainfo.entity.Address;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Author: jingyang
 * @CreateDate: 2018/3/13
 * @Version: v1.0
 */
@Repository
public interface AddressMapper {

  @Select("SELECT * FROM address WHERE id = #{id}")
  Address getAddressById(@Param("id") int id);

  @Select("SELECT * FROM address WHERE username = #{username}")
  Address getAddressByUsername(@Param("username") String username);

  @Insert("INSERT INTO address (street, city, province, country, username)" +
          "VALUES(#{street}, #{city}, #{province}, #{country}, #{username})")
  @Options(useGeneratedKeys = true)
  int saveAddress(Address address);
}
