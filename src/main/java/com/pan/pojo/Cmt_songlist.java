package com.pan.pojo;

import javax.persistence.*;

/**
 * Title: Cmt_songlist
 * Description:用户歌单评论pojo类
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月5日
 */

@Entity
@Table(name = "cmt_songlist")
public class Cmt_songlist {
    /**
     * 评论id
     */
    @Id
    @GeneratedValue
    private int comment_id;

    /**
     * 用户id
     */
    @Column(nullable = false)
    private int user_id;

    /**
     * 歌单id
     */
    @Column(nullable = false)
    private int songlist_id;
    /**
     * 评论内容
     */
    @Column
    private String comment_content;
    /**
     * 评论时间
     */
    @Column(nullable = false)
    private String comment_time;
    /**
     * 举报数
     */
    @Column
    private int report_number;
    /**
     * 点赞数
     */
    @Column
    private int likedcount;
    /**
     * 回复的评论id
     */
    @Column
    private String parentCommentId;

    /**
     * 用户昵称
     */
    private String user_nickname;

    public  Cmt_songlist() {
    }

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getSonglist_id() {
        return songlist_id;
    }

    public void setSonglist_id(int songlist_id) {
        this.songlist_id = songlist_id;
    }

    public String getComment_content() {
        return comment_content;
    }

    public void setComment_content(String comment_content) {
        this.comment_content = comment_content;
    }

    public String getComment_time() {
        return comment_time;
    }

    public void setComment_time(String comment_time) {
        this.comment_time = comment_time;
    }

    public int getReport_number() {
        return report_number;
    }

    public void setReport_number(int report_number) {
        this.report_number = report_number;
    }

    public int getLikedcount() {
        return likedcount;
    }

    public void setLikedcount(int likedcount) {
        this.likedcount = likedcount;
    }

    public String getParentCommentId() {
        return parentCommentId;
    }

    public void setParentCommentId(String parentCommentId) {
        this.parentCommentId = parentCommentId;
    }

    public String getUser_nickname() {
        return user_nickname;
    }

    public void setUser_nickname(String user_nickname) {
        this.user_nickname = user_nickname;
    }
}