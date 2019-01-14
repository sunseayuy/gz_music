package com.pan.service.impl;

import com.github.pagehelper.PageHelper;
import com.pan.dao.ArtistinfoDao;
import com.pan.pojo.Artistinfo;
import com.pan.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Title: ArtistinfoServiceImpl
 * Description:
 * 歌曲数据操作实现类
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月2日
 */
@Service
public class ArtistinfoServiceImpl implements ArtistinfoService {
    @Autowired
    private ArtistinfoDao artistinfoDao;

    @Override
    public boolean addArtistinfo(Artistinfo artistinfo) {
        boolean flag = false;
        try {
            artistinfoDao.addArtistinfo(artistinfo);
            flag = true;
        } catch (Exception e) {
            System.out.println("新增失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateArtistinfo(Artistinfo artistinfo) {
        boolean flag = false;
        try {
            artistinfoDao.updateArtistinfo(artistinfo);
            flag = true;
        } catch (Exception e) {
            System.out.println("修改失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteArtistinfo(int singer_id) {
        boolean flag = false;
        try {
            artistinfoDao.deleteArtistinfo(singer_id);
            flag = true;
        } catch (Exception e) {
            System.out.println("删除失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public List<Artistinfo> findByartist_firsthanzicode(String firsthanzicode) {
        return artistinfoDao.findByartist_firsthanzicode(firsthanzicode);
    }

    @Override
    public List<Artistinfo> findByartist_firsthanzicode_page(String firsthanzicode, int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<Artistinfo> allItems = artistinfoDao.findByartist_firsthanzicode(firsthanzicode);        //全部商品
        int countNums = artistinfoDao.findByartist_firsthanzicode_countItem(firsthanzicode);            //总记录数
        PageBean<Artistinfo> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allItems);
        return pageData.getItems();
    }

    @Override
    public List<Artistinfo> findBysinger_label(String singer_label) {
        return artistinfoDao.findBysinger_label(singer_label);
    }

    @Override
    public List<Artistinfo> findBysinger_label_page(String singer_label, int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<Artistinfo> allItems = artistinfoDao.findBysinger_label(singer_label);        //全部商品
        int countNums = artistinfoDao.findBysinger_label_countItem(singer_label);            //总记录数
        PageBean<Artistinfo> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allItems);
        return pageData.getItems();
    }

    @Override
    public Artistinfo findBysinger_id(int singer_id) {
        return artistinfoDao.findBysinger_id(singer_id);
    }

    @Override
    public List<Artistinfo> findsingerall() {
        return artistinfoDao.findsingerall();
    }

    @Override
    public List<Artistinfo> findsingerall_page(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<Artistinfo> allItems = artistinfoDao.findsingerall();        //全部商品
        int countNums = artistinfoDao.singer_countItem();            //总记录数
        PageBean<Artistinfo> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allItems);
        return pageData.getItems();
    }

    @Override
    public List<Artistinfo> findpopuler() {
        return artistinfoDao.findpopoler();
    }
}
