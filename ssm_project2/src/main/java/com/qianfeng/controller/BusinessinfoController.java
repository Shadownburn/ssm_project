package com.qianfeng.controller;


import com.qianfeng.pojo.BusinessUserAndUsername;
import com.qianfeng.pojo.Businessinfo;
import com.qianfeng.service.BusinessinfoServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/ BusinessinfoController")
public class BusinessinfoController {

    @Autowired
    BusinessinfoServie businessinfoServie;

    @RequestMapping("/getBusinessAll")
    public String getBusinessAll(HttpServletRequest request){

        List<BusinessUserAndUsername> businessinfoList = businessinfoServie.getBusinessAll();
        request.setAttribute("businessinfoList",businessinfoList);
        return "../page/business/Aquery_Business.jsp";
    }
}
