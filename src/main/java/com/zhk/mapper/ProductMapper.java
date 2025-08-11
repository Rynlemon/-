package com.zhk.mapper;

import com.zhk.pojo.*;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface ProductMapper {
    //品牌展示
    @Select("select * from brands")
    List<Brand> getBrandList();
    @Insert("insert into brands(brand_name,brand_notes,brand_gender,brand_disabled_status) values(#{brandName},#{brandNotes},#{brandGender},#{brandDisabledStatus})")
    int addBrand(Brand brand);
    @Delete("delete from brands where brand_id=#{brandId}")
    int deleteBrand(int brandId);
    @Update("update brands set brand_name=#{brandName},brand_notes=#{brandNotes},brand_gender=#{brandGender},brand_disabled_status=#{brandDisabledStatus} where brand_id=#{brandId}")
    int editBrand(Brand brand);

    //鞋子类型
    @Select("select * from shoe_types")
    List<ShoesType> getShoesTypeList();
    @Insert("insert into shoe_types(type_name,type_notes,type_status) values(#{typeName},#{typeNotes},#{typeStatus})")
    int addShoesType(ShoesType shoesType);
    @Delete("delete from shoe_types where type_id= #{typeId}")
    //鞋子在更新的时候api必须要保证信息完整性，不能单个修改内容，只能整体修改
    int deleteShoesType(int typeId);
    @Update("update shoe_types set type_name=#{typeName},type_notes=#{typeNotes},type_status=#{typeStatus} where type_id=#{typeId}")
    int editShoesType(ShoesType shoesType);

    //鞋子颜色
    @Select("select * from colors")
    List<Color> getColorList();
    @Insert("insert into colors(color_name,color_notes,color_disabled_status) values(#{colorName},#{colorNotes},#{colorDisabledStatus})")
    int addColor(Color color);
    @Delete("delete from colors where color_id= #{colorId}")
    int deleteColor(int colorId);
    @Update("update colors set color_name= #{colorName},color_notes= #{colorNotes},color_disabled_status= #{colorDisabledStatus} where color_id= #{colorId}")
    int editColor(Color color);

    //鞋子尺寸
    @Select("select * from shoe_sizes")
    List<ShoesSize> getShoesSizeList();
    @Insert("insert into shoe_sizes(size_number,size_status,size_notes) values(#{sizeNumber},#{sizeStatus},#{sizeNotes})")
    int addShoesSize(ShoesSize shoesSize);
    @Delete("delete from shoe_sizes where size_id= #{shoesSize}")
    int deleteShoesSize(int sizeId);
    @Update("update shoe_sizes set size_notes= #{sizeNotes},size_number= #{sizeNumber},size_status=#{sizeStatus} where size_id = #{sizeId}")
    int editShoesSize(ShoesSize shoesSize);

    //鞋子
    List<Shoes> getShoesList();
    Shoes getShoesById(int shoesId);
    int editShoes(Shoes  shoes);
    int addShoes(Shoes shoes);
    int updateDisableStatus(int shoeId, int disableStatus);
    int deleteShoes(int shoeId);

    //库存
    int addInventoryList(int shoes_id,List<Inventory> inventory);
    int deleteInventoryList(int shoes_id,int shoes_size_id);
    int editInventory(int shoes_id,int shoes_size_id,int quantity);
}
