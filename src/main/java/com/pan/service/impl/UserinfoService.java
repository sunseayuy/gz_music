package com.pan.service.impl;


import com.pan.pojo.Userinfo;

/**
 * Title: UserinfoService
 * Description:
 * 用户信息数据接口
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月3日
 */
public interface UserinfoService {
    /**
     * 新增用户信息
     *
     * @param userinfo
     * @return
     */
    boolean addUserinfo(Userinfo userinfo);

    /**
     * 用户数据更新
     *
     * @param userinfo
     * @return
     */
    boolean updateUserinfo(Userinfo userinfo);

    /**
     * 用户修改特定参数:用户昵称
     *
     * @param userinfo
     * @return
     */
    boolean updateUserinfo_user_nickname(Userinfo userinfo);

    /**
     * 用户数据删除
     *
     * @param user_id
     * @return
     */
    boolean deleteUserinfo(int user_id);

    /**
     * 按条件查找：昵称
     * @param user_nickname
     */
    Userinfo findByuser_nickname(String user_nickname);
}