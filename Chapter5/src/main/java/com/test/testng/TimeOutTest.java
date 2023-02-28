package com.test.testng;

import org.testng.annotations.Test;

/**
 * 超时
 *
 * @program：testFrameWithJava
 * @author: lvxueqing
 * @create: 2023/02/28 16:04
 */
public class TimeOutTest {


    @Test(timeOut = 3000) //毫秒
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(timeOut = 1000) //毫秒
    public void testFail() throws InterruptedException {
        Thread.sleep(2000);
    }
}
