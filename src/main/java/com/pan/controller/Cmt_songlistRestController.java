package com.pan.controller;

import com.pan.pojo.Cmt_songlist;
import com.pan.service.impl.Cmt_songlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Title: Cmt_songlistRestController
 * Description:
 * 歌曲评论数据控制层
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月5日
 */
@RestController
@RequestMapping(value = "/api/cmt_songlist")
public class Cmt_songlistRestController {
    @Autowired
    private Cmt_songlistService cmt_songlistService;


    @RequestMapping(value = "/deleteCmt_songlist", method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "comment_id", required = true)  int commentId, @RequestParam(value = "songlist_id", required = true)  int songlistId) {
        System.out.println("开始删除...");
        return cmt_songlistService.deleteCmt_songlist(commentId,songlistId);
    }

    @RequestMapping(value = "/addCmt_songlist", method = RequestMethod.POST)
    public boolean addCommentinfo(Cmt_songlist cmt_songlist){
        System.out.println("开始新增...");
        return cmt_songlistService.addCmt_songlist(cmt_songlist);
    }

    @RequestMapping(value = "/songlist_id", method = RequestMethod.GET)
    public List<Cmt_songlist> findBysong_id(@RequestParam(value = "songlist_id", required = true) int songlist_id) {
        System.out.println("开始查询...");
        return cmt_songlistService.findBysonglist_id(songlist_id);
    }
}