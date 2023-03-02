package com.zougn.dao.impl;

import com.zougn.dao.UserDao;

public class UserDaoOracleImpl implements UserDao {
   @Override
   public void getUser() {
       System.out.println("Oracle获取用户数据");
  }
}