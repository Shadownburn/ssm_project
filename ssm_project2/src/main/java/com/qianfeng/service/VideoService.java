package com.qianfeng.service;

import com.qianfeng.pojo.Video;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

public interface VideoService {

    boolean upload(Video video, MultipartFile multipartFile, HttpServletRequest request) throws IOException;

    /**
     * 查询当前用户已上传的相关视频数据
     * @param business_id
     * @return
     */
    List<Video> selectVideoByBusinessId(int business_id);

    //获取所有视频
    List<Video> getVideoAll();
}
