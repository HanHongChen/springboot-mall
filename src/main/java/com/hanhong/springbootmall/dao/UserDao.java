package com.hanhong.springbootmall.dao;

import com.hanhong.springbootmall.dto.UserRegisterRequest;
import com.hanhong.springbootmall.model.User;

public interface UserDao {
    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
