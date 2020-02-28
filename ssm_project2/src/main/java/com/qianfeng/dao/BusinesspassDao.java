package com.qianfeng.dao;

import com.qianfeng.pojo.Businesspass;

public interface BusinesspassDao {

    /**
     * <!--##检查用户名对应密码是否正确-->
     * @param businesspass
     * @return
     */
    Businesspass selectBusinessPass(Businesspass businesspass);


    /**
     * <!--##创建对应用户的密码-->
     * @param businesspass
     * @return
     */
    int insertBusinessPass(Businesspass businesspass);
}
