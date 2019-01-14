package com.pan.service.impl;

import com.pan.pojo.Artistinfo;

import java.util.List;

/**
 * Title: ArtistinfoService
 * Description:
 * 歌手信息数据接口
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月4日
 */

public interface ArtistinfoService {
    /**
     * 新增歌手信息
     *
     * @param artistinfo
     * @return
     */
    boolean addArtistinfo(Artistinfo artistinfo);

    /**
     * 更新歌手信息
     *
     * @param artistinfo
     * @return
     */
    boolean updateArtistinfo(Artistinfo artistinfo);

    /**
     * 删除歌手信息
     *
     * @param singer_id
     * @return
     */
    boolean deleteArtistinfo(int singer_id);


    /**
     * 根据歌手姓名首字母查询
     * @param firsthanzicode
     */
    List<Artistinfo> findByartist_firsthanzicode(String firsthanzicode);
    /**
     * 根据歌手姓名首字母分页查询
     * @param firsthanzicode
     */
    List<Artistinfo> findByartist_firsthanzicode_page(String firsthanzicode,int currentPage,int pageSize);

    /**
     * 按条件歌手标签查找歌手
     * @param singer_label
     */
    List<Artistinfo> findBysinger_label(String singer_label);
    /**
     * 按条件歌手标签分页查找歌手
     * @param singer_label
     */
    List<Artistinfo> findBysinger_label_page(String singer_label,int currentPage,int pageSize);

    /**
     * 根据歌手id查找歌手信息
     * @param singer_id
     */
    Artistinfo findBysinger_id(int singer_id);

    /**
     * 查找歌手
     * @param
     */
    List<Artistinfo> findsingerall();
    /**
     * 分页查找歌手
     * @param
     */
    List<Artistinfo> findsingerall_page(int currentPage,int pageSize);

    /**
     * 查找populer歌手
     * @param
     */
    List<Artistinfo> findpopuler();
}

