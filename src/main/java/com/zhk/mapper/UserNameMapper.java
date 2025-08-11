package com.zhk.mapper;


import com.zhk.pojo.student;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;


@Mapper
public interface UserNameMapper {
    @Select("select * from student")
    List<student> getAllstudents();
}
