package com.pan.pojo;

import javax.persistence.*;

/**
 * Title: Artistinfo
 * Description:用户pojo类
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月4日
 */

@Entity
@Table(name = "artisinfo")
public class Artistinfo {
    /**
     * 歌手id
     */
    @Id
    @GeneratedValue
    private int singer_id;

    /**
     * 歌手姓名
     */
    @Column(nullable = false)
    private String singer_name;

    /**
     * 歌手简介
     */
    @Column
    private String singer_intro;

    /**
     * 歌手标签
     */
    @Column
    private String singer_label;

    /**
     * 歌手照片
     */
    @Column
    private String img_url;

    public Artistinfo() {
    }

    public int getSinger_id() {
        return singer_id;
    }

    public void setSinger_id(int singer_id) {
        this.singer_id = singer_id;
    }

    public String getSinger_name() {
        return singer_name;
    }

    public void setSinger_name(String singer_name) {
        this.singer_name = singer_name;
    }

    public String getSinger_intro() {
        return singer_intro;
    }

    public void setSinger_intro(String singer_intro) {
        this.singer_intro = singer_intro;
    }

    public String getSinger_label() {
        return singer_label;
    }

    public void setSinger_label(String singer_label) {
        this.singer_label = singer_label;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }
}