package com.feng.mapper;

import com.feng.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> query();

    int insert(User user);

    int delete(int id);
}
