package com.pan.service.impl;


import com.pan.dao.UserinfoDao;
import com.pan.pojo.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Title: SonginfoServiceImpl
 * Description:
 * 歌曲数据操作实现类
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月2日
 */
@Service
public class UserinfoServiceImpl implements UserinfoService{
    @Autowired
    private UserinfoDao userinfoDao;
    @Override
    public boolean addUserinfo(Userinfo userinfo) {
        boolean flag = false;
        try {
            userinfoDao.addUserinfo(userinfo);
            flag = true;
        } catch (Exception e) {
            System.out.println("新增失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateUserinfo(Userinfo userinfo) {
        boolean flag = false;
        try {
            userinfoDao.updateUserinfo(userinfo);
            flag = true;
        } catch (Exception e) {
            System.out.println("修改失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateUserinfo_user_nickname(Userinfo userinfo) {
        boolean flag = false;
        try {
            userinfoDao.updateUserinfo_user_nickname(userinfo);
            flag = true;
        } catch (Exception e) {
            System.out.println("修改失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteUserinfo(int user_id) {
        boolean flag = false;
        try {
            userinfoDao.deleteUserinfo(user_id);
            flag = true;
        } catch (Exception e) {
            System.out.println("删除失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public Userinfo findByuser_nickname(String user_nickname) {
        return userinfoDao.findByuser_nickname(user_nickname);
    }
}