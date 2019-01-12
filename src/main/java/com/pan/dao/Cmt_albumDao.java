package com.pan.dao;

import com.pan.pojo.Cmt_album;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Title: Cmt_albumDao
 * Description:
 * 专辑评论信息数据接口
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月6日
 */
@Mapper
public interface Cmt_albumDao {
    /**
     * 发表评论
     */
    @Insert("insert into cmt_album(comment_id,user_id,album_id,comment_content,comment_time,report_number,likedcount,parentCommentId) values (#{comment_id},#{user_id},#{album_id},#{comment_content},#{comment_time},#{report_number},#{likedcount},#{parentCommentId})")
    void addCmt_album(Cmt_album comment);

    /**
     * 删除评论
     */
    @Delete("delete from cmt_album where comment_id=#{comment_id} and album_id=#{album_id}")
    void deleteCmt_album(@Param("comment_id")int comment_id, @Param("album_id")int album_id);

    /**
     * 查询某首歌评论信息
     * Id
     */
    @Select("SELECT comment_id,user_id,album_id,comment_content,comment_time,report_number,likedcount,parentCommentId FROM cmt_album where album_id=#{album_id} ORDER BY likedcount DESC")
    List<Cmt_album> findByalbum_id(int album_id);
    /**
     * 查询某首歌评论信息数量
     * Id
     */
    @Select("SELECT count(*) FROM cmt_album where album_id=#{album_id}")
    int findByalbum_id_countItem(int album_id);
}

