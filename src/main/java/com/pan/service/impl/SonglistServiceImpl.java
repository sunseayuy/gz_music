package com.pan.service.impl;

import com.github.pagehelper.PageHelper;
import com.pan.dao.SonglistDao;
import com.pan.pojo.Songlist;
import com.pan.pojo.Songlist_relation;
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
        List<Songlist> p=songlistDao.findBysonglist_label(songlist_label);
        int i=p.size();
        for(int j=0;j<i;j++)
        {
            p.get(j).setUser_nickname(songlistDao.finduser_nickname(p.get(j).getSonglist_id()));
        }
        return p;
    }

    @Override
    public List<Songlist> findBysonglist_labelpage(String songlist_label, int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<Songlist> allItems = songlistDao.findBysonglist_label(songlist_label);
        int i=allItems.size();
        for(int j=0;j<i;j++)
        {
            allItems.get(j).setUser_nickname(songlistDao.finduser_nickname(allItems.get(j).getSonglist_id()));
        }
        int countNums = songlistDao.findBysonglist_label_countItem(songlist_label);            //总记录数
        PageBean<Songlist> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allItems);
        return pageData.getItems();
    }

    @Override
    public Songlist findBysonglist_id(int songlist_id) {
        Songlist p=songlistDao.findBysonglist_id(songlist_id);
        p.setUser_nickname(songlistDao.finduser_nickname(p.getSonglist_id()));
        return p;
    }

    @Override
    public List<Songlist> findall() {
        List<Songlist> p=songlistDao.findall();
        int i=p.size();
        for(int j=0;j<i;j++)
        {
            p.get(j).setUser_nickname(songlistDao.finduser_nickname(p.get(j).getSonglist_id()));
        }
        return p;
    }

    @Override
    public List<Songlist> findall_page(int currentPage,int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<Songlist> allItems = songlistDao.findall();
        int i=allItems.size();
        for(int j=0;j<i;j++)
        {
            allItems.get(j).setUser_nickname(songlistDao.finduser_nickname(allItems.get(j).getSonglist_id()));
        }
        int countNums = songlistDao.countItem();
        PageBean<Songlist> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allItems);
        return pageData.getItems();
    }

    @Override
    public List<Songlist> findSonglistbyuser_id(int user_id) {
        List<Songlist> p=songlistDao.findSonglistbyuser_id(user_id);
        int i=p.size();
        for(int j=0;j<i;j++)
        {
            p.get(j).setUser_nickname(songlistDao.finduser_nickname(p.get(j).getSonglist_id()));
        }
        return p;
    }

    @Override
    public boolean addSongintoSonglist(Songlist_relation songlist_relation) {
        boolean flag = false;
        try {
            songlistDao.addSongintoSonglist(songlist_relation);
            flag = true;
        } catch (Exception e) {
            System.out.println("新增失败!");
            e.printStackTrace();
        }
        return flag;
    }
}