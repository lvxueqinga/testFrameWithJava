package com.test.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @program：testFrameWithJava
 * @author: lvxueqing
 * @create: 2023/02/27 15:18
 */
public class suiteConfig {

    @BeforeSuite
    public void beforesuite(){
        System.out.println("suite前 运行");
    }

    @AfterSuite
    public void aftersuite(){
        System.out.println("suite后 运行");
    }

    @BeforeTest
    public void beforetest(){
        System.out.println("beforetest");
    }

    @AfterTest
    public void aftertest(){
        System.out.println("aftertest");
    }
}
