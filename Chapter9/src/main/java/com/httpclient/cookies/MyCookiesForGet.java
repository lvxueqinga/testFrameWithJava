package com.httpclient.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @program：testFrameWithJava
 * @author: lvxueqing
 * @create: 2023/03/03 11:13
 *
 * MyHttpClient 的优化
 * 使用 application.properties进行配置
 * ResourceBundle 来读取properties的文件内容
 */
public class MyCookiesForGet {

    private String url ;
    private ResourceBundle bundle;

    @BeforeTest
    public void  beforetest(){

        bundle = ResourceBundle.getBundle("application", Locale.CHINA);
        url = bundle.getString("test.url");

    }

    @Test
    public void testgetcookies() throws IOException {
        String result ;
        HttpGet get = new HttpGet(this.url + bundle.getString("getCookies.uri"));

        //执行
        DefaultHttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.printf(result);


        //获取cookies信息
        CookieStore cookieStore = client.getCookieStore();
        List<Cookie> cookies = cookieStore.getCookies();
        for(Cookie c : cookies){
            String name = c.getName();
            String value = c.getValue();
            System.out.println("name=" + name +" , value=" + value);
        }

    }
}
