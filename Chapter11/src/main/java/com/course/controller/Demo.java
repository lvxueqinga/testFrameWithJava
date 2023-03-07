package com.course.controller;

import com.course.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program：testFrameWithJava
 * @author: lvxueqing
 * @create: 2023/03/07 15:55
 */
@Log4j
@RestController
@Api(value = "v1",description = "这是我第一个版本的demo")
@RequestMapping("v1")
public class Demo {

    //首先获取一个执行sql的对象
    @Autowired
    private SqlSessionTemplate template;

    @RequestMapping(value = "/get/user/count",method = RequestMethod.GET)
    @ApiOperation(value = "获取用户数")
    public int getUserCount(){
        return template.selectOne("getUserCount");
    }


    @RequestMapping(value = "/add/user",method = RequestMethod.POST)
    @ApiOperation(value = "新增用户")
    public int addUser(@RequestBody User user){
        return template.insert("addUser",user);
    }


    @RequestMapping(value = "/update/user",method = RequestMethod.POST)
    @ApiOperation(value = "更新用户")
    public int updateUser(@RequestBody User user){
        return template.update("updateUser",user);
    }

    @RequestMapping(value = "/delete/user",method = RequestMethod.POST)
    @ApiOperation(value = "删除用户")
    public int deleteUser(@RequestBody User user){
        return template.delete("deleteUser",user);
    }



}
