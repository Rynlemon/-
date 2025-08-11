package com.zhk.service.impl;

import com.zhk.mapper.TeacherMapper;
import com.zhk.pojo.Teacher;
import com.zhk.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServerImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;
    @Override
    public List<Teacher> getAllTeachers()
    {
        return teacherMapper.getAllTeachers();
    }
}
