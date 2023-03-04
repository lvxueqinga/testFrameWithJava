package com.course.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

/**
 * get方法
 *
 * @program：testFrameWithJava
 * @author: lvxueqing
 * @create: 2023/03/04 13:08
 */

@RestController
public class MyGetMethod {

    /**
     * 返回cookie信息的get接口
     */
    @RequestMapping(value = "/getcookies",method = RequestMethod.GET)
    public String getCookies(HttpServletResponse response){

        //HttpServletRequest 装请求信息的类
        //HttpServletResponse 装响应信息的类

        Cookie cookie = new Cookie("login","true");
        response.addCookie(cookie);

        return  "恭喜获得cookies信息成功";
    }

    /**
     * 要求携带cookie访问的get请求
     */

    @RequestMapping(value = "/get/with/cookies",method = RequestMethod.GET)
    public String getWithCookies(HttpServletRequest request){

        Cookie[] cookies = request.getCookies();

        if (Objects.isNull(cookies)){
            return "访问失败 无cookies";
        }

        for (Cookie c:cookies){
            if (c.getName().equals("login") && c.getValue().equals("true")){
                return "成功 这是一个需要携带cookies信息才能访问的get请求";
            }

        }
        return "访问失败 无cookies";
    }

}
