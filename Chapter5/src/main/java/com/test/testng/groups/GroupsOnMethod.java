package com.test.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * 方法的分组
 *
 * @program：testFrameWithJava
 * @author: lvxueqing
 * @create: 2023/02/27 15:37
 */
public class GroupsOnMethod {

    @Test(groups = "A")
    public void test1(){
        System.out.println("A组 test1 执行");
    }

    @Test(groups = "A")
    public void test2(){
        System.out.println("A组 test2 执行");
    }

    @Test(groups = "B")
    public void test3(){
        System.out.println("B组 test3 执行");
    }

    @Test(groups = "B")
    public void test4(){
        System.out.println("B组 test4 执行");
    }



    @BeforeGroups("A")
    public void beforegroupsOnA(){
        System.out.println("A组 运行前的方法");
    }

    @AfterGroups("A")
    public void aftergroupsOnA(){
        System.out.println("A组 运行后的方法");
    }


    @BeforeGroups("B")
    public void beforegroupsOnB(){
        System.out.println("B组 运行前的方法");
    }

    @AfterGroups("B")
    public void aftergroupsOnB(){
        System.out.println("B组 运行后的方法");
    }
}
