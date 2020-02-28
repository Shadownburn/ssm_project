package com.qianfeng.dao;

import com.qianfeng.pojo.Video;

import java.util.List;

public interface VideoDao {
    /**
     * 插入视频相关信息
     * @param video
     * @return
     */
    int insertVideo(Video video);

    /**
     * 查询视频信息
     * @param business_id
     * @return
     */
    List<Video> selectVideoByBusinessId(int business_id);

    //查看所夺视频
    List<Video> getVideoAll();

}
