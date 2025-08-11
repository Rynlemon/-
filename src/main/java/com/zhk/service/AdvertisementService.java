package com.zhk.service;

import com.github.pagehelper.PageInfo;
import com.zhk.pojo.Advertisement;

import java.util.List;

public interface AdvertisementService {
    PageInfo<Advertisement> getAdvertisement(int pageNum, int pageSize);
    int addAdvertisement(Advertisement advertisement);
    int deleteAdvertisement(int id);
    int editAdvertisement(Advertisement advertisement);
}
