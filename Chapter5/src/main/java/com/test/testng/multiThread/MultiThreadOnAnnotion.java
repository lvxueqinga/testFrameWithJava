package com.test.testng.multiThread;

import org.testng.annotations.Test;

/**
 * 多线程,注解实现
 *
 * @program：testFrameWithJava
 * @author: lvxueqing
 * @create: 2023/02/28 15:45
 */
public class MultiThreadOnAnnotion {


    @Test(invocationCount = 10, threadPoolSize = 3)
    public void test(){
        System.out.println(" 1  ");
        System.out.printf("thread id " + Thread.currentThread().getId());
    }
}
