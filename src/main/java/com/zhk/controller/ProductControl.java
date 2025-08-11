package com.zhk.controller;

import com.github.pagehelper.PageInfo;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.zhk.pojo.*;
import com.zhk.service.ProductService;
import com.zhk.service.impl.ProductServiceImpl;
import com.zhk.util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "商品管理接口")
@RestController
@RequestMapping("/api")
public class ProductControl {
    @Autowired
    ProductService productService;

    //品牌
    @ApiOperation(value = "品牌列表",tags = {"商品管理接口（品牌管理）"})
    @PostMapping("/getBrandList")
    public ResponseResult <PageInfo<Brand>> getBrandList(int pageNum, int pageSize){
        PageInfo<Brand> pageInfo = productService.getBrandList(pageNum,pageSize);
        if (pageInfo!= null)
        return ResponseResult.success(ResponseResult.SUCCESS,"添加合作商信息成功",pageInfo);
        else
        return ResponseResult.failure(ResponseResult.ERROR,"添加合作商信息失败");
    }
    @ApiOperation(value = "添加品牌", tags = {"商品管理接口（品牌管理）"})
    @PostMapping("/addBrand")
    public ResponseResult<Boolean> addBrand(@RequestBody Brand brand){
        int result = productService.addBrand(brand);
        if (result > 0)
            return ResponseResult.success(ResponseResult.SUCCESS,"添加品牌成功",true);
        else
            return ResponseResult.failure(ResponseResult.FAILED,"添加品牌失败");
    }
    @ApiOperation(value = "删除品牌", tags = {"商品管理接口（品牌管理）"})
    @PostMapping("/deleteBrand")
    public ResponseResult<Boolean> deleteBrand(int brandId){
        int result = productService.deleteBrand(brandId);
        if (result > 0)
            return ResponseResult.success(ResponseResult.SUCCESS,"删除品牌成功",true);
        else
            return ResponseResult.failure(ResponseResult.FAILED,"删除品牌失败");
    }
    @ApiOperation(value = "修改品牌信息", tags = {"商品管理接口（品牌管理）"})
    @PostMapping("/editBrand")
    public ResponseResult<Boolean> editBrand(@RequestBody Brand brand){
        int result = productService.editBrand(brand);
        if (result > 0)
            return ResponseResult.success(ResponseResult.SUCCESS,"修改品牌信息成功",true);
        else
            return ResponseResult.failure(ResponseResult.FAILED,"修改品牌信息失败");
    }
    @ApiOperation(value = "获取所有品牌列表", tags = {"商品管理接口（品牌管理）"})
    @PostMapping("/getAllBrandList")
    public ResponseResult<List<Brand>> getAllBrandList(){
        List<Brand> list = productService.getAllBrandList();
        if (list!= null)
            return ResponseResult.success(ResponseResult.SUCCESS,"添加合作商信息成功",list);
        else
            return ResponseResult.failure(ResponseResult.ERROR,"添加合作商信息失败");
    }


