package com.zhk.controller;

import com.zhk.pojo.student;
import com.zhk.service.StudentService;
import com.zhk.util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Api(tags = "学生接口")
@RestController
@RequestMapping("/student")
public class StudentControl {
    @Autowired
    private StudentService studentService;
    @ApiOperation("获取所有学生信息")
    @RequestMapping("/getAllStudent")
    public ResponseResult getAllStudent(){
        List<student>students=studentService.getAllStudents();
        if(students==null){
            return ResponseResult.failure(ResponseResult.FAILED,"没有学生信息");
        }
        else
        {
            return ResponseResult.success(ResponseResult.SUCCESS,"获取所有学生信息成功",students);
        }
    }
}
