package com.pan.controller;

import com.pan.pojo.Songlist;
import com.pan.service.impl.SonglistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/songlist")
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

    @RequestMapping(value = "/findBysonglist_id", method = RequestMethod.GET)
    public Songlist findBysonglist_id(@RequestParam(value = "songlist_id", required = true) int songlist_id) {
        System.out.println("开始查询...");
        return songlistService.findBysonglist_id(songlist_id);
    }
}