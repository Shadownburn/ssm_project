package com.qianfeng.service.impl;

import com.qianfeng.dao.BusinessinfoDao;
import com.qianfeng.pojo.BusinessUserAndUsername;
import com.qianfeng.pojo.Businessinfo;
import com.qianfeng.service.BusinessinfoServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessinfoServiceImpl implements BusinessinfoServie {

    @Autowired
    BusinessinfoDao businessinfoDao;

    @Override
    public List<BusinessUserAndUsername> getBusinessAll() {
        return businessinfoDao.getBusinessAll();
    }
}
