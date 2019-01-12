package com.pan.service.impl;

import com.github.pagehelper.PageHelper;
import com.pan.dao.SonglistDao;
import com.pan.pojo.Songlist;
import com.pan.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SonglistServiceImpl implements SonglistService {
    @Autowired
    private SonglistDao songlistDao;
    @Override
    public boolean addSonglist(Songlist songlist) {
        boolean flag = false;
        try {
            songlistDao.addSonglist(songlist);
            flag = true;
        } catch (Exception e) {
            System.out.println("新增失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateSonglist(Songlist songlist) {
        boolean flag = false;
        try {
            songlistDao.updateSonglist(songlist);
            flag = true;
        } catch (Exception e) {
            System.out.println("修改失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteSonglist(int songlist_id) {
        boolean flag = false;
        try {
            songlistDao.deleteSonglist(songlist_id);
            flag = true;
        } catch (Exception e) {
            System.out.println("删除失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public List<Songlist> findBysonglist_label(String songlist_label) {
        return songlistDao.findBysonglist_label(songlist_label);
    }

    @Override
    public List<Songlist> findBysonglist_labelpage(String songlist_label, int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<Songlist> allItems = songlistDao.findBysonglist_label(songlist_label);        //全部商品
        int countNums = songlistDao.findBysonglist_label_countItem(songlist_label);            //总记录数
        PageBean<Songlist> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allItems);
        return pageData.getItems();
    }

    @Override
    public Songlist findBysonglist_id(int songlist_id) {
        return songlistDao.findBysonglist_id(songlist_id);
    }

    @Override
    public List<Songlist> findall() {
        return songlistDao.findall();
    }

    @Override
    public List<Songlist> findall_page(int currentPage,int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<Songlist> allItems = songlistDao.findall();
        int countNums = songlistDao.countItem();
        PageBean<Songlist> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allItems);
        return pageData.getItems();
    }
}