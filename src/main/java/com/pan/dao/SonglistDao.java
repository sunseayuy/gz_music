package com.pan.dao;



import com.pan.pojo.Songlist;
import com.pan.pojo.Songlist_relation;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper

public interface SonglistDao {
    /**
     * 歌曲数据新增
     */
    @Insert("insert into songlist(songlist_id,user_id,songlist_name,imgUrl,songlist_label,song_number,songlist_time,description,commentThread) values (#{songlist_id},#{user_id},#{songlist_name},#{imgUrl},#{songlist_label},#{song_number},#{songlist_time},#{description},#{commentThread})")
    void addSonglist(Songlist songlist);

    /**
     * 歌曲数据更新
     */
    @Update("update songlist set songlist_id=#{songlist_id},user_id=#{user_id},songlist_name=#{songlist_name},imgUrl=#{imgUrl},songlist_label=#{songlist_label},song_number=#{song_number},songlist_time=#{songlist_time},description=#{description},commentThread=#{commentThread} where songlist_id=#{songlist_id}")
    void updateSonglist(Songlist songlist);

    /**
     * 歌曲数据删除
     */
    @Delete("delete from songlist where songlist_id=#{songlist_id}")
    void deleteSonglist(int songlist_id);

    /**
     * 按条件songlist_label查找
     */
    @Select("SELECT songlist_id,user_id,songlist_name,imgUrl,songlist_label,song_number,songlist_time,description,commentThread FROM songlist where LOCATE(#{songlist_label},songlist_label)")
    List<Songlist> findBysonglist_label(String songlist_label);
    /**
     * 按条件songlist_label分页查找查找总数
     */
    @Select("SELECT count(*) FROM songlist where LOCATE(#{songlist_label},songlist_label)")
    int findBysonglist_label_countItem(String songlist_label);


    /**
     * 根据歌单id返回歌单信息
     */
    @Select("SELECT songlist_id,user_id,songlist_name,imgUrl,songlist_label,song_number,songlist_time,description,commentThread FROM songlist where songlist_id=#{songlist_id}")
    Songlist findBysonglist_id(int songlist_id);


    /**
     * findall
     */
    @Select("SELECT songlist_id,user_id,songlist_name,imgUrl,songlist_label,song_number,songlist_time,description,commentThread FROM songlist")
    List<Songlist> findall();
    /**
     * 搜索条数
     */
    @Select("SELECT count(*) FROM songlist")
    int countItem();

    /**
     * findsonglistbyuser_id
     */
    @Select("SELECT songlist_id,user_id,songlist_name,imgUrl,songlist_label,song_number,songlist_time,description,commentThread FROM songlist where user_id=#{user_id}")
    List<Songlist> findSonglistbyuser_id(int user_id);
    /**
     * 歌单歌曲数据新增
     */
    @Insert("insert into songlist_relation(songlist_id,song_id) values (#{songlist_id},#{song_id})")
    void addSongintoSonglist(Songlist_relation songlist_relation);

    /**
     * 查询此评论用户昵称
     * Id
     */
    @Select("SELECT user_nickname FROM userinfo where user_id in (SELECT user_id FROM songlist WHERE songlist_id=#{songlist_id})")
    String finduser_nickname(int songlist_id);

}
