package com.zhk.pojo;

public class Brand {
    private Integer brandId;
    private String brandGender;
    private int brandDisabledStatus;
    private String brandName;
    private String brandNotes;

    public int getBrandDisabledStatus() {
        return brandDisabledStatus;
    }

    public void setBrandDisabledStatus(int brandDisabledStatus) {
        this.brandDisabledStatus = brandDisabledStatus;
    }

    public String getBrandNotes() {
        return brandNotes;
    }

    public void setBrandNotes(String brandNotes) {
        this.brandNotes = brandNotes;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandGender() {
        return brandGender;
    }

    public void setBrandGender(String brandGender) {
        this.brandGender = brandGender;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
