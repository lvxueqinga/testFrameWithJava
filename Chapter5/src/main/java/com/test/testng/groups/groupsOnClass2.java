package com.test.testng.groups;

import org.testng.annotations.Test;

/**
 * @program：testFrameWithJava
 * @author: lvxueqing
 * @create: 2023/02/27 17:50
 */


@Test(groups = "class")
public class groupsOnClass2 {

    public void stu1(){
        System.out.println("groupsOnClass2 的 stu1 运行");
    }

    public void stu2(){
        System.out.println("groupsOnClass2 的 stu2 运行");
    }
}
