package com.pan.service.impl;

import com.github.pagehelper.PageHelper;
import com.pan.dao.Cmt_songlistDao;
import com.pan.pojo.Cmt_songlist;
import com.pan.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Title: Cmt_songlistServiceImpl
 * Description:
 * 歌曲评论数据操作实现类
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月5日
 */
@Service
public class Cmt_songlistServiceImpl implements Cmt_songlistService {
    @Autowired
    private Cmt_songlistDao cmt_songlistDao;
    @Override
    public boolean addCmt_songlist(Cmt_songlist cmt_songlist) {
        boolean flag = false;
        try {
            cmt_songlistDao.addCmt_songlist(cmt_songlist);
            flag = true;
        } catch (Exception e) {
            System.out.println("新增失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteCmt_songlist(int comment_id,int songlist_id) {
        boolean flag = false;
        try {
            cmt_songlistDao.deleteCmt_songlist(comment_id,songlist_id);
            flag = true;
        } catch (Exception e) {
            System.out.println("删除失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public List<Cmt_songlist> findBysonglist_id(int songlist_id) {
        return cmt_songlistDao.findBysonglist_id(songlist_id);
    }

    @Override
    public List<Cmt_songlist> findBysonglist_id_page(int songlist_id, int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<Cmt_songlist> allItems = cmt_songlistDao.findBysonglist_id(songlist_id);        //全部商品
        int countNums = cmt_songlistDao.findBysonglist_id_countItem(songlist_id);            //总记录数
        PageBean<Cmt_songlist> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allItems);
        return pageData.getItems();
    }
}
