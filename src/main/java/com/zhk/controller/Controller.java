package com.zhk.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zhk.test.Dog;

@Api(tags = "测试接口")
@RestController   //该注解 表示该类为控制器，相当于@Controller+@ResponseBody的组合注解。
public class Controller {
    @Autowired
    private Dog dog;
    @ApiOperation("测试接口1")
    @GetMapping("/test")
    public String test(){
        return dog.getName();
    }
    @ApiOperation("测试接口2")
    @GetMapping("/count")
    public int count(){
        return dog.count();
    }
}
