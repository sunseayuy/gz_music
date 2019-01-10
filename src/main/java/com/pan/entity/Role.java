package com.pan.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * 角色类
 *
 * Created by FantasticPan on 2018/6/4.
 */
@Entity
@Table
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
