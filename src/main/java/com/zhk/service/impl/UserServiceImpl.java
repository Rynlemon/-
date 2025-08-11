package com.zhk.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhk.mapper.UserMapper;
import com.zhk.pojo.User;
import com.zhk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }
    @Override
    public int disableUser(int id) {
       return userMapper.disableUser(id);
    }

    @Override
    public PageInfo<User> pageList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> list = userMapper.getAllUsers();
        return new PageInfo<>(list);
    }
}
