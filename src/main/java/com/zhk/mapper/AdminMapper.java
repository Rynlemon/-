package com.zhk.mapper;

import com.zhk.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AdminMapper {
    @Select("select * from admin where username=#{username} and password=#{password}")
    Admin login(String username, String password);

}
