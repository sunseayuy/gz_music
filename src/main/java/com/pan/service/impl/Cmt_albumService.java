package com.pan.service.impl;


import com.pan.pojo.Cmt_album;

import java.util.List;

/**
 * Title: Cmt_songlistService
 * Description:
 * 专辑评论信息数据接口
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月6日
 */
public interface Cmt_albumService {
    /**
     * 新增专辑评论信息
     *
     * @param cmt_album
     * @return
     */
    boolean addCmt_album(Cmt_album cmt_album);
    /**
     * 删除歌单评论
     *
     * @param comment_id
     * @return
     */
    boolean  deleteCmt_album(int comment_id,int album_id);
    /**
     * 通过歌单id查看评论
     *
     * @param album_id
     * @return
     */
    List<Cmt_album> findByalbum_id(int album_id);
}