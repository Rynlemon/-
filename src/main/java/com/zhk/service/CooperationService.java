package com.zhk.service;

import com.github.pagehelper.PageInfo;
import com.zhk.pojo.Cooperation;
import com.zhk.pojo.Link;

import java.util.List;

public interface CooperationService {
    List<Cooperation> getCooperationLinks();
    PageInfo<Cooperation> getCooperation(int pageNum, int pageSize);
    int addCooperation(Link link);
    int deleteCooperation(int id);
    int updateCooperation(Link link);
}
