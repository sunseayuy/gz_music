package com.pan.controller;

import com.pan.pojo.Comment;
import com.pan.service.impl.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Title: CommentRestController
 * Description:
 * 歌曲评论数据控制层
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月5日
 */
@RestController
@RequestMapping(value = "/api/comment")
public class CommentRestController {
    @Autowired
    private CommentService commentService;


    @RequestMapping(value = "/deleteComment", method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "comment_id", required = true)  int commentId, @RequestParam(value = "song_id", required = true)  int songId) {
        System.out.println("开始删除...");
        return commentService.deleteComment(commentId,songId);
    }

    @RequestMapping(value = "/addComment", method = RequestMethod.POST)
    public boolean addCommentinfo(Comment comment){
        System.out.println("开始新增...");
        return commentService.addComment(comment);
    }

    @RequestMapping(value = "/song_id", method = RequestMethod.GET)
    public List<Comment> findBysong_id(@RequestParam(value = "song_id", required = true) int song_id) {
        System.out.println("开始查询...");
        return commentService.findBysong_id(song_id);
    }

    @RequestMapping(value = "/song_id_page", method = RequestMethod.GET)
    public List<Comment> findBysong_id_page(@RequestParam(value = "song_id", required = true) int song_id,int currentPage, int pageSize) {
        System.out.println("开始查询...");
        return commentService.findBysong_id_page(song_id,currentPage,pageSize);
    }

}

