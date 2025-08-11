package com.zhk.mapper;

import com.zhk.pojo.Advertisement;
import com.zhk.service.AdvertisementService;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface AdvertisementMapper {

    @Select("select * from advertisements")
    List<Advertisement> getAdvertisement();

    @Insert("insert into advertisements(adTitle,adImageUrl,adContent,startTime) values(#{adTitle},#{adImageUrl},#{adContent},#{startTime})")
    int addAdvertisement(Advertisement advertisement);

    @Delete("delete from advertisements where id=#{id}")
    int deleteAdvertisement(int id);

    @Update("update advertisements set adTitle=#{adTitle},adImageUrl=#{adImageUrl},adContent=#{adContent},startTime=#{startTime} where id=#{id}")
    int editAdvertisement(Advertisement advertisement);
}
