package com.test.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * 参数化
 *
 * @program：testFrameWithJava
 * @author: lvxueqing
 * @create: 2023/02/28 15:29
 */
public class DataProviderTest {

    @Test(dataProvider = "data")
    public void test1(String name, String age){
        System.out.println("name = " + name + " age = " + age);
    }

    @DataProvider(name = "data")
    public Object[][] dataprovider(){
        Object[][] o = new Object[][]{
                {"zhangsan","10"},
                {"lisi","20"},
                {"wangwu","30"}
        };
        return o;
    }


    //通过方法名传递参数

    @Test(dataProvider = "dp")
    public void test2(String name, String age){

        System.out.println("test2 ， name = " + name + " age = " + age);
    }

    @Test(dataProvider = "dp")
    public void test3(String name, String age){

        System.out.println("test3 ， name = " + name + " age = " + age);
    }

    @DataProvider(name = "dp")
    public Object[][] dp(Method method){
        Object[][] o = null;
        if (method.getName().equals("test2")){
            o = new Object[][]{
                    {"zhaoliu","18"},
                    {"lisi","70"}
            };
        }else if (method.getName().equals("test3")){
            o = new Object[][]{
                    {"baga","30"},
                    {"huahua","21"}
            };
        }else {
            o = new Object[][]{
                    {"haha","11"},
                    {"huhu","22"},
                    {"hehe","33"}
            };
        }

        return o;
    }




}
