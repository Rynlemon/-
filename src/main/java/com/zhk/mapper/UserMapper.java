package com.zhk.mapper;

import com.zhk.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Mapper
public interface UserMapper {
    //查询所有用户
    @Select("select * from users")
    public List<User> getAllUsers();

    @Update("update users set disable =1-disable where id =#{id}")
    public int disableUser(int id);

}
