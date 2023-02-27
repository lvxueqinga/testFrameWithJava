package com.test.testng.groups;

import org.testng.annotations.Test;

/**
 * @program：testFrameWithJava
 * @author: lvxueqing
 * @create: 2023/02/27 17:49
 */

@Test(groups = "class")
public class groupsOnClass1 {

    public void stu1(){
        System.out.println("groupsOnClass1 的 stu1 运行");
    }

    public void stu2(){
        System.out.println("groupsOnClass1 的 stu2 运行");
    }
}
