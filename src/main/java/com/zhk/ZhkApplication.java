package com.zhk;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.zhk.mapper")
@ServletComponentScan
public class ZhkApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZhkApplication.class, args);
    }
}
