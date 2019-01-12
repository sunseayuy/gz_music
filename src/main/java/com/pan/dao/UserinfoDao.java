package com.pan.dao;


import com.pan.pojo.Userinfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Title: SonginfoDao
 * Description:
 * 用户信息数据接口
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月2日
 */
@Mapper

public interface UserinfoDao {
    /**
     * 用户数据新增
     */
    @Insert("insert into userinfo(user_id,user_nickname,user_real_name,user_sex,user_phone_number,user_email,user_country,user_province,user_city,user_intro,user_credit,avatar_url) values (#{user_id},#{user_nickname},#{user_real_name},#{user_sex},#{user_phone_number},#{user_email},#{user_country},#{user_province},#{user_city},#{user_intro},#{user_credit},#{avatar_url})")
    void addUserinfo(Userinfo userinfo);

    /**
     * 用户数据更新
     */
    @Update("update userinfo set user_nickname=#{user_nickname},user_real_name=#{user_real_name},user_sex=#{user_sex},user_phone_number=#{user_phone_number},user_email=#{user_email},user_country=#{user_country},user_province=#{user_province},user_city=#{user_city},user_intro=#{user_intro},user_credit=#{user_credit},avatar_url=#{avatar_url} where user_id=#{user_id}")
    void updateUserinfo(Userinfo userinfo);

    /**
     * 用户修改特定参数:用户昵称
     */
    @Update("update userinfo set user_nickname=#{user_nickname} where user_id=#{user_id}")
    void updateUserinfo_user_nickname(Userinfo userinfo);

    /**
     * 用户数据删除
     */
    @Delete("delete from userinfo where user_id=#{user_id}")
    void deleteUserinfo(int user_id);

    /**
     * 按条件查找：昵称
     */
    @Select("SELECT user_id,user_nickname,user_real_name,user_sex,user_phone_number,user_email,user_country,user_province,user_city,user_intro,user_credit,avatar_url FROM userinfo where user_nickname=#{user_nickname}")
    Userinfo findByuser_nickname(String user_nickname);

    /**
     * 查找所有用户
     */
    @Select("SELECT user_id,user_nickname,user_real_name,user_sex,user_phone_number,user_email,user_country,user_province,user_city,user_intro,user_credit,avatar_url FROM userinfo")
    List<Userinfo> findUserinfoALL();
    /**
     * 所有用户数量
     */
    @Select("SELECT count(*) FROM userinfo")
    int findUserinfoALL_count();
}