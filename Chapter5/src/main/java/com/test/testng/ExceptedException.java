package com.test.testng;

import org.testng.annotations.Test;

/**
 * 异常测试
 *
 * @program：testFrameWithJava
 * @author: lvxueqing
 * @create: 2023/02/27 18:10
 */
public class ExceptedException {

    @Test(expectedExceptions = RuntimeException.class)
    public void runtimeExceptionFailed(){
        System.out.println("失败的异常测试");

    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runtimeExceptionSuccess(){
        System.out.println("成功的异常测试");
        throw new RuntimeException();

    }
}
