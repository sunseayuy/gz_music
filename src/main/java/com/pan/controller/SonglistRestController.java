package com.pan.controller;

import com.pan.pojo.Songlist;
import com.pan.pojo.Songlist_relation;
import com.pan.service.impl.SonglistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/songlist")
@CrossOrigin
public class SonglistRestController {
    @Autowired
    private SonglistService songlistService;
    @RequestMapping(value = "/addSonglist", method = RequestMethod.POST)
    public boolean addSonglist( Songlist songlist) {
        System.out.println("开始新增...");
        return songlistService.addSonglist(songlist);
    }

    @RequestMapping(value = "/updateSonglist", method = RequestMethod.PUT)
    public boolean updateSonglist( Songlist songlist) {
        System.out.println("开始更新...");
        return songlistService.updateSonglist(songlist);
    }

    @RequestMapping(value = "/deleteSonglist", method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "songlist_id", required = true) int songlistId) {
        System.out.println("开始删除...");
        return songlistService.deleteSonglist(songlistId);
    }

    @RequestMapping(value = "/songlist_label", method = RequestMethod.GET)
    public List<Songlist> findBysonglist_label(@RequestParam(value = "songlist_label", required = true) String songlist_label) {
        System.out.println("开始查询...");
        return songlistService.findBysonglist_label(songlist_label);
    }

    /**
     * 分页根据songlist_label查询
     * @param songlist_label
     * @return
     */
    @RequestMapping(value = "/findbysonglist_label_page", method = RequestMethod.GET)
    public List<Songlist> findBysonglist_labelpage(@RequestParam(value = "songlist_label", required = true) String songlist_label,int currentPage,int pageSize) {
        System.out.println("开始查询...");
        return songlistService.findBysonglist_labelpage(songlist_label,currentPage, pageSize);
    }

    @RequestMapping(value = "/findBysonglist_id", method = RequestMethod.GET)
    public Songlist findBysonglist_id(@RequestParam(value = "songlist_id", required = true) int songlist_id) {
        System.out.println("开始查询...");
        return songlistService.findBysonglist_id(songlist_id);
    }

    @RequestMapping(value = "/findall", method = RequestMethod.GET)
    public List<Songlist> findall() {
        System.out.println("开始查询...");
        return songlistService.findall();
    }

    @RequestMapping(value = "/findall_page", method = RequestMethod.GET)
    public List<Songlist> findall_page(int currentPage,int pageSize) {
        System.out.println("开始查询...");
        return songlistService.findall_page(currentPage, pageSize);
    }

    @RequestMapping(value = "/findbyuser_id", method = RequestMethod.GET)
    public List<Songlist> findbyuser_id(@RequestParam(value = "user_id", required = true) int user_id) {
        System.out.println("开始查询...");
        return songlistService.findSonglistbyuser_id(user_id);
    }

    @RequestMapping(value = "/addSongintoSonglist", method = RequestMethod.POST)
    public boolean addSongintoSonglist( Songlist_relation songlist_relation) {
        System.out.println("开始新增...");
        return songlistService.addSongintoSonglist(songlist_relation);
    }

}