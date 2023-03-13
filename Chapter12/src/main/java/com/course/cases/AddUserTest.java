package com.course.cases;

import com.course.config.TestConfig;
import com.course.model.AddUserCase;
import com.course.utils.DatabaseUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * 添加用户接口测试
 *
 * @program：testFrameWithJava
 * @author: lvxueqing
 * @create: 2023/03/13 15:29
 */
public class AddUserTest {

    @Test(dependsOnGroups = "loginTrue",description = "添加用户接口接口")
    public void addUser() throws IOException, InterruptedException {

        SqlSession session = DatabaseUtil.getSqlSession();
        AddUserCase addUserTest = session.selectOne("addUserCase",1);
        System.out.println(addUserTest.toString());
        System.out.println(TestConfig.addUserUrl);



//        //下边的代码为写完接口的测试代码
//        String result = getResult(addUserCase);
//
//        /**
//         * 可以先讲
//         */
//        //查询用户看是否添加成功
//        Thread.sleep(2000);
//        User user = session.selectOne("addUser",addUserCase);
//        System.out.println(user.toString());
//
//
//        //处理结果，就是判断返回结果是否符合预期
//        Assert.assertEquals(addUserCase.getExpected(),result);


    }
}
