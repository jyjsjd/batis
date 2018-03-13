/**
 * Copyright 2018 asiainfo Inc.
 **/

package com.asiainfo;

import com.asiainfo.entity.User;
import com.asiainfo.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: jingyang
 * @CreateDate: 2018/3/13
 * @Version: v1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-context.xml")
public class UserTester {

  @Autowired
  private UserMapper userMapper;

  @Test
  public void testGetUserByName() {
    User user = userMapper.getUser("admin");
    Assert.assertNotNull(user);
  }

  @Test
  public void testSaveUser() {
    User user = new User();
    user.setUsername("1");
    user.setFullName("2");
    user.setLastName("3");
    user.setFirstName("4");

    Assert.assertEquals(1, userMapper.saveUser(user));
  }

  @Test
  public void testDeleteUser() {
    Assert.assertEquals(1, userMapper.deleteUser("1"));
  }
}
