package com.pan.pojo;

import javax.persistence.*;

@Entity
@Table(name = "songlist_relation")
public class Songlist_relation {
    /**
     * id
     */
    @Id
    @GeneratedValue
    private int relation_id;

    /**
     * 歌单id
     */
    @Column(nullable = false)
    private int songlist_id;

    /**
     * 歌曲id
     */
    @Column(nullable = false)
    private int song_id;

    public int getRelation_id() {
        return relation_id;
    }

    public void setRelation_id(int relation_id) {
        this.relation_id = relation_id;
    }

    public int getSonglist_id() {
        return songlist_id;
    }

    public void setSonglist_id(int songlist_id) {
        this.songlist_id = songlist_id;
    }

    public int getSong_id() {
        return song_id;
    }

    public void setSong_id(int song_id) {
        this.song_id = song_id;
    }
}
