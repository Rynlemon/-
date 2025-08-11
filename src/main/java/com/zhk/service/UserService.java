package com.zhk.service;


import com.github.pagehelper.PageInfo;
import com.zhk.pojo.User;

import java.util.List;

public interface UserService {
    //获取所有用户信息
    List<User> getAllUsers();
    //禁用用户
    int disableUser(int id);
    //分页查询
    PageInfo<User> pageList(int pageNum, int pageSize);
}
