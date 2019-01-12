package com.pan.service.impl;

import com.pan.pojo.Albuminfo;

import java.util.List;

/**
 * Title: AlbuminfoService
 * Description:
 * 歌手信息数据接口
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月4日
 */

public interface AlbuminfoService {
    /**
     * 新增专辑信息
     *
     * @param albuminfo
     * @return
     */
    boolean addAlbuminfo(Albuminfo albuminfo);

    /**
     * 更新专辑信息
     *
     * @param albuminfo
     * @return
     */
    boolean updateAlbuminfo(Albuminfo albuminfo);

    /**
     * 删除专辑信息
     *
     * @param album_id
     * @return
     */
    boolean deleteAlbuminfo(int album_id);


    /**
     * 根据歌曲id查专辑id查专辑信息
     * @param song_id
     */
    List<Albuminfo> findalbuminfoBysong_id(int song_id);

    /**
     * 根据album_label查询专辑信息
     */
    List<Albuminfo> findalbuminfoByalbum_label(String album_label);
    /**
     * 根据album_label分页查询专辑信息
     */
    List<Albuminfo> findalbuminfoByalbum_label_page(String album_label,int currentPage,int pageSize);


    /**
     * 根据歌手id查找专辑信息
     */
    List<Albuminfo> findalbuminfoBysinger_id(int singer_id);
    /**
     * 根据歌手id分页查找专辑信息
     */
    List<Albuminfo> findalbuminfoBysinger_id_page(int singer_id,int currentPage,int pageSize);


    /**
     * 根据专辑id查找专辑信息
     */
    Albuminfo findalbuminfoByalbum_id(int album_id);


    /**
     * 根据歌手地区类型查找专辑类型
     */
    List<Albuminfo> findalbuminfoBysinger_label(String singer_label);
    /**
     * 根据歌手地区类型分页查找专辑类型
     */
    List<Albuminfo> findalbuminfoBysinger_label_page(String singer_label,int currentPage,int pageSize);

    /**
     * 查找专辑
     */
    List<Albuminfo> findalbuminfoall();
    /**
     * 分页查找专辑
     */
    List<Albuminfo> findalbuminfoall_page(int currentPage,int pageSize);
}
