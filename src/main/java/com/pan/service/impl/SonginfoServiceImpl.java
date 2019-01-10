package com.pan.service.impl;

import com.pan.dao.SonginfoDao;
import com.pan.pojo.Songinfo;
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
        return songinfoDao.findBysong_label(song_label);
    }

    @Override
    public List<Songinfo> findSonginfoByName(String song_name) {
        return songinfoDao.findBysong_name(song_name);
    }

    @Override
    public String findsinger_nameBySonginfo_song_name(String song_name) {
        return songinfoDao.findBySonginfo_song_name(song_name);
    }

    @Override
    public List<Songinfo> findsonginfoBysinger_id(int singer_id) {
        return songinfoDao.findsonginfoBysinger_id(singer_id);
    }

    @Override
    public Songinfo findsonginfoBysong_id(int song_id) {
        return songinfoDao.findsonginfoBysong_id(song_id);
    }

    @Override
    public List<Songinfo> findsonginfoByalbum_id(int album_id) {
        return songinfoDao.findsonginfoByalbum_id(album_id);
    }

    @Override
    public List<Songinfo> findsonginfoBysonglist_id(int songlist_id) {
        return songinfoDao.findsonginfoBysonglist_id(songlist_id);
    }
}
