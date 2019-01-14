package com.pan.controller;

/**
 * Title: UserRestController
 * Description:
 * 用户控制层
 * Version:1.0.0
 *
 * @author pancm
 * @date 2018年3月19日
 */

import com.pan.pojo.Userinfo;
import com.pan.service.impl.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * Title: UserRestController
 * Description:
 * 用户数据操作接口
 * Version:1.0.0
 * @author pancm
 * @date 2019年1月2日
 */
@RestController
@RequestMapping(value = "/api/userinfo")
@CrossOrigin
public class UserinfoRestController {
    @Autowired
    private UserinfoService userinfoService;
    @RequestMapping(value = "/addUserinfo", method = RequestMethod.POST)
    public boolean addUserinfo( Userinfo userinfo) {
        System.out.println("开始新增...");
        return userinfoService.addUserinfo(userinfo);
    }

    @RequestMapping(value = "/updateUserinfo", method = RequestMethod.PUT)
    public boolean updateUserinfo( Userinfo userinfo) {
        System.out.println("开始更新...");
        return userinfoService.updateUserinfo(userinfo);
    }

    @RequestMapping(value = "/updateUserinfo_nick_name", method = RequestMethod.PUT)
    public boolean updateUserinfo_user_nickname( Userinfo userinfo) {
        System.out.println("开始更新...");
        return userinfoService.updateUserinfo_user_nickname(userinfo);
    }

    @RequestMapping(value = "/deleteUserinfo", method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "user_id", required = true) int userinfoId) {
        System.out.println("开始删除...");
        return userinfoService.deleteUserinfo(userinfoId);
    }

    @RequestMapping(value = "/fingbyuser_nickname", method = RequestMethod.GET)
    public Userinfo findByuser_nickname(@RequestParam(value = "user_nickname", required = true) String userinfoNickname) {
        System.out.println("开始查询...");
        return userinfoService.findByuser_nickname(userinfoNickname);
    }

    @RequestMapping(value = "/findall", method = RequestMethod.GET)
    public List<Userinfo> findall() {
        System.out.println("开始查询...");
        return userinfoService.findALL();
    }
    @RequestMapping(value = "/findall_page", method = RequestMethod.GET)
    public List<Userinfo> findall_page(int currentPage,int pageSize) {
        System.out.println("开始查询...");
        return userinfoService.findALL_page(currentPage,pageSize);
    }
}
