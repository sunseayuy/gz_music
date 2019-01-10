package com.pan.pojo;

import javax.persistence.*;

/**
 * Title: Albuminfo
 * Description:用户pojo类
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月5日
 */

@Entity
@Table(name = "albuminfo")
public class Albuminfo {
    /**
     * 专辑id
     */
    @Id
    @GeneratedValue
    private int album_id;

    /**
     * 歌手id
     */
    @Column(nullable = false)
    private int singer_id;

    /**
     * 专辑名
     */
    @Column(nullable = false)
    private String album_name;

    /**
     * 专辑发布日期
     */
    @Column(nullable = false)
    private String album_date;

    /**
     * 专辑标签
     */
    @Column
    private String album_label;

    /**
     * 专辑图片
     */
    @Column
    private String album_pic;

    /**
     * 评论流
     */
    @Column
    private String commentThread;

    /**
     * 专辑大小
     */
    @Column
    private String size;

    public Albuminfo() {
    }

    public int getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(int album_id) {
        this.album_id = album_id;
    }

    public int getSinger_id() {
        return singer_id;
    }

    public void setSinger_id(int singer_id) {
        this.singer_id = singer_id;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public String getAlbum_date() {
        return album_date;
    }

    public void setAlbum_date(String album_date) {
        this.album_date = album_date;
    }

    public String getAlbum_label() {
        return album_label;
    }

    public void setAlbum_label(String album_label) {
        this.album_label = album_label;
    }

    public String getAlbum_pic() {
        return album_pic;
    }

    public void setAlbum_pic(String album_pic) {
        this.album_pic = album_pic;
    }

    public String getCommentThread() {
        return commentThread;
    }

    public void setCommentThread(String commentThread) {
        this.commentThread = commentThread;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}