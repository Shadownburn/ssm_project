package com.qianfeng.controller;

import com.qianfeng.pojo.Business;
import com.qianfeng.pojo.Video;
import com.qianfeng.service.VideoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/VideoController")
public class VideoController {
    @Autowired
    VideoService videoService;

    @RequestMapping("/uploadVideo")
    public String uploadVideo(Video video, @RequestParam("file") MultipartFile multipartFile, HttpServletRequest request){
        boolean result = false;
        System.out.println(video.getVideo_title());
        System.out.println(multipartFile+"========================");
        //1执行上传功能
        try {
            result = videoService.upload(video,multipartFile,request);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //处理反馈数据
        if (result){
            return "../page/video/addVideo.jsp";
        }else{
            return null;
        }

    }

    @RequestMapping("/queryVideo")
    public String queryVideo(HttpServletRequest request){
        Business business = (Business)request.getSession().getAttribute("business");
        List<Video> videoList = videoService.selectVideoByBusinessId(business.getBusiness_id());
        request.setAttribute("videoList",videoList);
        return "../page/video/query_Video.jsp";
    }

    @RequestMapping("/AqueryVideo")
    public String AqueryVideo(HttpServletRequest request){
        List<Video> videoList = videoService.getVideoAll();
        request.setAttribute("videoList",videoList);
        return "../page/video/Aquery_Video.jsp";
    }


}
