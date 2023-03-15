package com.hanhong.springbootmall.service;

import com.hanhong.springbootmall.dto.UserRegisterRequest;
import com.hanhong.springbootmall.model.User;

public interface UserService {
    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);
}