    //鞋子类型
    @ApiOperation(value = "鞋子类型列表", tags = {"商品管理接口（鞋子类型）"})
    @PostMapping("/getShoesTypeList")
    public ResponseResult <PageInfo<ShoesType>> getShoesTypeList(int pageNum, int pageSize){
        PageInfo<ShoesType> pageInfo = productService.getShoesTypeList(pageNum,pageSize);
        if (pageInfo!= null)
        return ResponseResult.success(ResponseResult.SUCCESS,"添加合作商信息成功",pageInfo);
        else
        return ResponseResult.failure(ResponseResult.ERROR,"添加合作商信息失败");
    }
    @ApiOperation(value="添加鞋子类型", tags = {"商品管理接口（鞋子类型）"})
    @PostMapping("/addShoesType")
    public ResponseResult<Boolean> addShoesType(@RequestBody ShoesType shoesType){
        int result = productService.addShoesType(shoesType);
        if (result > 0)
            return ResponseResult.success(ResponseResult.SUCCESS,"添加鞋子类型成功",true);
        else
            return ResponseResult.failure(ResponseResult.ERROR,"添加鞋子类型失败");
    }
    @ApiOperation(value = "删除鞋子类型", tags = {"商品管理接口（鞋子类型）"})
    @PostMapping("/deleteShoesType")
    public ResponseResult<Boolean> deleteShoesType(int typeId){
        int result = productService.deleteShoesType(typeId);
        if (result > 0)
            return ResponseResult.success(ResponseResult.SUCCESS,"删除鞋子类型成功",true);
        else
            return ResponseResult.failure(ResponseResult.ERROR,"删除鞋子类型失败");
    }
    @ApiOperation(value = "修改鞋子类型信息", tags = {"商品管理接口（鞋子类型）"})
    @PostMapping("/editShoesType")
    public ResponseResult<Boolean> editShoesType(@RequestBody ShoesType shoesType){
        int result = productService.editShoesType(shoesType);
        if (result > 0)
            return ResponseResult.success(ResponseResult.SUCCESS,"修改鞋子类型信息成功",true);
        else
            return ResponseResult.failure(ResponseResult.ERROR,"修改鞋子类型信息失败");
    }
    @ApiOperation(value = "获取所有鞋子类型列表", tags = {"商品管理接口（鞋子类型）"})
    @PostMapping("/getAllShoesTypeList")
    public ResponseResult<List<ShoesType>> getAllShoesTypeList(){
        List<ShoesType> list = productService.getAllShoesTypeList();
        if (list!= null)
            return ResponseResult.success(ResponseResult.SUCCESS,"添加合作商信息成功",list);
        else
            return ResponseResult.failure(ResponseResult.ERROR,"添加合作商信息失败");
    }


    //鞋子颜色
    @ApiOperation(value = "颜色列表", tags = {"商品管理接口（鞋子颜色）"})
    @PostMapping("/getColorList")
    public ResponseResult <PageInfo<Color>> getColorList(int pageNum, int pageSize){
        PageInfo<Color> pageInfo = productService.getColorList(pageNum,pageSize);
        if (pageInfo!= null)
            return ResponseResult.success(ResponseResult.SUCCESS,"添加合作商信息成功",pageInfo);
        else
            return ResponseResult.failure(ResponseResult.ERROR,"添加合作商信息失败");
    }
    @ApiOperation(value = "添加颜色", tags = {"商品管理接口（鞋子颜色）"})
    @PostMapping("/addColor")
    public ResponseResult<Boolean> addColor(@RequestBody Color color){
        int result = productService.addColor(color);
        if (result > 0)
            return ResponseResult.success(ResponseResult.SUCCESS,"添加颜色成功",true);
        else
            return ResponseResult.failure(ResponseResult.ERROR,"添加颜色失败");
    }
    @ApiOperation(value = "删除颜色", tags = {"商品管理接口（鞋子颜色）"})
    @PostMapping("/deleteColor")
    public ResponseResult<Boolean> deleteColor(int colorId){
        int result = productService.deleteColor(colorId);
        if (result > 0)
            return ResponseResult.success(ResponseResult.SUCCESS,"删除颜色成功",true);
        else
            return ResponseResult.failure(ResponseResult.ERROR,"删除颜色失败");
    }
    @ApiOperation(value = "修改颜色信息", tags = {"商品管理接口（鞋子颜色）"})
    @PostMapping("/editColor")
    public ResponseResult<Boolean> editColor(@RequestBody Color color){
        int result = productService.editColor(color);
        if (result > 0)
            return ResponseResult.success(ResponseResult.SUCCESS,"修改颜色信息成功",true);
        else
            return ResponseResult.failure(ResponseResult.ERROR,"修改颜色信息失败");
    }
    @ApiOperation(value = "获取所有颜色列表", tags = {"商品管理接口（鞋子颜色）"})
    @PostMapping("/getAllColorList")
    public ResponseResult<List<Color>> getAllColorList(){
        List<Color> list = productService.getAllColorList();
        if (list!= null)
            return ResponseResult.success(ResponseResult.SUCCESS,"添加合作商信息成功",list);
        else
            return ResponseResult.failure(ResponseResult.ERROR,"添加合作商信息失败");
    }

