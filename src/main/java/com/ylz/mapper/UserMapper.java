package com.ylz.mapper;

import com.ylz.pojo.User;

import java.util.List;

/**
 * @author ylz
 * @date 2022/7/17 18:00
 */
public interface UserMapper {
    List<User> selectAll();
    User selectById(int id);
}
