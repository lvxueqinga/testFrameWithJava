package com.test.testng;

import org.testng.annotations.Test;

/**
 * 依赖测试
 *
 * @program：testFrameWithJava
 * @author: lvxueqing
 * @create: 2023/02/27 18:15
 */
public class DependTest {

    @Test
    public void test1(){
        System.out.println("test1 run");
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
