package com.hanhong.springbootmall.service.impl;

import com.hanhong.springbootmall.dao.UserDao;
import com.hanhong.springbootmall.dto.UserRegisterRequest;
import com.hanhong.springbootmall.model.User;
import com.hanhong.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
