package com.course.server;

import com.course.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

/**
 * post方法
 *
 * @program：testFrameWithJava
 * @author: lvxueqing
 * @create: 2023/03/06 12:49
 */

@RestController
@Api(value = "/" ,description = "全部的post方法")
public class MyPostMethod {

    //装cookie信息
    private Cookie cookie;

    //场景 用户登陆获取cookie 获取列表信息

    /**
     * 登陆
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ApiOperation(value = "登陆接口 成功后获取cookie",httpMethod = "POST")
    public String login(HttpServletResponse response,
                        @RequestParam(value = "账号",required = true) String username,
                        @RequestParam(value = "密码",required = true) String password){

            if (username.equals("zhangsan") && password.equals("123456")){

                cookie = new Cookie("login","true");
                response.addCookie(cookie);
                response.setStatus(1000);
                return "恭喜登陆成功";
            }
        return "呜呜 登陆失败";

    }


    /**
     * 验证cookies 和入参  返回用户列表
     */

    @RequestMapping(value = "/get/user/list" , method = RequestMethod.POST)
    @ApiOperation(value = "获取用户列表",httpMethod = "POST")
    public String gettUserList(HttpServletRequest request, @RequestBody User u){
        Cookie[] cookies = request.getCookies();
        if (Objects.isNull(cookies) == true){
            return null;
        }
        for (Cookie cookie:cookies){
            if (cookie.getName().equals("login") && cookie.getValue().equals("true")
            && u.getName().equals("lxq")
            ){
                User user = new User();
                user.setName("zhangsan");
                user.setAge("18");
                user.setSex("man");

                return user.toString();
            }
        }
        return "参数不合法";
    }
}
