package com.pan.pojo;

import javax.persistence.*;

/**
 * Title: songinfo
 * Description:歌曲pojo类
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月2日
 */

@Entity
@Table(name = "songinfo")

public class Songinfo {
    /**
     * 歌曲id
     */
    @Id
    @GeneratedValue
    private int song_id;

    /**
     * 歌曲名称
     */
    @Column(nullable = false, unique = true)
    private String Song_name;

    /**
     * 歌手id
     */
    @Column(nullable = false)
    private int singer_id;

    /**
     * 歌词
     */
    @Column
    private String lrc_url;

    /**
     * 歌曲链接
     */
    @Column(unique = true)
    private String song_url;

    /**
     * 专辑id
     */
    @Column
    private int album_id;

    /**
     * 歌曲播放时间
     */
    @Column
    private String duration;

    /**
     * 歌曲热度
     */
    @Column
    private String popularity;

    /**
     * 歌曲标签
     */
    @Column
    private String song_label;

    /**
     * 歌曲图片链接
     */
    @Column
    private String pic_url;

    /**
     * 歌曲评论流ID
     */
    @Column
    private String commentThread;

    /**
     * 歌曲下载链接
     */
    @Column
    private String down_url;

    /**
     * 专辑名
     */
    private String album_name;

    /**
     * 歌手姓名
     */
    private String singer_name;


    public Songinfo() {
    }

    public int getSong_id() {
        return song_id;
    }

    public void setSong_id(int song_id) {
        this.song_id = song_id;
    }

    public String getSong_name() {
        return Song_name;
    }

    public void setSong_name(String song_name) {
        Song_name = song_name;
    }

    public int getSinger_id() {
        return singer_id;
    }

    public void setSinger_id(int singer_id) {
        this.singer_id = singer_id;
    }

    public String getLrc_url() {
        return lrc_url;
    }

    public void setLrc_url(String lrc_url) {
        this.lrc_url = lrc_url;
    }

    public String getSong_url() {
        return song_url;
    }

    public void setSong_url(String song_url) {
        this.song_url = song_url;
    }

    public int getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(int album_id) {
        this.album_id = album_id;
    }

    public String getSong_label() {
        return song_label;
    }

    public void setSong_label(String song_label) {
        this.song_label = song_label;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

    public String getCommentThread() {
        return commentThread;
    }

    public void setCommentThread(String commentThread) {
        this.commentThread = commentThread;
    }

    public String getDown_url() {
        return down_url;
    }

    public void setDown_url(String down_url) {
        this.down_url = down_url;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public String getSinger_name() {
        return singer_name;
    }

    public void setSinger_name(String singer_name) {
        this.singer_name = singer_name;
    }
}