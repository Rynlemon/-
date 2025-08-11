package com.zhk.mapper;

import com.zhk.pojo.Cooperation;
import com.zhk.pojo.Link;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface CooperationMapper {
    @Select("select * from cooperation")
    List<Cooperation> getCooperationLinks();

    @Insert("insert into cooperation(name,linkUrl,imageUrl) values(#{name},#{linkUrl},#{imageUrl})")
    int addCooperation(Link link);

    @Delete("delete from cooperation where id=#{id}")
    int deleteCooperation(int id);

    @Update("update cooperation set name=#{name},linkUrl=#{linkUrl},imageUrl=#{imageUrl} where id=#{id}")
    int updateCooperation(Link link);
}
