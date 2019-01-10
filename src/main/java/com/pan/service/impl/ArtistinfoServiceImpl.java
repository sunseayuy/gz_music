package com.pan.service.impl;

import com.pan.dao.ArtistinfoDao;
import com.pan.pojo.Artistinfo;
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
    public List<Artistinfo> findBysinger_label(String singer_label) {
        return artistinfoDao.findBysinger_label(singer_label);
    }

    @Override
    public Artistinfo findBysinger_id(int singer_id) {
        return artistinfoDao.findBysinger_id(singer_id);
    }
}
