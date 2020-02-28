package com.qianfeng.service;

import com.qianfeng.pojo.BusinessUserAndUsername;
import com.qianfeng.pojo.Businessinfo;

import java.util.List;

public interface BusinessinfoServie {

    /*查看所有商家信息*/
    List<BusinessUserAndUsername> getBusinessAll();
}
