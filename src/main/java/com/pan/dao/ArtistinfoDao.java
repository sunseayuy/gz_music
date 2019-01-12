package com.pan.dao;


import com.pan.pojo.Artistinfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Title: ArtistinfoDao
 * Description:
 * 歌手信息数据接口
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月4日
 */
@Mapper
public interface ArtistinfoDao {
    /**
     * 歌手数据新增
     */
    @Insert("insert into artistinfo(singer_id,singer_name,singer_intro,singer_label,img_url) values (#{singer_id},#{singer_name},#{singer_intro},#{singer_label},#{img_url})")
    void addArtistinfo(Artistinfo artistinfo);

    /**
     * 歌手数据更新
     */
    @Update("update artistinfo set singer_id=#{singer_id},singer_name=#{singer_name},singer_intro=#{singer_intro},singer_label=#{singer_label},img_url=#{img_url} where singer_id=#{singer_id}")
    void updateArtistinfo(Artistinfo artistinfo);

    /**
     * 歌手数据删除
     */
    @Delete("delete from artistinfo where singer_id=#{singer_id}")
    void deleteArtistinfo(int artistinfo);

    /**
     * 按条件歌手姓名首字母查找歌手
     */
    @Select("SELECT singer_id,singer_name FROM artistinfo WHERE getFirstHanZiCode(singer_name)=#{firsthanzicode}")
    List<Artistinfo> findByartist_firsthanzicode(String firsthanzicode);
    /**
     * 按条件歌手姓名首字母查找歌手数量
     */
    @Select("SELECT count(*) FROM artistinfo WHERE getFirstHanZiCode(singer_name)=#{firsthanzicode}")
    int findByartist_firsthanzicode_countItem(String firsthanzicode);


    /**
     * 按条件歌手标签查找歌手
     */
    @Select("SELECT singer_id,singer_name,singer_intro,singer_label,img_url FROM artistinfo WHERE singer_label=#{singer_label}")
    List<Artistinfo> findBysinger_label(String singer_label);
    /**
     * 按条件歌手标签查找歌手
     */
    @Select("SELECT count(*) FROM artistinfo WHERE singer_label=#{singer_label}")
    int findBysinger_label_countItem(String singer_label);


    /**
     * 按条件歌手id查找歌手信息
     */
    @Select("SELECT singer_id,singer_name,singer_intro,singer_label,img_url FROM artistinfo WHERE singer_id=#{singer_id}")
    Artistinfo findBysinger_id(int singer_id);

    /**
     * 查找所有歌手
     */
    @Select("SELECT singer_id,singer_name,singer_intro,singer_label,img_url FROM artistinfo ")
    List<Artistinfo> findsingerall();
    /**
     * 歌手总数
     */
    @Select("SELECT count(*) FROM artistinfo")
    int singer_countItem();
}
