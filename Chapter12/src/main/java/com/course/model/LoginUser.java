package com.course.model;

import lombok.Data;

/**
 * loginuser
 *
 * @program：testFrameWithJava
 * @author: lvxueqing
 * @create: 2023/03/10 20:53
 */
@Data
public class LoginUser {

    private int id;
    private String username;
    private String password;
    private String age;
    private int sex ;
    private int permission ;
    private int delete ;

    @Override
    public String toString(){
        return (
                "id:"+id+","+
                        "userName:"+username+","+
                        "password:"+password+","+
                        "age:"+age+","+
                        "sex:"+sex+","+
                        "permission:"+permission+","+
                        "isDelete:"+delete+"}"
        );
    }
}
