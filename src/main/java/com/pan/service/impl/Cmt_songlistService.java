package com.pan.service.impl;


import com.pan.pojo.Cmt_songlist;

import java.util.List;

/**
 * Title: Cmt_songlistService
 * Description:
 * 歌单评论信息数据接口
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月5日
 */
public interface Cmt_songlistService {
    /**
     * 新增歌单评论信息
     *
     * @param cmt_songlist
     * @return
     */
    boolean addCmt_songlist(Cmt_songlist cmt_songlist);
    /**
     * 删除歌单评论
     *
     * @param comment_id
     * @return
     */
    boolean  deleteCmt_songlist(int comment_id,int songlist_id);
    /**
     * 通过歌单id查看评论
     *
     * @param songlist_id
     * @return
     */
    List<Cmt_songlist> findBysonglist_id(int songlist_id);
}
