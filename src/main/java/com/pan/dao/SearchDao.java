package com.pan.dao;

import com.pan.pojo.Albuminfo;
import com.pan.pojo.Artistinfo;
import com.pan.pojo.Songinfo;
import com.pan.pojo.Songlist;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Title: SearchDao
 * Description:
 * 搜索操作数据接口
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月2日
 */
@Mapper
public interface SearchDao {
    @Select("SELECT song_id,song_name FROM songinfo WHERE LOCATE(#{search},song_name) LIMIT 4")
    List<Songinfo> findbySong_name(String search);

    @Select("SELECT singer_id,singer_name FROM artistinfo WHERE LOCATE(#{search},singer_name) LIMIT 2")
    List<Artistinfo> findbySinger_name(String search);

    @Select("SELECT album_id,album_name FROM albuminfo WHERE LOCATE(#{search},album_name) LIMIT 2")
    List<Albuminfo> findbyAlbum_name(String search);
}
