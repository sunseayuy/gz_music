package com.pan.service.impl;

import com.pan.dao.CommentDao;
import com.pan.pojo.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Title: CommentServiceImpl
 * Description:
 * 歌曲评论数据操作实现类
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月5日
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentDao;
    @Override
    public boolean addComment(Comment comment) {
        boolean flag = false;
        try {
            commentDao.addComment(comment);
            flag = true;
        } catch (Exception e) {
            System.out.println("新增失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteComment(int comment_id,int song_id) {
        boolean flag = false;
        try {
            commentDao.deleteComment(comment_id,song_id);
            flag = true;
        } catch (Exception e) {
            System.out.println("删除失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public List<Comment> findBysong_id(int song_id) {
        return commentDao.findBysong_id(song_id);
    }
}