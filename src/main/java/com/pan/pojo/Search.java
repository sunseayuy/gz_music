package com.pan.pojo;

import javax.persistence.*;

/**
 * Title: Artistinfo
 * Description:搜索pojo类
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月4日
 */

@Entity
@Table(name = "search")
public class Search {

    /**
     * 歌曲id
     */
    @Id
    @GeneratedValue
    private int song_id;
    /**
     * 歌曲名称
     */
    private String Song_name;

    /**
     * 歌曲id
     */
    private int song_id2;
    /**
     * 歌曲名称
     */
    private String Song_name2;

    /**
     * 歌曲id
     */
    private int song_id3;
    /**
     * 歌曲名称
     */
    private String Song_name3;

    /**
     * 歌曲id
     */
    private int song_id4;
    /**
     * 歌曲名称
     */
    private String Song_name4;

    /**
     * 歌手id
     */
    private int singer_id;
    /**
     * 歌手姓名
     */
    private String singer_name;

    /**
     * 歌手id
     */
    private int singer_id2;
    /**
     * 歌手姓名
     */
    private String singer_name2;

    /**
     * 专辑id
     */
    private int album_id;
    /**
     * 专辑名
     */
    private String album_name;

    /**
     * 专辑id
     */
    private int album_id2;
    /**
     * 专辑名
     */
    private String album_name2;

    public Search() {
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

    public String getSinger_name() {
        return singer_name;
    }

    public void setSinger_name(String singer_name) {
        this.singer_name = singer_name;
    }

    public int getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(int album_id) {
        this.album_id = album_id;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public int getSong_id2() {
        return song_id2;
    }

    public void setSong_id2(int song_id2) {
        this.song_id2 = song_id2;
    }

    public String getSong_name2() {
        return Song_name2;
    }

    public void setSong_name2(String song_name2) {
        Song_name2 = song_name2;
    }

    public int getSong_id3() {
        return song_id3;
    }

    public void setSong_id3(int song_id3) {
        this.song_id3 = song_id3;
    }

    public String getSong_name3() {
        return Song_name3;
    }

    public void setSong_name3(String song_name3) {
        Song_name3 = song_name3;
    }

    public int getSong_id4() {
        return song_id4;
    }

    public void setSong_id4(int song_id4) {
        this.song_id4 = song_id4;
    }

    public String getSong_name4() {
        return Song_name4;
    }

    public void setSong_name4(String song_name4) {
        Song_name4 = song_name4;
    }

    public int getSinger_id2() {
        return singer_id2;
    }

    public void setSinger_id2(int singer_id2) {
        this.singer_id2 = singer_id2;
    }

    public String getSinger_name2() {
        return singer_name2;
    }

    public void setSinger_name2(String singer_name2) {
        this.singer_name2 = singer_name2;
    }

    public int getAlbum_id2() {
        return album_id2;
    }

    public void setAlbum_id2(int album_id2) {
        this.album_id2 = album_id2;
    }

    public String getAlbum_name2() {
        return album_name2;
    }

    public void setAlbum_name2(String album_name2) {
        this.album_name2 = album_name2;
    }
}
