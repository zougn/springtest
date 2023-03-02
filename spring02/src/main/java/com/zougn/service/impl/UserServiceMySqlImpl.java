package com.zougn.service.impl;

import com.zougn.dao.UserDao;
import com.zougn.dao.impl.UserDaoMySqlImpl;
import com.zougn.service.UserService;

public class UserServiceMySqlImpl implements UserService {
   private UserDao userDao = new UserDaoMySqlImpl();

   @Override
   public void getUser() {
       userDao.getUser();
  }
}