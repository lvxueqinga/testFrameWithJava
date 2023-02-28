package test.extentdemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @program：testFrameWithJava
 * @author: lvxueqing
 * @create: 2023/02/28 19:29
 */
public class TestMethodDemo {

    @Test
    public void test1(){
        Assert.assertEquals(1,2);

    }

    @Test
    public void test2(){
        Assert.assertEquals(1,1);

    }

    @Test
    public void test3(){
        Assert.assertEquals("aa","aa");

    }

    @Test
    public void logDemo(){
        Reporter.log("这是我自己的日志");

        throw new RuntimeException("这是我自己的运行时异常");

    }

}
