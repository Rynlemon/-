package com.zhk.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.xpath.internal.objects.XNumber;
import com.zhk.pojo.LoginRequest;
import com.zhk.pojo.User;
import com.zhk.util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zhk.service.UserService;
import java.util.List;

@Api(tags = "用户接口")
@RestController
@RequestMapping("/api")
public class UserControl {
    @Autowired
    private UserService userService;
    @ApiOperation("获取所有用户信息")
    @PostMapping("/getAllUser")
    public ResponseResult getAllUser()
    {
        List<User> list = userService.getAllUsers();
        if(list==null){
            return ResponseResult.failure(ResponseResult.FAILED,"没有用户信息");
        }
        else
        {
            return ResponseResult.success(ResponseResult.SUCCESS,"获取用户信息成功",list);
        }
    }
    @ApiOperation("禁用用户")
    @PostMapping("/disableUser")
    public ResponseResult disableUser(int id)
    {
        int result = userService.disableUser(id);
        return ResponseResult.success("修改状态成功",ResponseResult.SUCCESS);

    }

    @ApiOperation("用户分页展示管理")
    @PostMapping("/pageList")
    public ResponseResult<PageInfo<User>> getUserList(int pageNum,int pageSize){
        PageInfo<User> pageInfo = userService.pageList(pageNum,pageSize);
        if(pageInfo== null){
            return ResponseResult.failure(ResponseResult.FAILED,"没有用户信息");
        }
        else
        {
            return ResponseResult.success(ResponseResult.SUCCESS,"获取用户信息成功",pageInfo);
        }
    }
}
