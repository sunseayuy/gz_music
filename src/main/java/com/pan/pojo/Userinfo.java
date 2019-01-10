package com.pan.pojo;


import javax.persistence.*;

/**
 * Title: userinfo
 * Description:用户pojo类
 * Version:1.0.0
 *
 * @author lsy
 * @date 2019年1月3日
 */

@Entity
@Table(name = "userinfo")
public class Userinfo {
    /**
     * 用户id
     */
    @Id
    @GeneratedValue
    private int user_id;

    /**
     * 用户昵称
     */
    @Column(nullable = false,unique = true)
    private String user_nickname;

    /**
     * 用户姓名
     */
    @Column
    private String user_real_name;

    /**
     * 用户性别
     */
    @Column
    private char user_sex;

    /**
     * 用户电话号码
     */
    @Column(nullable = false,unique = true)
    private int user_phone_number;

    /**
     * 用户邮件号码
     */
    @Column(nullable = false,unique = true)
    private String user_email;

    /**
     * 用户国家
     */
    @Column
    private char user_country;

    /**
     * 用户省份
     */
    @Column
    private char user_province;

    /**
     * 用户城市
     */
    @Column
    private char user_city;

    /**
     * 用户简介
     */
    @Column
    private String user_intro;

    /**
     * 用户信用度
     */
    @Column
    private int user_credit;

    /**
     * 用户图片
     */
    @Column
    private String avatar_url;

    public Userinfo() {
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_nickname() {
        return user_nickname;
    }

    public String getUser_real_name() {
        return user_real_name;
    }

    public void setUser_real_name(String user_real_name) {
        this.user_real_name = user_real_name;
    }

    public void setUser_nickname(String user_nickname) {
        this.user_nickname = user_nickname;
    }

    public char getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(char user_sex) {
        this.user_sex = user_sex;
    }

    public int getUser_phone_number() {
        return user_phone_number;
    }

    public void setUser_phone_number(int user_phone_number) {
        this.user_phone_number = user_phone_number;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public char getUser_country() {
        return user_country;
    }

    public void setUser_country(char user_country) {
        this.user_country = user_country;
    }

    public char getUser_province() {
        return user_province;
    }

    public void setUser_province(char user_province) {
        this.user_province = user_province;
    }

    public char getUser_city() {
        return user_city;
    }

    public void setUser_city(char user_city) {
        this.user_city = user_city;
    }

    public String getUser_intro() {
        return user_intro;
    }

    public void setUser_intro(String user_intro) {
        this.user_intro = user_intro;
    }

    public int getUser_credit() {
        return user_credit;
    }

    public void setUser_credit(int user_credit) {
        this.user_credit = user_credit;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }
}
