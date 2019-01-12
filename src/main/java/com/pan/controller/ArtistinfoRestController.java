package com.pan.controller;

import com.pan.pojo.Artistinfo;
import com.pan.service.impl.ArtistinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Title: UserRestController
 * Description:
 * 歌手数据控制层
 * Version:1.0.0
 *
 * @author lsy
 * @date 2018年3月19日
 */
@RestController
@RequestMapping(value = "/api/artistinfo")

public class ArtistinfoRestController {
    @Autowired
    private ArtistinfoService artistinfoService;
    @RequestMapping(value = "/addArtistinfo", method = RequestMethod.POST)
    public boolean addArtistinfo( Artistinfo artistinfo) {
        System.out.println("开始新增...");
        return artistinfoService.addArtistinfo(artistinfo);
    }

    @RequestMapping(value = "/updateArtistinfo", method = RequestMethod.PUT)
    public boolean updateArtistinfo( Artistinfo artistinfo) {
        System.out.println("开始更新...");
        return artistinfoService.updateArtistinfo(artistinfo);
    }


    @RequestMapping(value = "/deleteArtistinfo", method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "singer_id", required = true) int singerId) {
        System.out.println("开始删除...");
        return artistinfoService.deleteArtistinfo(singerId);
    }

    @RequestMapping(value = "/firsthanzicode", method = RequestMethod.GET)
    public List<Artistinfo> findByartist_firsthanzicode(@RequestParam(value = "firsthanzicode", required = true) String firsthanzicode) {
        System.out.println("开始查询...");
        return artistinfoService.findByartist_firsthanzicode(firsthanzicode);
    }
    @RequestMapping(value = "/firsthanzicode_page", method = RequestMethod.GET)
    public List<Artistinfo> findByartist_firsthanzicode_page(@RequestParam(value = "firsthanzicode", required = true) String firsthanzicode, int currentPage, int pageSize) {
        System.out.println("开始查询...");
        return artistinfoService.findByartist_firsthanzicode_page(firsthanzicode,currentPage,pageSize);
    }

    @RequestMapping(value = "/singer_label", method = RequestMethod.GET)
    public List<Artistinfo> findBysinger_label(@RequestParam(value = "singer_label", required = true) String singer_label) {
        System.out.println("开始查询...");
        return artistinfoService.findBysinger_label(singer_label);
    }
    @RequestMapping(value = "/singer_label_page", method = RequestMethod.GET)
    public List<Artistinfo> findBysinger_label_page(@RequestParam(value = "singer_label", required = true) String singer_label,int currentPage,int pageSize) {
        System.out.println("开始查询...");
        return artistinfoService.findBysinger_label_page(singer_label,currentPage,pageSize);
    }

    @RequestMapping(value = "/singer_id", method = RequestMethod.GET)
    public Artistinfo findBysinger_id(@RequestParam(value = "singer_id", required = true) int singer_id) {
        System.out.println("开始查询...");
        return artistinfoService.findBysinger_id(singer_id);
    }

    @RequestMapping(value = "/findsingerall", method = RequestMethod.GET)
    public List<Artistinfo> findsingerall() {
        System.out.println("开始查询...");
        return artistinfoService.findsingerall();
    }
    @RequestMapping(value = "/findsingerall_page", method = RequestMethod.GET)
    public List<Artistinfo> findsingerall_page(int currentPage,int pageSize) {
        System.out.println("开始查询...");
        return artistinfoService.findsingerall_page(currentPage,pageSize);
    }
}
