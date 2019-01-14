package com.pan.dao;

import com.pan.pojo.Songinfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Title: SonginfoDao
 * Description:
 * 歌曲信息数据接口
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月2日
 */
@Mapper

public interface SonginfoDao {
    /**
     * 歌曲数据新增
     */
    @Insert("insert into songinfo(song_id,song_name,singer_id,pic_url,lrc_url,song_url,album_id,duration,popularity,commentThread,song_label,down_url) values (#{song_id},#{song_name},#{singer_id},#{pic_url},#{lrc_url},#{song_url},#{album_id},#{duration},#{popularity},#{commentThread},#{song_label},#{down_url})")
    void addSonginfo(Songinfo songinfo);

    /**
     * 歌曲数据更新
     */
    @Update("update songinfo set song_name=#{song_name},singer_id=#{singer_id},pic_url=#{pic_url},lrc_url=#{lrc_url},song_url=#{song_url},album_id=#{album_id},duration=#{duration},popularity=#{popularity},commentThread=#{commentThread},song_label=#{song_label},down_url=#{down_url} where song_id=#{song_id}")
    void updateSonginfo(Songinfo songinfo);

    /**
     * 歌曲修改特定参数:歌曲标签
     */
    @Update("update songinfo set song_label=#{song_label} where song_id=#{song_id}")
    void updateSonginfo_lable(Songinfo songinfo);

    /**
     * 歌曲数据删除
     */
    @Delete("delete from songinfo where song_id=#{song_id}")
    void deleteSonginfo(int song_id);

    /**
     * 按条件查找：歌名
     */
    @Select("SELECT song_id,song_name,singer_id,pic_url,lrc_url,song_url,album_id,duration,popularity,commentThread,song_label,down_url FROM songinfo where song_name=#{song_name}")
    List<Songinfo> findBysong_name(String song_name);

    /**
     * 按条件song_label查找
     */
    @Select("SELECT song_id,song_name,singer_id,pic_url,lrc_url,song_url,album_id,duration,popularity,commentThread,song_label,down_url FROM songinfo where song_label=#{song_label}")
    List<Songinfo> findBysong_label(String song_label);
    /**
     * 按条件song_label查询数量
     */
    @Select("SELECT count(*) FROM songinfo where song_label=#{song_label}")
    int findBysong_label_countItem(String song_label);

    /**
     * 查询此歌曲歌手名字
     * Id
     */
    @Select("SELECT singer_name FROM artistinfo where singer_id in (SELECT singer_id FROM songinfo WHERE song_id=#{song_id})")
    String findsinger_name(int song_id);

    /**
     * 查询此歌曲专辑名字
     * Id
     */
    @Select("SELECT album_name FROM albuminfo where album_id in (SELECT album_id FROM songinfo WHERE song_id=#{song_id})")
    String findalbum_name(int song_id);


    /**
     * 按歌手id查找歌曲
     */
    @Select("SELECT song_id,song_name,singer_id,pic_url,lrc_url,song_url,album_id,duration,popularity,commentThread,song_label,down_url FROM songinfo WHERE singer_id=#{singer_id}")
    List<Songinfo> findsonginfoBysinger_id(int singer_id);
    /**
     * 按歌手id查找歌曲数量
     */
    @Select("SELECT count(*) FROM songinfo WHERE singer_id=#{singer_id}")
    int findsonginfoBysinger_id_countItem(int singer_id);


    /**
     * 按歌曲id查找歌曲信息
     */
    @Select("SELECT song_id,song_name,singer_id,pic_url,lrc_url,song_url,album_id,duration,popularity,commentThread,song_label,down_url FROM songinfo WHERE song_id=#{song_id}")
    Songinfo findsonginfoBysong_id(int song_id);


    /**
     * 按专辑id查找歌曲
     */
    @Select("SELECT song_id,song_name,singer_id,pic_url,lrc_url,song_url,album_id,duration,popularity,commentThread,song_label,down_url FROM songinfo WHERE album_id=#{album_id}")
    List<Songinfo> findsonginfoByalbum_id(int album_id);
    /**
     * 按专辑id查找歌曲数量
     */
    @Select("SELECT count(*) FROM songinfo WHERE album_id=#{album_id}")
    int findsonginfoByalbum_id_countItem(int album_id);


    /**
     * 按歌单id查找歌曲
     */
    @Select("SELECT song_id,song_name,singer_id,pic_url,lrc_url,song_url,album_id,duration,popularity,commentThread,song_label,down_url FROM songinfo WHERE song_id IN (SELECT song_id FROM songlist_relation WHERE songlist_id=#{songlist_id})")
    List<Songinfo> findsonginfoBysonglist_id(int songlist_id);
    /**
     * 按歌单id查找歌曲数量
     */
    @Select("SELECT count(*) FROM songinfo WHERE song_id IN (SELECT song_id FROM songlist_relation WHERE songlist_id=#{songlist_id})")
    int findsonginfoBysonglist_id_countItem(int songlist_id);

    /**
     * findall
     */
    @Select("SELECT song_id,song_name,singer_id,pic_url,lrc_url,song_url,album_id,duration,popularity,commentThread,song_label,down_url FROM songinfo")
    List<Songinfo> findall();
    /**
     * 搜索条数
     */
    @Select("SELECT count(*) FROM songinfo")
    int countItem();
}