package com.zhk.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhk.mapper.CooperationMapper;
import com.zhk.pojo.Cooperation;
import com.zhk.pojo.Link;
import com.zhk.service.CooperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CooperationServiceImpl implements CooperationService {
    @Autowired
    private CooperationMapper cooperationMapper;
    @Override
    public List<Cooperation> getCooperationLinks(){
        return cooperationMapper.getCooperationLinks();
    }
    @Override
    public PageInfo<Cooperation> getCooperation(int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Cooperation> list = cooperationMapper.getCooperationLinks();
        return new PageInfo<>(list);
    }
    @Override
    public int addCooperation(Link link){
        return cooperationMapper.addCooperation(link);
    }
    @Override
    public int deleteCooperation(int id){
        return cooperationMapper.deleteCooperation(id);
    }

    @Override
    public int updateCooperation(Link link){
        return cooperationMapper.updateCooperation(link);
    }
}
