package com.pan.service.impl;

import com.pan.pojo.Songinfo;

import java.util.List;

/**
 * Title: SonginfoService
 * Description:
 * 歌曲信息数据接口
 * Version:1.0.0
 *
 * @author lsy
 * @date 2018年3月19日
 */

public interface SonginfoService {
    /**
     * 新增歌曲
     *
     * @param songinfo
     * @return
     */
    boolean addSonginfo(Songinfo songinfo);

    /**
     * 更新歌曲信息
     *
     * @param songinfo
     * @return
     */
    boolean updateSonginfo(Songinfo songinfo);

    /**
     * 更新歌曲标签
     *
     * @param songinfo
     * @return
     */
    boolean updateSonginfo_lable(Songinfo songinfo);

    /**
     * 删除歌曲信息
     *
     * @param song_id
     * @return
     */
    boolean deleteSonginfo(int song_id);

    /**
     * 根据歌曲标签查询歌曲信息
     * @param song_label
     */
    List<Songinfo> findSonginfoBySonglabel(String song_label);

    /**
     * 根据歌名名字查询歌曲信息
     * @param song_name
     */
    List<Songinfo> findSonginfoByName(String song_name);

    /**
     * 根据歌名名字查询歌手姓名
     * @param song_name
     */
    String findsinger_nameBySonginfo_song_name(String song_name);

    /**
     * 按歌手id查找歌曲
     * @param singer_id
     */
    List<Songinfo> findsonginfoBysinger_id(int singer_id);

    /**
     * 根据歌曲id返回歌曲信息
     * @param song_id
     */
    Songinfo findsonginfoBysong_id(int song_id);

    /**
     * 按歌手id查找歌曲
     * @param album_id
     */
    List<Songinfo> findsonginfoByalbum_id(int album_id);

    /**
     * 按歌手id查找歌曲
     * @param songlist_id
     */
    List<Songinfo> findsonginfoBysonglist_id(int songlist_id);
}