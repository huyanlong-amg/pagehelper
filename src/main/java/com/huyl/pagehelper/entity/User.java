package com.huyl.pagehelper.entity;

import lombok.Data;

@Data
public class User {
    // id
    private Integer id;

    // 中文名称
    private String name;

    // 年龄
    private Integer age;

    // 电子邮件
    private String email;


    private String ipAddr;

    /**
     * 组别 表中不存在的字段 如果插入的时候有值的话mp 依然会映射，导致插入数据库失败。
     * 处理方法：1.增加标识：transient (非序列化) 2.直接静态的 3.@TableField(exist=false)代表不是数据库中的字段
     */
    private transient String group;
}
