package com.test.testng.suite;

import org.testng.annotations.Test;

/**
 * 忽略测试
 *
 * @program：testFrameWithJava
 * @author: lvxueqing
 * @create: 2023/02/27 15:31
 */
public class IgnoreTest {

    @Test
    public void ignore1(){
        System.out.println("ignore1 执行");
    }

    @Test(enabled=false)
    public void ignore2(){
        System.out.println("ignore2 执行");
    }

    @Test(enabled=true)
    public void ignore3(){
        System.out.println("ignore3 执行");
    }


}
