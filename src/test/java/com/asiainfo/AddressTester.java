/**
 * Copyright 2018 asiainfo Inc.
 **/

package com.asiainfo;

import com.asiainfo.entity.Address;
import com.asiainfo.mapper.AddressMapper;
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
public class AddressTester {

  @Autowired
  private AddressMapper mapper;

  @Test
  public void testSaveAddress() {
    Address address = new Address();
    address.setStreet("beijing road");
    address.setCity("nanjing");
    address.setProvince("jiangsu");
    address.setCountry("china");

    int cnt = mapper.saveAddress(address);
    Assert.assertEquals(1, cnt);
  }
}
