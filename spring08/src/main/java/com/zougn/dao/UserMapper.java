package com.zougn.dao;

import com.zougn.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> selectUser();
}