package com.asiainfo.mapper;

import com.asiainfo.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Author: jingyang
 * @CreateDate: 2018/3/13
 * @Version: v1.0
 */
@Repository
public interface UserMapper {

  @Select("SELECT * FROM user WHERE username = #{username}")
  @Results({
          @Result(id = true, column = "username", property = "username"),
          @Result(column = "full_name", property = "fullName"),
          @Result(column = "last_name", property = "lastName"),
          @Result(column = "first_name", property = "firstName"),
          @Result(column = "addr_id", property = "address",
          one=@One(select = "com.asiainfo.mapper.AddressMapper.getAddressById"))
  })
  User getUser(@Param("username") String username);

  @Insert("INSERT INTO user (username, full_name, last_name, first_name) values (" +
          "#{username}, #{fullName}, #{lastName}, #{firstName})")
  int saveUser(User user);

  @Delete("DELETE FROM user WHERE username=#{username}")
  int deleteUser(String username);
}
