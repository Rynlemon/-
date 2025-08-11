package com.zhk.pojo;

import java.util.List;

public class Shoes {
    // 鞋子ID
    private Integer shoeId;
    // 鞋子序列号
    private String serialNumber;
    // 鞋子名称
    private String name;
    // 鞋子价格
    private String originalPrice;
    // 折扣价格
    private String discountPrice;
    //上市日期
    private String launchDate;
    //产地
    private String origin;
    // 性别
    private String genderApplication;
    // 描述
    private String productDescription;
    // 累计销售量
    private String totalSales;
    // 详情信息
    private String detailedInfo;
    // 积分
    private String singleItemPoint;
    // 鞋子状态
    private String disableStatus;
    // 鞋子图片
    private String productImageUrl;

    private Brand brand;

    private Color color;

    private ShoesType shoesType;

    private List<Inventory> inventoryList;

    public Integer getShoeId() {
        return shoeId;
    }

    public void setShoeId(Integer shoeId) {
        this.shoeId = shoeId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(String discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getGenderApplication() {
        return genderApplication;
    }

    public void setGenderApplication(String genderApplication) {
        this.genderApplication = genderApplication;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(String totalSales) {
        this.totalSales = totalSales;
    }

    public String getDetailedInfo() {
        return detailedInfo;
    }

    public void setDetailedInfo(String detailedInfo) {
        this.detailedInfo = detailedInfo;
    }

    public String getSingleItemPoint() {
        return singleItemPoint;
    }

    public void setSingleItemPoint(String singleItemPoint) {
        this.singleItemPoint = singleItemPoint;
    }

    public String getDisableStatus() {
        return disableStatus;
    }

    public void setDisableStatus(String disableStatus) {
        this.disableStatus = disableStatus;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ShoesType getShoesType() {
        return shoesType;
    }

    public void setShoesType(ShoesType shoesType) {
        this.shoesType = shoesType;
    }

    public List<Inventory> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(List<Inventory> inventoryList) {
        this.inventoryList = inventoryList;
    }
}