    //鞋子尺寸
    @ApiOperation(value = "鞋子尺寸列表", tags = {"商品管理接口（鞋子尺寸）"})
    @PostMapping("/getShoesSizeList")
    public ResponseResult <PageInfo<ShoesSize>> getShoesSizeList(int pageNum, int pageSize){
        PageInfo<ShoesSize> shoesSizeList = productService.getShoesSizeList(pageNum, pageSize);
        if (shoesSizeList != null)
            return ResponseResult.success(ResponseResult.SUCCESS,"获取鞋子尺寸列表成功",shoesSizeList);
        else
            return ResponseResult.failure(ResponseResult.ERROR,"获取鞋子尺寸列表失败");
    }
    @ApiOperation(value="添加鞋子尺寸", tags = {"商品管理接口（鞋子尺寸）"})
    @PostMapping("/addShoesSize")
    public ResponseResult<Boolean> addShoesSize(@RequestBody ShoesSize shoesSize){
        int result = productService.addShoesSize(shoesSize);
        if (result > 0)
            return ResponseResult.success(ResponseResult.SUCCESS,"添加鞋子尺寸成功",true);
        else
            return ResponseResult.failure(ResponseResult.FAILED,"添加鞋子尺寸失败");
    }
    @ApiOperation(value = "删除鞋子尺寸", tags = {"商品管理接口（鞋子尺寸）"})
    @PostMapping("/deleteShoesSize")
    public ResponseResult<Boolean> deleteShoesSize(int sizeId){
        int result = productService.deleteShoesSize(sizeId);
        if (result > 0)
            return ResponseResult.success(ResponseResult.SUCCESS,"删除鞋子尺寸成功",true);
        else
            return ResponseResult.failure(ResponseResult.FAILED,"删除鞋子尺寸失败");
    }
    @ApiOperation(value = "修改鞋子尺寸信息", tags = {"商品管理接口（鞋子尺寸）"})
    @PostMapping("/editShoesSize")
    public ResponseResult<Boolean> editShoesSize(@RequestBody ShoesSize shoesSize){
        int result = productService.editShoesSize(shoesSize);
        if (result > 0)
            return ResponseResult.success(ResponseResult.SUCCESS,"修改鞋子尺寸成功",true);
        else
            return ResponseResult.failure(ResponseResult.FAILED,"修改鞋子尺寸失败");
    }
    @ApiOperation(value = "获取所有鞋子尺寸列表", tags = {"商品管理接口（鞋子尺寸）"})
    @PostMapping("/getAllShoesSizeList")
    public ResponseResult<List<ShoesSize>> getAllShoesSizeList(){
        List<ShoesSize> list = productService.getAllShoesSizeList();
        if (list!= null)
            return ResponseResult.success(ResponseResult.SUCCESS,"添加合作商信息成功",list);
        else
            return ResponseResult.failure(ResponseResult.ERROR,"添加合作商信息失败");
    }

