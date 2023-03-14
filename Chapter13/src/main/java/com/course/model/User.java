package com.course.model;

import lombok.Data;

/**
 * @program：testFrameWithJava
 * @author: lvxueqing
 * @create: 2023/03/14 11:34
 */
@Data
public class User {

    private int id;
    private String username;
    private String password;
    private String age;
    private int sex ;
    private int permission ;
    private int delete ;

}
