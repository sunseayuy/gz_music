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
     * 按条件查找歌手姓名：singer_id
     */
    @Select("SELECT singer_name FROM artistinfo WHERE artistinfo.singer_id IN (SELECT songinfo.singer_id FROM songinfo WHERE songinfo.song_name=#{song_name})")
    String findBySonginfo_song_name(String song_name);

    /**
     * 按歌手id查找歌曲
     */
    @Select("SELECT song_id,song_name,singer_id,pic_url,lrc_url,song_url,album_id,duration,popularity,commentThread,song_label,down_url FROM songinfo WHERE singer_id=#{singer_id}")
    List<Songinfo> findsonginfoBysinger_id(int singer_id);

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
     * 按歌单id查找歌曲
     */
    @Select("SELECT song_id,song_name,singer_id,pic_url,lrc_url,song_url,album_id,duration,popularity,commentThread,song_label,down_url FROM songinfo WHERE song_id IN (SELECT song_id FROM songlist_relation WHERE songlist_id=#{songlist_id})")
    List<Songinfo> findsonginfoBysonglist_id(int songlist_id);
}