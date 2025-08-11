package com.zhk.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhk.mapper.ProductMapper;
import com.zhk.pojo.*;
import com.zhk.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    //品牌
    @Autowired
    ProductMapper productMapper;
    @Override
    public PageInfo<Brand> getBrandList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Brand> list = productMapper.getBrandList();
        return new PageInfo<>(list);
    }
    @Override
    public int addBrand(Brand brand) {

        return productMapper.addBrand(brand);
    }
    @Override
    public List<Brand> getAllBrandList(){
        List<Brand> list = productMapper.getBrandList();
        return list;
    }
    @Override
    public int deleteBrand(int brandId) {
        return productMapper.deleteBrand(brandId);
    }
    @Override
    public int editBrand(Brand brand) {
        return productMapper.editBrand(brand);
    }


    //鞋子类型
    @Override
    public PageInfo<ShoesType> getShoesTypeList(int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<ShoesType> list = productMapper.getShoesTypeList();
        return new PageInfo<>(list);
    }
    @Override
    public int addShoesType(ShoesType shoesType) {
        return productMapper.addShoesType(shoesType);
    }
    @Override
    public int deleteShoesType(int typeId){
        return productMapper.deleteShoesType(typeId);
    }
    @Override
    public int editShoesType(ShoesType shoesType) {
        return productMapper.editShoesType(shoesType);
    }
    @Override
    public List<ShoesType> getAllShoesTypeList() {
        return productMapper.getShoesTypeList();
    }


    //鞋子颜色
    @Override
    public PageInfo<Color> getColorList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Color> list = productMapper.getColorList();
        return new PageInfo<>(list);
    }
    @Override
    public int addColor(Color color) {
        return productMapper.addColor(color);
    }
    @Override
    public int deleteColor(int colorId) {
        return productMapper.deleteColor(colorId);
    }
    @Override
    public int editColor(Color color) {
        return productMapper.editColor(color);
    }
    @Override
    public List<Color> getAllColorList() {
        return productMapper.getColorList();
    }


    //鞋子尺寸
    @Override
    public PageInfo<ShoesSize> getShoesSizeList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<ShoesSize> list = productMapper.getShoesSizeList();
        return new PageInfo<>(list);
    }
    @Override
    public int addShoesSize(ShoesSize shoesSize) {
        return productMapper.addShoesSize(shoesSize);
    }
    @Override
    public int deleteShoesSize(int sizeId) {
        return productMapper.deleteShoesSize(sizeId);
    }
    @Override
    public int editShoesSize(ShoesSize shoesSize) {
        return productMapper.editShoesSize(shoesSize);
    }
    @Override
    public List<ShoesSize> getAllShoesSizeList() {
        return productMapper.getShoesSizeList();
    }


    //鞋子
    @Override
    public PageInfo<Shoes> getShoesList(int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Shoes> list = productMapper.getShoesList();
        return new PageInfo<>(list);
    }
    @Override
    public Shoes getShoesById(int shoesId) {
        return productMapper.getShoesById(shoesId);
    }
    @Override
    public int editShoes(Shoes shoes) {
        return productMapper.editShoes(shoes);
    }
    @Override
    public int addShoes(Shoes shoes){
        int result = productMapper.addShoes(shoes);
        int result2=productMapper.addInventoryList(shoes.getShoeId(),shoes.getInventoryList());
        return result+result2;
    }
    @Override
    public int updateDisableStatus(int shoesId, int disableStatus) {
        return productMapper.updateDisableStatus(shoesId,disableStatus);
    }
    @Override
    public int deleteShoes(int shoeId) {
        return productMapper.deleteShoes(shoeId);
    }


    //库存表
    @Override
    public int deleteInventoryList(int shoes_id,int shoes_size_id) {
        return productMapper.deleteInventoryList(shoes_id,shoes_size_id);
    }
    @Override
    public int editInventory(int shoes_id,int shoes_size_id,int quantity) {
        return productMapper.editInventory(shoes_id,shoes_size_id,quantity);
    }


}
