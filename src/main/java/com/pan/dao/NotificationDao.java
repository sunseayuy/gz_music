package com.pan.dao;



import com.pan.pojo.Notification;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Title: NotificationDao
 * Description:
 * 通知信息数据接口
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月2日
 */
@Mapper
public interface NotificationDao {
    /**
     * 用户数据新增
     */
    @Insert("insert into notification(notification_id,admin_id,notification_head,notification_content,notification_time) values (#{notification_id},#{admin_id},#{notification_head},#{notification_content},#{notification_time})")
    void addNotification(Notification notification);

    /**
     * 用户数据更新
     */
    @Update("update notification set notification_id=#{notification_id},admin_id=#{admin_id},notification_head=#{notification_head},notification_content=#{notification_content},notification_time=#{notification_time} where notification_id=#{notification_id}")
    void updateNotification(Notification notification);

    /**
     * 用户数据删除
     */
    @Delete("delete from notification where notification_id=#{notification_id}")
    void deleteNotification(int notification_id);

    /**
     * 按条件查找所有
     */
    @Select("SELECT notification_id,admin_id,notification_head,notification_content,notification_time FROM notification")
    List<Notification> findNotification();
    /**
     * 所有通知条数
     */
    @Select("SELECT count(*) FROM notification")
    int findNotification_countItem();
}