    //鞋子表查询
    @ApiOperation(value = "鞋子表查询", tags = {"商品管理接口（鞋子表）"})
    @PostMapping("/getShoesList")
    public ResponseResult <PageInfo<Shoes>> getShoesList(@RequestParam(defaultValue = "1") int pageNum, // 默认页码为1
                                                         @RequestParam(defaultValue = "5") int pageSize){
        PageInfo<Shoes> shoesList = productService.getShoesList(pageNum, pageSize);
        if (shoesList != null)
            return ResponseResult.success(ResponseResult.SUCCESS,"获取鞋子列表成功",shoesList);
        else
            return ResponseResult.failure(ResponseResult.ERROR,"获取鞋子列表失败");
    }
    @ApiOperation(value = "鞋子id查询", tags = {"商品管理接口（鞋子表）"})
    @PostMapping("/getShoesById")
    public ResponseResult <Shoes> getShoesById(@RequestParam int shoeId){
        Shoes shoes = productService.getShoesById(shoeId);
        if (shoes != null)
            return ResponseResult.success(ResponseResult.SUCCESS,"获取鞋子信息成功",shoes);
        else
            return ResponseResult.failure(ResponseResult.ERROR,"获取鞋子信息失败");
    }
    @ApiOperation(value = "修改鞋子信息", tags = {"商品管理接口（鞋子表）"})
    @PostMapping("/editShoes")
    public ResponseResult<Boolean> editShoes(@RequestBody Shoes shoes){
        int result = productService.editShoes(shoes);
        if (result > 0)
            return ResponseResult.success(ResponseResult.SUCCESS,"修改鞋子信息成功",true);
        else
            return ResponseResult.failure(ResponseResult.FAILED,"修改鞋子信息失败");
    }
    @ApiOperation(value = "新增鞋子信息", tags = {"商品管理接口（鞋子表）"})
    @PostMapping("/addShoes")
    public ResponseResult<Boolean> addShoes(@RequestBody Shoes shoes){
        int result = productService.addShoes(shoes);
        if (result > 0)
            return ResponseResult.success(ResponseResult.SUCCESS,"新增鞋子信息成功",true);
        else
            return ResponseResult.failure(ResponseResult.FAILED,"新增鞋子信息失败");
    }
    @ApiOperation(value = "修改鞋子状态", tags = {"商品管理接口（鞋子表）"})
    @PostMapping("/updateDisableStatus")
    public ResponseResult<Boolean> updateDisableStatus(@RequestParam int shoeId, @RequestParam int disableStatus){
        int result = productService.updateDisableStatus(shoeId, disableStatus);
        if (result > 0)
            return ResponseResult.success(ResponseResult.SUCCESS,"修改鞋子状态成功",true);
        else
            return ResponseResult.failure(ResponseResult.FAILED,"修改鞋子状态失败");
    }
    @ApiOperation(value = "删除鞋子信息", tags = {"商品管理接口（鞋子表）"})
    @PostMapping("/deleteShoes")
    public ResponseResult<Boolean> deleteShoes(int shoeId){
        int result = productService.deleteShoes(shoeId);
        if (result > 0)
            return ResponseResult.success(ResponseResult.SUCCESS,"删除鞋子信息成功",true);
        else
            return ResponseResult.failure(ResponseResult.FAILED,"删除鞋子信息失败");
    }

    //库存表修改
    @ApiOperation(value = "删除库存信息", tags = {"商品管理接口（库存表）"})
    @PostMapping("/deleteStock")
    public ResponseResult<Boolean> deleteStock(int shoes_id,int shoes_size_id){
        int result = productService.deleteInventoryList(shoes_id,shoes_size_id);
            if (result > 0)
                return ResponseResult.success(ResponseResult.SUCCESS,"删除库存信息成功",true);
            else
                return ResponseResult.failure(ResponseResult.FAILED,"删除库存信息失败");
    }
    @ApiOperation(value = "修改库存信息", tags = {"商品管理接口（库存表）"})
    @PostMapping("/editStock")
    public ResponseResult<Boolean> editStock(int shoes_id,int shoes_size_id,int quantity){
        int result = productService.editInventory(shoes_id,shoes_size_id,quantity);
        if (result > 0)
            return ResponseResult.success(ResponseResult.SUCCESS,"修改库存信息成功",true);
        else
            return ResponseResult.failure(ResponseResult.FAILED,"修改库存信息失败");
    }
}
