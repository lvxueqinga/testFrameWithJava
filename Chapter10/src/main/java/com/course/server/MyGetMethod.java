package com.course.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * get方法
 *
 * @program：testFrameWithJava
 * @author: lvxueqing
 * @create: 2023/03/04 13:08
 */

@RestController
public class MyGetMethod {

    @RequestMapping(value = "/getcookies",method = RequestMethod.GET)
    public String getCookies(HttpServletResponse response){

        //HttpServletRequest 装请求信息的类
        //HttpServletResponse 装响应信息的类

        Cookie cookie = new Cookie("login","true");
        response.addCookie(cookie);

        return  "恭喜获得cookies信息成功";
    }

}
