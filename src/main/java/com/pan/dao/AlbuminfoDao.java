package com.pan.dao;

import com.pan.pojo.Albuminfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AlbuminfoDao {
    /**
     * 专辑数据新增
     */
    @Insert("insert into albuminfo(album_id,singer_id,album_name,album_date,album_label,album_pic,commentThread,size) values (#{album_id},#{singer_id},#{album_name},#{album_date},#{album_label},#{album_pic},#{commentThread},#{size})")
    void addAlbuminfo(Albuminfo artistinfo);

    /**
     * 专辑数据更新
     */
    @Update("update albuminfo set album_id=#{album_id},singer_id=#{singer_id},album_name=#{album_name},album_date=#{album_date},album_label=#{album_label},album_pic=#{album_pic},commentThread=#{commentThread},size=#{size} where album_id=#{album_id}")
    void updateAlbuminfo(Albuminfo albuminfo);

    /**
     * 专辑数据删除
     */
    @Delete("delete from albuminfo where album_id=#{album_id}")
    void deleteAlbuminfo(int album_id);

    /**
     * 按条件专辑id查找专辑信息
     */
    @Select("SELECT album_id,singer_id,album_name,album_date,album_label,album_pic,commentThread,size FROM albuminfo WHERE album_id IN (SELECT album_id FROM songinfo WHERE song_id=#{song_id})")
    List<Albuminfo> findalbuminfoBysong_id(int song_id);

    /**
     * 按照专辑的label查找专辑信息
     */
    @Select("SELECT album_id,singer_id,album_name,album_date,album_label,album_pic,commentThread,size FROM albuminfo WHERE album_label=#{album_label}")
    List<Albuminfo> findalbuminfoByalbum_label(String album_label);

    /**
     * 根据歌手id查找专辑信息
     */
    @Select("SELECT album_id,singer_id,album_name,album_date,album_label,album_pic,commentThread,size FROM albuminfo WHERE singer_id=#{singer_id}")
    List<Albuminfo> findalbuminfoBysinger_id(int singer_id);

    /**
     * 根据专辑id查找专辑信息
     */
    @Select("SELECT album_id,singer_id,album_name,album_date,album_label,album_pic,commentThread,size FROM albuminfo WHERE album_id=#{album_id}")
    Albuminfo findalbuminfoByalbum_id(int album_id);
}