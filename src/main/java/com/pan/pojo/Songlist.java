package com.pan.pojo;

import javax.persistence.*;

@Entity
@Table(name = "songlist")

public class Songlist {
    /**
     * 歌单id
     */
    @Id
    @GeneratedValue
    private int songlist_id;

    /**
     * 用户id
     */
    @Column(nullable = false)
    private int user_id;

    /**
     * 歌单名
     */
    @Column(nullable = false)
    private String songlist_name;

    /**
     * 图片链接
     */
    @Column
    private String imgUrl;

    /**
     * 歌单标签
     */
    @Column
    private String songlist_label;

    /**
     * 歌曲数目
     */
    @Column
    private int song_number;

    /**
     * 创建时间
     */
    @Column(nullable = false)
    private String songlist_time;

    /**
     * 歌单描述
     */
    @Column
    private String description;

    /**
     * 评论流
     */
    @Column
    private String commentThread;

    /**
     * 用户昵称
     */
    private String user_nickname;

    public Songlist() {
    }

    public int getSonglist_id() {
        return songlist_id;
    }

    public void setSonglist_id(int songlist_id) {
        this.songlist_id = songlist_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getSonglist_name() {
        return songlist_name;
    }

    public void setSonglist_name(String songlist_name) {
        this.songlist_name = songlist_name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getSonglist_label() {
        return songlist_label;
    }

    public void setSonglist_label(String songlist_label) {
        this.songlist_label = songlist_label;
    }

    public int getSong_number() {
        return song_number;
    }

    public void setSong_number(int song_number) {
        this.song_number = song_number;
    }

    public String getSonglist_time() {
        return songlist_time;
    }

    public void setSonglist_time(String songlist_time) {
        this.songlist_time = songlist_time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCommentThread() {
        return commentThread;
    }

    public void setCommentThread(String commentThread) {
        this.commentThread = commentThread;
    }

    public String getUser_nickname() {
        return user_nickname;
    }

    public void setUser_nickname(String user_nickname) {
        this.user_nickname = user_nickname;
    }
}
