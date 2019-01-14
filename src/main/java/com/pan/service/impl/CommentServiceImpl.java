package com.pan.service.impl;

import com.github.pagehelper.PageHelper;
import com.pan.dao.CommentDao;
import com.pan.pojo.Comment;
import com.pan.util.PageBean;
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
        List<Comment> p=commentDao.findBysong_id(song_id);
        int i=p.size();
        for(int j=0;j<i;j++)
        {
            p.get(j).setUser_nickname(commentDao.finduser_nickname(p.get(j).getComment_id()));
        }
        return p;
    }

    @Override
    public List<Comment> findBysong_id_page(int song_id, int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<Comment> allItems = commentDao.findBysong_id(song_id);
        int i=allItems.size();
        for(int j=0;j<i;j++)
        {
            allItems.get(j).setUser_nickname(commentDao.finduser_nickname(allItems.get(j).getComment_id()));
        }
        int countNums = commentDao.findBysong_id_countItem(song_id);            //总记录数
        PageBean<Comment> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allItems);
        return pageData.getItems();
    }

    @Override
    public List<Comment> findall(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<Comment> allItems = commentDao.findall();
        int i=allItems.size();
        for(int j=0;j<i;j++)
        {
            allItems.get(j).setUser_nickname(commentDao.finduser_nickname(allItems.get(j).getComment_id()));
        }
        int countNums = commentDao.findall_countItem();            //总记录数
        PageBean<Comment> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allItems);
        return pageData.getItems();
    }
}