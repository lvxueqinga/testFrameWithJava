package com.test.testng.multiThread;

import org.testng.annotations.Test;

/**
 * 多线程，xml实现
 *
 * @program：testFrameWithJava
 * @author: lvxueqing
 * @create: 2023/02/28 15:51
 */
public class MultiThreadOnXml {


    @Test
    public void test(){
        System.out.printf("thread id " + Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("thread id " + Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("thread id " + Thread.currentThread().getId());
    }
}
