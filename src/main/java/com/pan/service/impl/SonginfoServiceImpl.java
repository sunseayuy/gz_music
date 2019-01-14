package com.pan.service.impl;

import com.github.pagehelper.PageHelper;
import com.pan.dao.SonginfoDao;
import com.pan.pojo.Songinfo;
import com.pan.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Title: SonginfoServiceImpl
 * Description:
 * 歌曲数据操作实现类
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月2日
 */
@Service
class SonginfoServiceImpl implements SonginfoService {
    @Autowired
    private SonginfoDao songinfoDao;
    @Override
    public boolean addSonginfo(Songinfo songinfo) {
        boolean flag = false;
        try {
            songinfoDao.addSonginfo(songinfo);
            flag = true;
        } catch (Exception e) {
            System.out.println("新增失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateSonginfo(Songinfo songinfo) {
        boolean flag = false;
        try {
            songinfoDao.updateSonginfo(songinfo);
            flag = true;
        } catch (Exception e) {
            System.out.println("修改失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateSonginfo_lable(Songinfo songinfo) {
        boolean flag = false;
        try {
            songinfoDao.updateSonginfo_lable(songinfo);
            flag = true;
        } catch (Exception e) {
            System.out.println("修改失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteSonginfo(int song_id) {
        boolean flag = false;
        try {
            songinfoDao.deleteSonginfo(song_id);
            flag = true;
        } catch (Exception e) {
            System.out.println("删除失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public List<Songinfo> findSonginfoBySonglabel(String song_label) {
        List<Songinfo> p=songinfoDao.findBysong_label(song_label);
        int i=p.size();
        for(int j=0;j<i;j++)
        {
            p.get(j).setSinger_name(songinfoDao.findsinger_name(p.get(j).getSong_id()));
            p.get(j).setAlbum_name(songinfoDao.findalbum_name(p.get(j).getSong_id()));
        }
        return p;
    }

    @Override
    public List<Songinfo> findSonginfoBySonglabel_page(String song_label, int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<Songinfo> allItems = songinfoDao.findBysong_label(song_label);
        int i=allItems.size();
        for(int j=0;j<i;j++)
        {
            allItems.get(j).setSinger_name(songinfoDao.findsinger_name(allItems.get(j).getSong_id()));
            allItems.get(j).setAlbum_name(songinfoDao.findalbum_name(allItems.get(j).getSong_id()));
        }
        int countNums = songinfoDao.findBysong_label_countItem(song_label);            //总记录数
        PageBean<Songinfo> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allItems);
        return pageData.getItems();
    }

    @Override
    public List<Songinfo> findSonginfoByName(String song_name) {
        List<Songinfo> p=songinfoDao.findBysong_name(song_name);
        int i=p.size();
        for(int j=0;j<i;j++)
        {
            p.get(j).setSinger_name(songinfoDao.findsinger_name(p.get(j).getSong_id()));
            p.get(j).setAlbum_name(songinfoDao.findalbum_name(p.get(j).getSong_id()));
        }
        return p;
    }

    @Override
    public List<Songinfo> findsonginfoBysinger_id(int singer_id) {
        List<Songinfo> p=songinfoDao.findsonginfoBysinger_id(singer_id);
        int i=p.size();
        for(int j=0;j<i;j++)
        {
            p.get(j).setSinger_name(songinfoDao.findsinger_name(p.get(j).getSong_id()));
            p.get(j).setAlbum_name(songinfoDao.findalbum_name(p.get(j).getSong_id()));
        }
        return p;
    }

    @Override
    public int findsonginfoBysinger_id_number(int singer_id) {
        return songinfoDao.findsonginfoBysinger_id_countItem(singer_id);
    }

    @Override
    public List<Songinfo> findsonginfoBysinger_id_page(int singer_id, int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<Songinfo> allItems = songinfoDao.findsonginfoBysinger_id(singer_id);
        int i=allItems.size();
        for(int j=0;j<i;j++)
        {
            allItems.get(j).setSinger_name(songinfoDao.findsinger_name(allItems.get(j).getSong_id()));
            allItems.get(j).setAlbum_name(songinfoDao.findalbum_name(allItems.get(j).getSong_id()));
        }
        int countNums = songinfoDao.findsonginfoBysinger_id_countItem(singer_id);            //总记录数
        PageBean<Songinfo> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allItems);
        return pageData.getItems();
    }

    @Override
    public Songinfo findsonginfoBysong_id(int song_id) {
        Songinfo p= songinfoDao.findsonginfoBysong_id(song_id);
        p.setSinger_name(songinfoDao.findsinger_name(p.getSong_id()));
        p.setAlbum_name(songinfoDao.findalbum_name(p.getSong_id()));
        return p;
    }

    @Override
    public List<Songinfo> findsonginfoByalbum_id(int album_id) {
        List<Songinfo> p=songinfoDao.findsonginfoByalbum_id(album_id);
        int i=p.size();
        for(int j=0;j<i;j++)
        {
            p.get(j).setSinger_name(songinfoDao.findsinger_name(p.get(j).getSong_id()));
            p.get(j).setAlbum_name(songinfoDao.findalbum_name(p.get(j).getSong_id()));
        }
        return p;
    }

    @Override
    public List<Songinfo> findsonginfoByalbum_id_page(int album_id, int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<Songinfo> allItems = songinfoDao.findsonginfoByalbum_id(album_id);
        int i=allItems.size();
        for(int j=0;j<i;j++)
        {
            allItems.get(j).setSinger_name(songinfoDao.findsinger_name(allItems.get(j).getSong_id()));
            allItems.get(j).setAlbum_name(songinfoDao.findalbum_name(allItems.get(j).getSong_id()));
        }
        int countNums = songinfoDao.findsonginfoByalbum_id_countItem(album_id);            //总记录数
        PageBean<Songinfo> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allItems);
        return pageData.getItems();
    }

    @Override
    public List<Songinfo> findsonginfoBysonglist_id(int songlist_id) {
        List<Songinfo> allItems=songinfoDao.findsonginfoBysonglist_id(songlist_id);
        int i=allItems.size();
        for(int j=0;j<i;j++)
        {
            allItems.get(j).setSinger_name(songinfoDao.findsinger_name(allItems.get(j).getSong_id()));
            allItems.get(j).setAlbum_name(songinfoDao.findalbum_name(allItems.get(j).getSong_id()));
        }
        return allItems;
    }

    @Override
    public List<Songinfo> findsonginfoBysonglist_id_page(int songlist_id, int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<Songinfo> allItems = songinfoDao.findsonginfoBysonglist_id(songlist_id);
        int i=allItems.size();
        for(int j=0;j<i;j++)
        {
            allItems.get(j).setSinger_name(songinfoDao.findsinger_name(allItems.get(j).getSong_id()));
            allItems.get(j).setAlbum_name(songinfoDao.findalbum_name(allItems.get(j).getSong_id()));
        }
        int countNums = songinfoDao.findsonginfoBysonglist_id_countItem(songlist_id);            //总记录数
        PageBean<Songinfo> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allItems);
        return pageData.getItems();
    }

    @Override
    public List<Songinfo> findall() {
        List<Songinfo> allItems=songinfoDao.findall();
        int i=allItems.size();
        for(int j=0;j<i;j++)
        {
            allItems.get(j).setSinger_name(songinfoDao.findsinger_name(allItems.get(j).getSong_id()));
            allItems.get(j).setAlbum_name(songinfoDao.findalbum_name(allItems.get(j).getSong_id()));
        }
        return allItems;
    }

    @Override
    public List<Songinfo> findall_page(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<Songinfo> allItems = songinfoDao.findall();
        int i=allItems.size();
        for(int j=0;j<i;j++)
        {
            allItems.get(j).setSinger_name(songinfoDao.findsinger_name(allItems.get(j).getSong_id()));
            allItems.get(j).setAlbum_name(songinfoDao.findalbum_name(allItems.get(j).getSong_id()));
        }
        int countNums = songinfoDao.countItem();
        PageBean<Songinfo> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allItems);
        return pageData.getItems();
    }
}
