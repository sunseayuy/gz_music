package com.pan.service.impl;


import com.github.pagehelper.PageHelper;
import com.pan.dao.SearchDao;
import com.pan.pojo.Search;
import com.pan.pojo.Songinfo;
import com.pan.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pan.util.ObjectToMap;

import java.util.List;
import java.util.Map;

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
public class SearchServiceImpl implements SearchService {
    @Autowired
    private SearchDao searchDao;
    @Override
    public Search Search(String search) {
        Search find=new Search();
        find.setSong_id(searchDao.findbySong_name(search).get(0).getSong_id());
        find.setSong_name(searchDao.findbySong_name(search).get(0).getSong_name());
        find.setSong_id2(searchDao.findbySong_name(search).get(1).getSong_id());
        find.setSong_name2(searchDao.findbySong_name(search).get(1).getSong_name());
        find.setSong_id3(searchDao.findbySong_name(search).get(2).getSong_id());
        find.setSong_name3(searchDao.findbySong_name(search).get(2).getSong_name());
        find.setSong_id4(searchDao.findbySong_name(search).get(3).getSong_id());
        find.setSong_name4(searchDao.findbySong_name(search).get(3).getSong_name());

        find.setSinger_id(searchDao.findbySinger_name(search).get(0).getSinger_id());
        find.setSinger_name(searchDao.findbySinger_name(search).get(0).getSinger_name());


        find.setAlbum_id(searchDao.findbyAlbum_name(search).get(0).getAlbum_id());
        find.setAlbum_name(searchDao.findbyAlbum_name(search).get(0).getAlbum_name());

        return find;
    }
}
