package com.course.model;

import lombok.Data;

/**
 * 用户表
 *
 * @program：testFrameWithJava
 * @author: lvxueqing
 * @create: 2023/03/07 16:21
 */
@Data
public class User {
    private int id;
    private int age;
    private String name;
    private String sex;
}
