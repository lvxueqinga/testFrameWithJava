package com.course.server;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
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

    /**
     * 需要携带参数才能访问的get请求
     * 方式1： http://localhost:8080/get/with/param?start=1&end=10
     * 模拟获取商品列表, 名称和价格
     */

    @RequestMapping(value = "/get/with/param",method = RequestMethod.GET)
    public Map<String,Integer> getList1(@RequestParam Integer start, @RequestParam Integer end){

        Map<String,Integer> mylist = new HashMap<>();
        mylist.put("鞋",400);
        mylist.put("杯子",40);
        mylist.put("衬衫",100);
        mylist.put("平板",4500);
        return mylist;

    }

    /**
     * 需要携带参数才能访问的get请求
     * 方式2： http://localhost:8080/get/with/param//1/10
     * 模拟获取商品列表, 名称和价格
     */
    @RequestMapping(value = "/get/with/param/{start}/{end}")
    public Map<String,Integer> getList2(@PathVariable Integer start, @PathVariable Integer end){
        Map<String,Integer> mylist = new HashMap<>();
        mylist.put("鞋1",400);
        mylist.put("杯子1",40);
        mylist.put("衬衫1",100);
        mylist.put("平板1",4500);
        return mylist;
    }

}
