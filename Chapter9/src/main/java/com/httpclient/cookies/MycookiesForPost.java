package com.httpclient.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @program：testFrameWithJava
 * @author: lvxueqing
 * @create: 2023/03/03 14:55
 */
public class MycookiesForPost {

    private String url ;
    private ResourceBundle bundle;
    private CookieStore cookieStore; // 用来存储cookie信息

    @BeforeTest
    public void  beforetest(){

        bundle = ResourceBundle.getBundle("application", Locale.CHINA);
        url = bundle.getString("test.url");

    }

    @Test
    public void testpostcookies() throws IOException {
        String result ;
        HttpGet get = new HttpGet(this.url + bundle.getString("getCookies.uri"));

        //声明client对象 用来执行
        DefaultHttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.printf(result);


        //获取cookies信息
        this.cookieStore = client.getCookieStore();
        List<Cookie> cookies = cookieStore.getCookies();
        for(Cookie c : cookies){
            String name = c.getName();
            String value = c.getValue();
            System.out.println("name=" + name +" , value=" + value);
        }

    }


    @Test(dependsOnMethods = {"testpostcookies"})
    public void testwithcookies() throws IOException {

        //声明client对象 用来进行方法的执行
        DefaultHttpClient client = new DefaultHttpClient();

        //声明方法
        HttpPost post = new HttpPost(this.url + bundle.getString("test.post.with.cookies"));

        //添加参数
        JSONObject obj = new JSONObject();
        obj.put("name","huhansan");
        obj.put("age","18");

        //设置请求头信息，header
        post.setHeader("content-type","application/json");
        //将参数添加到方法中
        StringEntity entity = new StringEntity(obj.toString(),"utf-8");
        post.setEntity(entity);


        //声明对象进行结果的存储
        String result ;

        //设置cookies信息
        client.setCookieStore(this.cookieStore);

        //执行post方法
        HttpResponse response = client.execute(post);
        //获取响应结果
        result = EntityUtils.toString(response.getEntity());
        System.out.println(result);

        //将返回的结果转化为json对象，
        JSONObject resultjson = new JSONObject(result);

        // 具体判断结果值
        String success = (String) resultjson.get("huhansan");
        Assert.assertEquals("success",success);



    }
}
