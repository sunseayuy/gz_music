package com.pan.service.impl;

import com.pan.pojo.Songlist;

import java.util.List;

public interface SonglistService {
    /**
     * 新增歌单
     *
     * @param songlist
     * @return
     */
    boolean addSonglist(Songlist songlist);

    /**
     * 更新歌单信息
     *
     * @param songlist
     * @return
     */
    boolean updateSonglist(Songlist songlist);

    /**
     * 删除歌单信息
     *
     * @param songlist_id
     * @return
     */
    boolean deleteSonglist(int songlist_id);

    /**
     * 根据歌单标签查询歌单信息
     * @param songlist_label
     */
    List<Songlist> findBysonglist_label(String songlist_label);

    /**
     * 根据歌单标签查询分页歌单信息
     * @param songlist_label
     */
    List<Songlist> findBysonglist_labelpage(String songlist_label,int currentPage,int pageSize);

    /**
     * 根据歌单id查询歌单信息
     * @param songlist_id
     */
    Songlist findBysonglist_id(int songlist_id);

    List<Songlist> findall();
    /**
     * findall_page
     * @param
     */
    List<Songlist> findall_page(int currentPage,int pageSize);
}