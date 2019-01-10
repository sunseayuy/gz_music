package com.pan.service.impl;

import com.pan.dao.SonglistDao;
import com.pan.pojo.Songlist;
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
    public Songlist findBysonglist_id(int songlist_id) {
        return songlistDao.findBysonglist_id(songlist_id);
    }
}