package com.pan.service.impl;

import com.github.pagehelper.PageHelper;
import com.pan.dao.NotificationDao;
import com.pan.pojo.Notification;
import com.pan.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Title: NotificationServiceImpl
 * Description:
 * 通知数据操作实现类
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月11日
 */
@Service
public class NotificationServiceImpl implements NotificationService {
    @Autowired
    private NotificationDao notificationDao;
    @Override
    public boolean addNotification(Notification notification) {
        boolean flag = false;
        try {
            notificationDao.addNotification(notification);
            flag = true;
        } catch (Exception e) {
            System.out.println("新增失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateNotification(Notification notification) {
        boolean flag = false;
        try {
            notificationDao.updateNotification(notification);
            flag = true;
        } catch (Exception e) {
            System.out.println("修改失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteNotification(int notification_id) {
        boolean flag = false;
        try {
            notificationDao.deleteNotification(notification_id);
            flag = true;
        } catch (Exception e) {
            System.out.println("删除失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public List<Notification> findNotification() {
        return notificationDao.findNotification();
    }

    @Override
    public List<Notification> findNotification_page(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<Notification> allItems = notificationDao.findNotification();        //全部商品
        int countNums = notificationDao.findNotification_countItem();            //总记录数
        PageBean<Notification> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allItems);
        return pageData.getItems();
    }
}
