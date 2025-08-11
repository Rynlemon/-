package com.zhk.service;

import com.github.pagehelper.PageInfo;
import com.zhk.pojo.*;

import java.util.List;

public interface ProductService {
    //品牌
    PageInfo<Brand> getBrandList(int pageNum, int pageSize);
    int addBrand(Brand brand);
    int deleteBrand(int brandId);
    int editBrand(Brand brand);
    List<Brand> getAllBrandList();

    //品牌类型
    PageInfo<ShoesType> getShoesTypeList(int pageNum, int pageSize);
    int addShoesType(ShoesType shoesType);
    int deleteShoesType(int typeId);
    int editShoesType(ShoesType shoesType);
    List<ShoesType> getAllShoesTypeList();

    //品牌颜色
    PageInfo<Color> getColorList(int pageNum, int pageSize);
    int addColor(Color color);
    int deleteColor(int colorId);
    int editColor(Color color);
    List<Color> getAllColorList();

    //品牌尺寸
    PageInfo<ShoesSize>getShoesSizeList(int pageNum, int pageSize);
    int addShoesSize(ShoesSize shoesSize);
    int deleteShoesSize(int sizeId);
    int editShoesSize(ShoesSize shoesSize);
    List<ShoesSize> getAllShoesSizeList();

    //鞋子表
    PageInfo<Shoes> getShoesList(int pageNum, int pageSize);
    Shoes getShoesById(int shoesId);
    int editShoes(Shoes  shoes);
    int addShoes(Shoes shoes);
    int updateDisableStatus(int shoesId, int disableStatus);
    int deleteShoes(int shoeId);
    //库存表
    int deleteInventoryList(int shoes_id,int shoes_size_id);
    int editInventory(int shoes_id,int shoes_size_id,int quantity);

}
