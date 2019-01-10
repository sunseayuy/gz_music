package com.pan.service.impl;

import com.pan.pojo.Comment;

import java.util.List;

/**
 * Title: CommentService
 * Description:
 * 歌曲评论信息数据接口
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月5日
 */
public interface CommentService {
    /**
     * 新增歌曲评论信息
     *
     * @param comment
     * @return
     */
    boolean addComment(Comment comment);
    /**
     * 删除歌曲评论
     *
     * @param comment_id
     * @return
     */
    boolean  deleteComment(int comment_id,int song_id);
    /**
     * 删除歌曲评论
     *
     * @param song_id
     * @return
     */
    List<Comment> findBysong_id(int song_id);
}
