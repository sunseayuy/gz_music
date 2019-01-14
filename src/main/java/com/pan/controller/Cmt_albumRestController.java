package com.pan.controller;

import com.pan.pojo.Cmt_album;
import com.pan.service.impl.Cmt_albumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Title: Cmt_albumRestController
 * Description:
 * 专辑评论数据控制层
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月5日
 */
@RestController
@RequestMapping(value = "/api/cmt_album")
@CrossOrigin
public class Cmt_albumRestController {
    @Autowired
    private Cmt_albumService cmt_albumService;


    @RequestMapping(value = "/deleteCmt_album", method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "comment_id", required = true)  int commentId, @RequestParam(value = "album_id", required = true)  int albumId) {
        System.out.println("开始删除...");
        return cmt_albumService.deleteCmt_album(commentId,albumId);
    }

    @RequestMapping(value = "/addCmt_album", method = RequestMethod.POST)
    public boolean addCommentinfo(Cmt_album cmt_album){
        System.out.println("开始新增...");
        return cmt_albumService.addCmt_album(cmt_album);
    }

    @RequestMapping(value = "/album_id", method = RequestMethod.GET)
    public List<Cmt_album> findByalbum_id(@RequestParam(value = "album_id", required = true) int album_id) {
        System.out.println("开始查询...");
        return cmt_albumService.findByalbum_id(album_id);
    }
    @RequestMapping(value = "/album_id_page", method = RequestMethod.GET)
    public List<Cmt_album> findByalbum_id_page(@RequestParam(value = "album_id", required = true) int album_id,int currentPage, int pageSize) {
        System.out.println("开始查询...");
        return cmt_albumService.findByalbum_id_page(album_id,currentPage,pageSize);
    }
    @RequestMapping(value = "/findall", method = RequestMethod.GET)
    public List<Cmt_album> findall(int currentPage, int pageSize) {
        System.out.println("开始查询...");
        return cmt_albumService.findall(currentPage,pageSize);
    }
}
