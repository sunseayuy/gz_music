package com.pan.controller;

import com.pan.pojo.Search;
import com.pan.pojo.Songinfo;
import com.pan.service.impl.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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
@RequestMapping(value = "/api/search")
@CrossOrigin
public class SearchRestController {
    @Autowired
    private SearchService searchService;
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public Search find(@RequestParam(value = "search", required = true) String search) {
        System.out.println("开始查询...");
        return searchService.Search(search);
    }
}
