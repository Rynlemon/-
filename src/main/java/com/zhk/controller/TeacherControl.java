package com.zhk.controller;

import com.zhk.pojo.Teacher;
import com.zhk.service.TeacherService;
import com.zhk.util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Api(tags = "教师接口")
@RestController
@RequestMapping("/teacher")
public class TeacherControl {
    @Autowired
    private TeacherService teacherService;
    @ApiOperation("获取所有教师信息")
    @RequestMapping("/getAllTeacher")
    public ResponseResult getAllTeacher()
    {
        List<Teacher> list = teacherService.getAllTeachers();
        if(list==null){
            return ResponseResult.failure(ResponseResult.FAILED,"没有老师信息");
        }
        else
        {
            return ResponseResult.success(ResponseResult.SUCCESS,"获取所有学生信息成功",list);
        }
    }

}
