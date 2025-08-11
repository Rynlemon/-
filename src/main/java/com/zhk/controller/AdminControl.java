package com.zhk.controller;

import com.zhk.pojo.LoginRequest;
import com.zhk.service.AdminService;
import com.zhk.util.ResponseResult;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "管理员接口")
@RequestMapping("/admin")
@RestController
public class AdminControl {
    @Autowired
    private AdminService adminService;
    @PostMapping("/login")
    public ResponseResult<Boolean> login(@RequestBody LoginRequest loginRequest){
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();
        Boolean login = adminService.login(username, password);
        if (login){
            return ResponseResult.success(ResponseResult.SUCCESS,"登录成功", login);
        }
        else{
            return ResponseResult.failure(ResponseResult.FAILED,"登录失败");
        }
    }
}
