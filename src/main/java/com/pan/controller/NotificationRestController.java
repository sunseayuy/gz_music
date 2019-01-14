package com.pan.controller;

import com.pan.pojo.Notification;
import com.pan.service.impl.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/notification")
@CrossOrigin
public class NotificationRestController {
    @Autowired
    private NotificationService notificationService;
    @RequestMapping(value = "/addNotification", method = RequestMethod.POST)
    public boolean addNotification( Notification notification) {
        System.out.println("开始新增...");
        return notificationService.addNotification(notification);
    }

    @RequestMapping(value = "/updateNotification", method = RequestMethod.PUT)
    public boolean updateNotification( Notification notification) {
        System.out.println("开始更新...");
        return notificationService.updateNotification(notification);
    }

    @RequestMapping(value = "/deleteNotification", method = RequestMethod.DELETE)
    public boolean deleteNotification(@RequestParam(value = "notification_id", required = true) int notification_id) {
        System.out.println("开始删除...");
        return notificationService.deleteNotification(notification_id);
    }

    @RequestMapping(value = "/findNotification", method = RequestMethod.GET)
    public List<Notification> findNotification() {
        System.out.println("开始查询...");
        return notificationService.findNotification();
    }

    /**
     * 分页根据songlist_label查询
     * @param
     * @return
     */
    @RequestMapping(value = "/findNotification_page", method = RequestMethod.GET)
    public List<Notification> findBysonglist_labelpage(int currentPage,int pageSize) {
        System.out.println("开始查询...");
        return notificationService.findNotification_page(currentPage, pageSize);
    }
}
