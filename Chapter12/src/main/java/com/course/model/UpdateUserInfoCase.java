package com.course.model;

import lombok.Data;

@Data
public class UpdateUserInfoCase {

    private int id;
    private int userid;
    private String username;
    private String sex;
    private String age;
    private String permission;
    private String delete;
    private String expected;

}
