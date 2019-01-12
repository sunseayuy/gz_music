package com.pan.controller;

import com.pan.pojo.Albuminfo;
import com.pan.service.impl.AlbuminfoService;
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
@RequestMapping(value = "/api/albuminfo")
public class AlbuminfoRestController {
    @Autowired
    private AlbuminfoService albuminfoService;
    @RequestMapping(value = "/addAlbuminfo", method = RequestMethod.POST)
    public boolean addAlbuminfo( Albuminfo albuminfo) {
        System.out.println("开始新增...");
        return albuminfoService.addAlbuminfo(albuminfo);
    }

    @RequestMapping(value = "/updateAlbuminfo", method = RequestMethod.PUT)
    public boolean updateAlbuminfo( Albuminfo albuminfo) {
        System.out.println("开始更新...");
        return albuminfoService.updateAlbuminfo(albuminfo);
    }


    @RequestMapping(value = "/deleteAlbuminfo", method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "album_id", required = true) int albumId) {
        System.out.println("开始删除...");
        return albuminfoService.deleteAlbuminfo(albumId);
    }

    @RequestMapping(value = "/findalbuminfoBysong_id", method = RequestMethod.GET)
    public List<Albuminfo> findalbuminfoBysong_id(@RequestParam(value = "song_id", required = true) int song_id) {
        System.out.println("开始查询...");
        return albuminfoService.findalbuminfoBysong_id(song_id);
    }

    @RequestMapping(value = "/findalbuminfoByalbum_label", method = RequestMethod.GET)
    public List<Albuminfo> findalbuminfoByalbum_label(@RequestParam(value = "album_label", required = true) String album_label) {
        System.out.println("开始查询...");
        return albuminfoService.findalbuminfoByalbum_label(album_label);
    }
    @RequestMapping(value = "/findalbuminfoByalbum_label_page", method = RequestMethod.GET)
    public List<Albuminfo> findalbuminfoByalbum_label_page(@RequestParam(value = "album_label", required = true) String album_label,int currentPage,int pageSize) {
        System.out.println("开始查询...");
        return albuminfoService.findalbuminfoByalbum_label_page(album_label,currentPage,pageSize);
    }

    @RequestMapping(value = "/findalbuminfoBysinger_id", method = RequestMethod.GET)
    public List<Albuminfo> findalbuminfoBysinger_id(@RequestParam(value = "singer_id", required = true) int singer_id) {
        System.out.println("开始查询...");
        return albuminfoService.findalbuminfoBysinger_id(singer_id);
    }
    @RequestMapping(value = "/findalbuminfoBysinger_id_page", method = RequestMethod.GET)
    public List<Albuminfo> findalbuminfoBysinger_id_page(@RequestParam(value = "singer_id", required = true) int singer_id,int currentPage,int pageSize) {
        System.out.println("开始查询...");
        return albuminfoService.findalbuminfoBysinger_id_page(singer_id,currentPage,pageSize);
    }

    @RequestMapping(value = "/findalbuminfoByalbum_id", method = RequestMethod.GET)
    public Albuminfo findalbuminfoByalbum_id(@RequestParam(value = "album_id", required = true) int album_id) {
        System.out.println("开始查询...");
        return albuminfoService.findalbuminfoByalbum_id(album_id);
    }

    @RequestMapping(value = "/findalbuminfoBysinger_label", method = RequestMethod.GET)
    public List<Albuminfo> findalbuminfoBysinger_label(@RequestParam(value = "singer_label", required = true) String singer_label) {
        System.out.println("开始查询...");
        return albuminfoService.findalbuminfoBysinger_label(singer_label);
    }
    @RequestMapping(value = "/findalbuminfoBysinger_label_page", method = RequestMethod.GET)
    public List<Albuminfo> findalbuminfoBysinger_label_page(@RequestParam(value = "singer_label", required = true) String singer_label,int currentPage,int pageSize) {
        System.out.println("开始查询...");
        return albuminfoService.findalbuminfoBysinger_label_page(singer_label,currentPage,pageSize);
    }

    @RequestMapping(value = "/findalbuminfoall", method = RequestMethod.GET)
    public List<Albuminfo> findalbuminfoall() {
        System.out.println("开始查询...");
        return albuminfoService.findalbuminfoall();
    }
    @RequestMapping(value = "/findalbuminfoall_page", method = RequestMethod.GET)
    public List<Albuminfo> findalbuminfoall_page(int currentPage,int pageSize) {
        System.out.println("开始查询...");
        return albuminfoService.findalbuminfoall_page(currentPage,pageSize);
    }
}