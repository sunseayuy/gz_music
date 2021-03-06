package com.pan.controller;

import com.pan.pojo.Songinfo;
import com.pan.service.impl.SonginfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Title: UserRestController
 * Description:
 * 歌曲数据控制层
 * Version:1.0.0
 *
 * @author lsy
 * @date 2018年3月19日
 */
@RestController
@RequestMapping(value = "/api/songinfo")
@CrossOrigin
public class SonginfoRestController {
    @Autowired
    private SonginfoService songinfoService;
    @RequestMapping(value = "/addSonginfo", method = RequestMethod.POST)
    public boolean addSonginfo( Songinfo songinfo) {
        System.out.println("开始新增...");
        return songinfoService.addSonginfo(songinfo);
    }

    @RequestMapping(value = "/updateSonginfo", method = RequestMethod.PUT)
    public boolean updateUser( Songinfo songinfo) {
        System.out.println("开始更新...");
        return songinfoService.updateSonginfo(songinfo);
    }

    @RequestMapping(value = "/updateSonginfo_lable", method = RequestMethod.PUT)
    public boolean updateUser_lable( Songinfo songinfo) {
        System.out.println("开始更新...");
        return songinfoService.updateSonginfo_lable(songinfo);
    }

    @RequestMapping(value = "/deleteSonginfo", method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "song_id", required = true) int songinfoId) {
        System.out.println("开始删除...");
        return songinfoService.deleteSonginfo(songinfoId);
    }

    @RequestMapping(value = "/song_name", method = RequestMethod.GET)
    public List<Songinfo> findByUserName(@RequestParam(value = "song_name", required = true) String singinfoName) {
        System.out.println("开始查询...");
        return songinfoService.findSonginfoByName(singinfoName);
    }

    @RequestMapping(value = "/song_label", method = RequestMethod.GET)
    public List<Songinfo> findBySonginfosong_lable(@RequestParam(value = "song_label", required = true) String song_label) {
        System.out.println("开始查询...");
        return songinfoService.findSonginfoBySonglabel(song_label);
    }

    @RequestMapping(value = "/song_label_page", method = RequestMethod.GET)
    public List<Songinfo> findBySonginfosong_lable_page(@RequestParam(value = "song_label", required = true) String song_label,int currentPage,int pageSize) {
        System.out.println("开始查询...");
        return songinfoService.findSonginfoBySonglabel_page(song_label,currentPage,pageSize);
    }

    @RequestMapping(value = "/findsonginfoBysinger_id", method = RequestMethod.GET)
    public List<Songinfo> findsonginfoBysinger_id(@RequestParam(value = "singer_id", required = true) int singer_id) {
        System.out.println("开始查询...");
        return songinfoService.findsonginfoBysinger_id(singer_id);
    }
    @RequestMapping(value = "/findsonginfoBysinger_id_number", method = RequestMethod.GET)
    public int findsonginfoBysinger_id_number(@RequestParam(value = "singer_id", required = true) int singer_id) {
        System.out.println("开始查询...");
        return songinfoService.findsonginfoBysinger_id_number(singer_id);
    }
    @RequestMapping(value = "/findsonginfoBysinger_id_page", method = RequestMethod.GET)
    public List<Songinfo> findsonginfoBysinger_id_page(@RequestParam(value = "singer_id", required = true) int singer_id, int currentPage, int pageSize) {
        System.out.println("开始查询...");
        return songinfoService.findsonginfoBysinger_id_page(singer_id,currentPage,pageSize);
    }


    @RequestMapping(value = "/findsonginfoBysong_id", method = RequestMethod.GET)
    public Songinfo findsonginfoBysong_id(@RequestParam(value = "song_id", required = true) int song_id) {
        System.out.println("开始查询...");
        return songinfoService.findsonginfoBysong_id(song_id);
    }

    @RequestMapping(value = "/findsonginfoByalbum_id", method = RequestMethod.GET)
    public List<Songinfo> findsonginfoByalbum_id(@RequestParam(value = "album_id", required = true) int album_id) {
        System.out.println("开始查询...");
        return songinfoService.findsonginfoByalbum_id(album_id);
    }
    @RequestMapping(value = "/findsonginfoByalbum_id_page", method = RequestMethod.GET)
    public List<Songinfo> findsonginfoByalbum_id_page(@RequestParam(value = "album_id", required = true) int album_id,int currentPage, int pageSize) {
        System.out.println("开始查询...");
        return songinfoService.findsonginfoByalbum_id_page(album_id,currentPage,pageSize);
    }

    @RequestMapping(value = "/findsonginfoBysonglist_id", method = RequestMethod.GET)
    public List<Songinfo> findsonginfoBysonglist_id(@RequestParam(value = "songlist_id", required = true) int songlist_id) {
        System.out.println("开始查询...");
        return songinfoService.findsonginfoBysonglist_id(songlist_id);
    }
    @RequestMapping(value = "/findsonginfoBysonglist_id_page", method = RequestMethod.GET)
    public List<Songinfo> findsonginfoBysonglist_id_page(@RequestParam(value = "songlist_id", required = true) int songlist_id, int currentPage, int pageSize) {
        System.out.println("开始查询...");
        return songinfoService.findsonginfoBysonglist_id_page(songlist_id,currentPage,pageSize);
    }

    @RequestMapping(value = "/findall", method = RequestMethod.GET)
    public List<Songinfo> findall() {
        System.out.println("开始查询...");
        return songinfoService.findall();
    }

    @RequestMapping(value = "/findall_page", method = RequestMethod.GET)
    public List<Songinfo> findall_page(int currentPage,int pageSize) {
        System.out.println("开始查询...");
        return songinfoService.findall_page(currentPage, pageSize);
    }
}
