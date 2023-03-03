package com.httpclient.demo;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * httpclient 练习
 *
 * @program：testFrameWithJava
 * @author: lvxueqing
 * @create: 2023/03/03 10:41
 */
public class MyHttpClient {

    @Test
    public void test() throws IOException {
        String result ; // 用来存放结果
        HttpGet get = new HttpGet("http://www.baidu.com");
        //用来执行get方法
        DefaultHttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);

    }
}
