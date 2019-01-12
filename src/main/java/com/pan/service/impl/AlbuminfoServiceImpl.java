package com.pan.service.impl;

import com.github.pagehelper.PageHelper;
import com.pan.dao.AlbuminfoDao;
import com.pan.pojo.Albuminfo;
import com.pan.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Title: AlbuminfoServiceImpl
 * Description:
 * 专辑数据操作实现类
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月4日
 */
@Service
public class AlbuminfoServiceImpl implements AlbuminfoService{
    @Autowired
    private AlbuminfoDao albuminfoDao;
    @Override
    public boolean addAlbuminfo(Albuminfo albuminfo) {
        boolean flag = false;
        try {
            albuminfoDao.addAlbuminfo(albuminfo);
            flag = true;
        } catch (Exception e) {
            System.out.println("新增失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateAlbuminfo(Albuminfo albuminfo) {
        boolean flag = false;
        try {
            albuminfoDao.updateAlbuminfo(albuminfo);
            flag = true;
        } catch (Exception e) {
            System.out.println("修改失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteAlbuminfo(int album_id) {
        boolean flag = false;
        try {
            albuminfoDao.deleteAlbuminfo(album_id);
            flag = true;
        } catch (Exception e) {
            System.out.println("删除失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public List<Albuminfo> findalbuminfoBysong_id(int song_id) {
        return albuminfoDao.findalbuminfoBysong_id(song_id);
    }

    @Override
    public List<Albuminfo> findalbuminfoByalbum_label(String album_label) {
        return albuminfoDao.findalbuminfoByalbum_label(album_label);
    }

    @Override
    public List<Albuminfo> findalbuminfoByalbum_label_page(String album_label, int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<Albuminfo> allItems = albuminfoDao.findalbuminfoByalbum_label(album_label);        //全部商品
        int countNums = albuminfoDao.findalbuminfoByalbum_label_countItem(album_label);            //总记录数
        PageBean<Albuminfo> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allItems);
        return pageData.getItems();
    }

    @Override
    public List<Albuminfo> findalbuminfoBysinger_id(int singer_id) {
        return albuminfoDao.findalbuminfoBysinger_id(singer_id);
    }

    @Override
    public List<Albuminfo> findalbuminfoBysinger_id_page(int singer_id, int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<Albuminfo> allItems = albuminfoDao.findalbuminfoBysinger_id(singer_id);        //全部商品
        int countNums = albuminfoDao.findalbuminfoBysinger_id_countItem(singer_id);            //总记录数
        PageBean<Albuminfo> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allItems);
        return pageData.getItems();
    }

    @Override
    public Albuminfo findalbuminfoByalbum_id(int album_id) {
        return albuminfoDao.findalbuminfoByalbum_id(album_id);
    }

    @Override
    public List<Albuminfo> findalbuminfoBysinger_label(String singer_label) {
        return albuminfoDao.findalbuminfoBysinger_lable(singer_label);
    }

    @Override
    public List<Albuminfo> findalbuminfoBysinger_label_page(String singer_label, int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<Albuminfo> allItems = albuminfoDao.findalbuminfoBysinger_lable(singer_label);        //全部商品
        int countNums = albuminfoDao.findalbuminfoBysinger_lable_countItem(singer_label);            //总记录数
        PageBean<Albuminfo> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allItems);
        return pageData.getItems();
    }

    @Override
    public List<Albuminfo> findalbuminfoall() {
        return albuminfoDao.findalbuminfoall();
    }

    @Override
    public List<Albuminfo> findalbuminfoall_page(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<Albuminfo> allItems = albuminfoDao.findalbuminfoall();        //全部商品
        int countNums = albuminfoDao.findalbuminfoall_countItem();            //总记录数
        PageBean<Albuminfo> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allItems);
        return pageData.getItems();
    }


}