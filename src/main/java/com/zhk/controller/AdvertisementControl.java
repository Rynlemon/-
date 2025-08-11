package com.zhk.controller;

import com.github.pagehelper.PageInfo;
import com.zhk.mapper.AdvertisementMapper;
import com.zhk.pojo.Advertisement;
import com.zhk.service.AdminService;
import com.zhk.service.AdvertisementService;
import com.zhk.util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;

@Api(tags = "广告接口")
@RestController
@RequestMapping("/api")
public class AdvertisementControl {
    @Autowired
    private AdvertisementService advertisementService;

    @ApiOperation("获取一页广告信息")
    @PostMapping("/getAdvertisement")
    public ResponseResult <PageInfo<Advertisement>> getAdvertisement(int pageNum, int pageSize)
    {
        PageInfo<Advertisement> list = advertisementService.getAdvertisement(pageNum, pageSize);
        if(list== null){
            return ResponseResult.failure(ResponseResult.FAILED,"没有广告信息");
        }
        else
        return ResponseResult.success(ResponseResult.SUCCESS,"获取广告信息成功",list);

    }
    @ApiOperation("提交新的广告信息")
    @PostMapping("/addAdvertisement")
    public ResponseResult<Boolean> addAdvertisement(@RequestBody Advertisement advertisement){
        int result = advertisementService.addAdvertisement(advertisement);
        if (result!=0)
            return ResponseResult.success(ResponseResult.SUCCESS,"添加广告信息成功",true);
        else
            return ResponseResult.failure(ResponseResult.FAILED,"添加广告信息失败");
    }

    @ApiOperation("删除广告信息")
    @PostMapping("/deleteAdvertisement")
    public ResponseResult<Boolean> deleteAdvertisement(int id){
        int result = advertisementService.deleteAdvertisement(id);
        if (result!=0)
            return ResponseResult.success(ResponseResult.SUCCESS,"删除广告信息成功",true);
        else
            return ResponseResult.failure(ResponseResult.FAILED,"删除广告信息失败");
    }

    @ApiOperation("修改广告信息")
    @PostMapping("/editAdvertisement")
    public ResponseResult<Boolean> editAdvertisement(@RequestBody Advertisement advertisement){
        int result = advertisementService.editAdvertisement(advertisement);
        if (result!=0)
            return ResponseResult.success(ResponseResult.SUCCESS,"修改广告信息成功",true);
        else
            return ResponseResult.failure(ResponseResult.FAILED,"修改广告信息失败");
    }
}
