package com.zhk.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhk.mapper.AdvertisementMapper;
import com.zhk.pojo.Advertisement;
import com.zhk.pojo.Cooperation;
import com.zhk.service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvertisementServiceImpl implements AdvertisementService {
    @Autowired
    private AdvertisementMapper advertisementMapper;
    @Override
    public PageInfo<Advertisement> getAdvertisement(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Advertisement> list = advertisementMapper.getAdvertisement();
        return new PageInfo<>(list);
    }
    @Override
    public int addAdvertisement(Advertisement advertisement) {
        return advertisementMapper.addAdvertisement(advertisement);
    }
    @Override
    public int deleteAdvertisement(int id) {
        return advertisementMapper.deleteAdvertisement(id);
    }

    @Override
    public int editAdvertisement(Advertisement advertisement) {
       return advertisementMapper.editAdvertisement(advertisement);
    }
}
