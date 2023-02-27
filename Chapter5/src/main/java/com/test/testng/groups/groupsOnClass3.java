package com.test.testng.groups;

import org.testng.annotations.Test;

/**
 * @program：testFrameWithJava
 * @author: lvxueqing
 * @create: 2023/02/27 17:50
 */

@Test(groups = "teacher")
public class groupsOnClass3 {

    public void teacher1(){
        System.out.println("groupsOnClass3 的 teacher1 运行");
    }

    public void teacher2(){
        System.out.println("groupsOnClass3 的 teacher2 运行");
    }
}
