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
     * 按条件歌曲id查找专辑信息
     */
    @Select("SELECT album_id,singer_id,album_name,album_date,album_label,album_pic,commentThread,size FROM albuminfo WHERE album_id IN (SELECT album_id FROM songinfo WHERE song_id=#{song_id})")
    List<Albuminfo> findalbuminfoBysong_id(int song_id);

    /**
     * 按照专辑的label查找专辑信息
     */
    @Select("SELECT album_id,singer_id,album_name,album_date,album_label,album_pic,commentThread,size FROM albuminfo WHERE album_label=#{album_label}")
    List<Albuminfo> findalbuminfoByalbum_label(String album_label);
    /**
     * 按照专辑的label查找专辑信息数量
     */
    @Select("SELECT count(*) FROM albuminfo WHERE album_label=#{album_label}")
    int findalbuminfoByalbum_label_countItem(String album_label);


    /**
     * 根据歌手id查找专辑信息
     */
    @Select("SELECT album_id,singer_id,album_name,album_date,album_label,album_pic,commentThread,size FROM albuminfo WHERE singer_id=#{singer_id}")
    List<Albuminfo> findalbuminfoBysinger_id(int singer_id);
    /**
     * 根据歌手id查找专辑信息数量
     */
    @Select("SELECT count(*) FROM albuminfo WHERE singer_id=#{singer_id}")
    int findalbuminfoBysinger_id_countItem(int singer_id);


    /**
     * 根据专辑id查找专辑信息
     */
    @Select("SELECT album_id,singer_id,album_name,album_date,album_label,album_pic,commentThread,size FROM albuminfo WHERE album_id=#{album_id}")
    Albuminfo findalbuminfoByalbum_id(int album_id);


    /**
     * 根据歌手地区类型查找专辑类型
     */
    @Select("SELECT album_id,singer_id,album_name,album_date,album_label,album_pic,commentThread,size FROM albuminfo WHERE singer_id IN(SELECT singer_id FROM artistinfo WHERE LOCATE(#{singer_label},singer_label))")
    List<Albuminfo> findalbuminfoBysinger_lable(String singer_label);
    /**
     * 根据歌手地区类型查找专辑类型数量
     */
    @Select("SELECT count(*) FROM albuminfo WHERE singer_id IN(SELECT singer_id FROM artistinfo WHERE LOCATE(#{singer_label},singer_label))")
    int findalbuminfoBysinger_lable_countItem(String singer_label);

    /**
     * 查找所有专辑
     */
    @Select("SELECT album_id,singer_id,album_name,album_date,album_label,album_pic,commentThread,size FROM albuminfo ")
    List<Albuminfo> findalbuminfoall();
    /**
     * 专辑数量
     */
    @Select("SELECT count(*) FROM albuminfo ")
    int findalbuminfoall_countItem();

    /**
     * 查找演唱者姓名
     * @param album_id
     * @return
     */
    @Select("SELECT singer_name FROM artistinfo WHERE singer_id in (SELECT singer_id FROM albuminfo WHERE album_id=#{album_id})")
    String findsinger_name(int album_id);

}