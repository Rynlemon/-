package com.zhk.service.impl;

import com.zhk.mapper.UserNameMapper;
import com.zhk.pojo.student;
import com.zhk.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private UserNameMapper userNameMapper;
    @Override
    public List<student> getAllStudents() {
        return userNameMapper.getAllstudents();
    }
}
