package com.pan.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin
public class ErrorPageController {
    @RequestMapping(value = "/error/{code}")
    public String error(@PathVariable int code, Model model) {
        String pager = "";
        switch (code) {
            //403页面，无权限
            case 403:
                model.addAttribute("code", 403);
                pager = "/error_403";
                break;
                //页面不存在
            case 404:
                model.addAttribute("code", 404);
                pager = "/error_404";
                break;
                //服务器错误
            case 500:
                model.addAttribute("code", 500);
                pager = "/error_500";
                break;
        }
        return pager;
    }

}
