package com.zhk.service.impl;

import com.zhk.mapper.AdminMapper;
import com.zhk.pojo.Admin;
import com.zhk.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public boolean login(String username, String password) {
        Admin admin = adminMapper.login(username, password);
        if(admin!=null){
            return true;
        }
        else{
            return false;
        }
    }

}
