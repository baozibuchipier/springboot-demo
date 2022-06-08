package com.example.user.service;

import com.example.user.entity.User;
import com.example.user.vo.UserQueryVo;

import java.util.List;

public interface UserService {
    List<User> list(String name);
}