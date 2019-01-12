package com.pan.dao;

import com.pan.pojo.Cmt_songlist;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Title: Cmt_songlistDao
 * Description:
 * 歌单评论信息数据接口
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月5日
 */
@Mapper
public interface Cmt_songlistDao {
    /**
     * 发表评论
     */
    @Insert("insert into cmt_songlist(comment_id,user_id,songlist_id,comment_content,comment_time,report_number,likedcount,parentCommentId) values (#{comment_id},#{user_id},#{songlist_id},#{comment_content},#{comment_time},#{report_number},#{likedcount},#{parentCommentId})")
    void addCmt_songlist(Cmt_songlist comment);

    /**
     * 删除评论
     */
    @Delete("delete from cmt_songlist where comment_id=#{comment_id} and songlist_id=#{songlist_id}")
    void deleteCmt_songlist(@Param("comment_id")int comment_id, @Param("songlist_id")int songlist_id);

    /**
     * 查询某歌单评论信息
     * Id
     */
    @Select("SELECT comment_id,user_id,songlist_id,comment_content,comment_time,report_number,likedcount,parentCommentId FROM cmt_songlist where songlist_id=#{songlist_id} ORDER BY likedcount DESC")
    List<Cmt_songlist> findBysonglist_id(int songlist_id);
    /**
     * 查询某歌单评论信息数量
     * Id
     */
    @Select("SELECT count(*) FROM cmt_songlist where songlist_id=#{songlist_id} ")
    int findBysonglist_id_countItem(int songlist_id);
}

