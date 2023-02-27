package com.test.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * 参数化测试
 *
 * @program：testFrameWithJava
 * @author: lvxueqing
 * @create: 2023/02/27 18:32
 */
public class ParameterTestt {

    @Test
    @Parameters({"name","age"})
    public void test1(String name, String age){
        System.out.println("name = " + name + " age = " + age);
    }
}
