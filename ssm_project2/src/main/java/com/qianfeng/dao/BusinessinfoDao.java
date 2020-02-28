package com.qianfeng.dao;

import com.qianfeng.pojo.Businessinfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.qianfeng.pojo.BusinessUserAndUsername;

public interface BusinessinfoDao {

    /**
     * 插入商家信息
     * @param business_id
     * @return
     */
    int insertBusinessInfo(int business_id);

    /*查看商户冻结情况*/
    int selectBusinessInfoById(int business_id);

    /*查看所有商家信息*/
     List<BusinessUserAndUsername> getBusinessAll();

}
