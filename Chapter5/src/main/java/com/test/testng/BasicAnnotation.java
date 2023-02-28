package com.test.testng;


import org.testng.annotations.*;

/**
 * testng基础标签
 *
 * @program：testFrameWithJava
 * @author: lvxueqing
 * @create: 2023/02/27 15:00
 */
public class BasicAnnotation {


    @Test
    public void testCase1(){
        System.out.println("测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("测试用例2");
    }

    @BeforeMethod
    public void testbeforemethod(){
        System.out.println("测试用例前");
    }

    @AfterMethod
    public void testaftermethod(){
        System.out.println("测试用例后");
    }

    @BeforeClass
    public void beforeclass(){
        System.out.println("类前");
    }

    @AfterClass
    public void afterclass(){
        System.out.println("类后");
    }

    @BeforeSuite
    public void beforesuite(){
        System.out.println("suite前");
    }

    @AfterSuite
    public void aftersuite(){
        System.out.println("suite后");
    }

}
