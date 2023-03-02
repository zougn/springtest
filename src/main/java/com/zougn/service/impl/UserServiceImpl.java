package com.zougn.service.impl;

import com.zougn.dao.UserDao;
import com.zougn.dao.impl.UserDaoImpl;
import com.zougn.service.UserService;

public class UserServiceImpl implements UserService {
   private UserDao userDao = new UserDaoImpl();

   @Override
   public void getUser() {
       userDao.getUser();
  }
}