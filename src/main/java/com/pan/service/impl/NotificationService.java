package com.pan.service.impl;

import com.pan.pojo.Notification;

import java.util.List;

/**
 * Title: SonginfoService
 * Description:
 * 通知信息数据接口
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月11日
 */

public interface NotificationService {
    /**
     * 新增通知
     *
     * @param notification
     * @return
     */
    boolean addNotification(Notification notification);

    /**
     * 更新通知信息
     *
     * @param notification
     * @return
     */
    boolean updateNotification(Notification notification);

    /**
     * 删除通知信息
     *
     * @param notification_id
     * @return
     */
    boolean deleteNotification(int notification_id);


    /**
     * 查询所有通知信息
     * @param
     */
    List<Notification> findNotification();
    /**
     * 分页查询所有通知信息
     * @param
     */
    List<Notification> findNotification_page(int currentPage,int pageSize);
}
