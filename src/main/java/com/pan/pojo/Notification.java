package com.pan.pojo;

import javax.persistence.*;

/**
 * Title: Notification
 * Description:通知pojo类
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月10日
 */

@Entity
@Table(name = "notification")
public class Notification {
    /**
     * 通知id
     */
    @Id
    @GeneratedValue
    private int notification_id;

    /**
     * 管理员id
     */
    @Column(nullable = false)
    private int admin_id;

    /**
     * 通知标题
     */
    @Column(nullable = false)
    private String notification_head;
    /**
     * 通知内容
     */
    @Column(nullable = false)
    private String notification_content;
    /**
     * 通知时间
     */
    @Column(nullable = false)
    private String notification_time;

    public Notification(){
    }

    public int getNotification_id() {
        return notification_id;
    }

    public void setNotification_id(int notification_id) {
        this.notification_id = notification_id;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getNotification_head() {
        return notification_head;
    }

    public void setNotification_head(String notification_head) {
        this.notification_head = notification_head;
    }

    public String getNotification_content() {
        return notification_content;
    }

    public void setNotification_content(String notification_content) {
        this.notification_content = notification_content;
    }

    public String getNotification_time() {
        return notification_time;
    }

    public void setNotification_time(String notification_time) {
        this.notification_time = notification_time;
    }
}
