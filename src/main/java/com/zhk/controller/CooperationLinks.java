package com.zhk.controller;


import com.github.pagehelper.PageInfo;
import com.zhk.pojo.Cooperation;
import com.zhk.pojo.Link;
import com.zhk.service.CooperationService;
import com.zhk.common.service.UploadService;
import com.zhk.util.ResponseResult;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
@Api(tags = "合作链接接口")
@RestController
@RequestMapping("/api")
public class CooperationLinks {
    @Autowired
    private CooperationService cooperationService;
    @Autowired
    private UploadService uploadService;
    @Value("${file.upload.path}")
    private String path;
    @ApiOperation("获取所有合作链接")
    @PostMapping("/getCooperationLinks")
    public ResponseResult<List<Cooperation>>getCooperationLinks()
    {
        List<Cooperation> list = cooperationService.getCooperationLinks();
        if (list==null)
            return ResponseResult.failure(ResponseResult.FAILED,"没有合作商信息");
        else
            return ResponseResult.success(ResponseResult.SUCCESS,"获取合作商信息成功",list);
    }
    @ApiOperation("获取一页合作链接")
    @PostMapping("/getCooperation")
    public ResponseResult<PageInfo<Cooperation>>getCooperation(int pageNum, int pageSize)
    {
        PageInfo<Cooperation> list = cooperationService.getCooperation(pageNum,pageSize);
        if (list==null)
            return ResponseResult.failure(ResponseResult.FAILED,"没有该合作商信息");
        else
            return ResponseResult.success(ResponseResult.SUCCESS,"获取合作商信息成功",list);
    }

    @ApiOperation("添加合作链接")
    @PostMapping("/addCooperation")
    public ResponseResult<Boolean> addCooperation(@RequestBody Link link)
    {
        int  result = cooperationService.addCooperation(link);
        if (result==0 )
            return ResponseResult.failure(ResponseResult.FAILED,"添加合作商信息失败");
        else
            return ResponseResult.success(ResponseResult.SUCCESS,"添加合作商信息成功", true  );
    }

    @ApiOperation("删除合作链接")
    @PostMapping("/deleteCooperation")
    public ResponseResult<Boolean> deleteCooperation(@RequestBody Link link) {
        int delete = cooperationService.deleteCooperation(link.getId());
        if (delete == 0) {
            return ResponseResult.failure(ResponseResult.FAILED, "删除合作商信息失败");
        }
        else
            return ResponseResult.success(ResponseResult.SUCCESS, "删除合作商信息成功", true);
    }

    @ApiOperation("上传合作链接图片")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(
                    name = "flimage",
                    value = "上传的图片文件",
                    required = true,
                    paramType = "formData",
                    dataType = "MultipartFile",
                    dataTypeClass = MultipartFile.class,
                    defaultValue = "")})
    @PostMapping("/uploadImage")
    public ResponseResult uploadCooperationImage(@RequestPart MultipartFile flimage)
    {
        String result = uploadService.uploadImage(path,flimage);
        if(result!=null)
            return ResponseResult.success(ResponseResult.SUCCESS,"上传成功",result);
        else
            return ResponseResult.failure(ResponseResult.FAILED,"上传失败");
    }

    @ApiOperation("修改合作链接")
    @PostMapping("/edit")
    public ResponseResult<Boolean> editCooperation(@RequestBody Link link) {
        int edit = cooperationService.updateCooperation(link);
        if (edit == 0) {
            return ResponseResult.failure(ResponseResult.FAILED, "修改合作商信息失败");
        }
        else
            return ResponseResult.success(ResponseResult.SUCCESS, "修改合作商信息成功", true);
    }



}


