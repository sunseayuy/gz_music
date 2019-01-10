package com.pan.dao;

import com.pan.pojo.Comment;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Title: CommentDao
 * Description:
 * 歌曲评论信息数据接口
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月4日
 */
@Mapper
public interface CommentDao {
    /**
     * 发表评论
     */
    @Insert("insert into comment(comment_id,user_id,song_id,comment_content,comment_time,report_number,likedcount,parentCommentId) values (#{comment_id},#{user_id},#{song_id},#{comment_content},#{comment_time},#{report_number},#{likedcount},#{parentCommentId})")
    void addComment(Comment comment);

    /**
     * 删除评论
     */
    @Delete("delete from comment where comment_id=#{comment_id} and song_id=#{song_id}")
    void deleteComment(@Param("comment_id") int comment_id, @Param("song_id")int song_id);

    /**
     * 查询某首歌评论信息
     * Id
     */
    @Select("SELECT comment_id,user_id,song_id,comment_content,comment_time,report_number,likedcount,parentCommentId FROM comment where song_id=#{song_id} ORDER BY likedcount DESC")
    List<Comment> findBysong_id(int song_id);
}
