package com.pan.service.impl;

import com.github.pagehelper.PageHelper;
import com.pan.dao.Cmt_albumDao;
import com.pan.pojo.Cmt_album;
import com.pan.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Title: Cmt_albumServiceImpl
 * Description:
 * 专辑评论数据操作实现类
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月6日
 */
@Service
public class Cmt_albumServiceImpl implements Cmt_albumService{
    @Autowired
    private Cmt_albumDao cmt_albumDao;
    @Override
    public boolean addCmt_album(Cmt_album cmt_album) {
        boolean flag = false;
        try {
            cmt_albumDao.addCmt_album(cmt_album);
            flag = true;
        } catch (Exception e) {
            System.out.println("新增失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteCmt_album(int comment_id,int album_id) {
        boolean flag = false;
        try {
            cmt_albumDao.deleteCmt_album(comment_id,album_id);
            flag = true;
        } catch (Exception e) {
            System.out.println("删除失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public List<Cmt_album> findByalbum_id(int album_id) {
        List<Cmt_album> p=cmt_albumDao.findByalbum_id(album_id);
        int i=p.size();
        for(int j=0;j<i;j++)
        {
            p.get(j).setUser_nickname(cmt_albumDao.finduser_nickname(p.get(j).getComment_id()));
        }
        return p;
    }

    @Override
    public List<Cmt_album> findByalbum_id_page(int album_id, int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<Cmt_album> allItems = cmt_albumDao.findByalbum_id(album_id);
        int i=allItems.size();
        for(int j=0;j<i;j++)
        {
            allItems.get(j).setUser_nickname(cmt_albumDao.finduser_nickname(allItems.get(j).getComment_id()));
        }
        int countNums = cmt_albumDao.findByalbum_id_countItem(album_id);            //总记录数
        PageBean<Cmt_album> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allItems);
        return pageData.getItems();
    }

    @Override
    public List<Cmt_album> findall(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<Cmt_album> allItems = cmt_albumDao.findall();
        int i=allItems.size();
        for(int j=0;j<i;j++)
        {
            allItems.get(j).setUser_nickname(cmt_albumDao.finduser_nickname(allItems.get(j).getComment_id()));
        }
        int countNums = cmt_albumDao.findall_countItem();            //总记录数
        PageBean<Cmt_album> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allItems);
        return pageData.getItems();
    }
}
