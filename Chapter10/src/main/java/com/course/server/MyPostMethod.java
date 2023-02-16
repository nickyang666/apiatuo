package com.course.server;

import com.course.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description:
 * @author:yang
 * @time:2023/2/16 16:25
 */

@RestController
@Api(value = "/",description="这是我的全部post请求" )  //swagger-ui，描述
@RequestMapping("/v1")  //所有方法前面都要加v1
public class MyPostMethod {

    //这个变量是用来装我们cookies信息，servlet方法中http
    private static Cookie cookie;

    //用户登录成功获取到cookies，然后再访问其他接口获取列表
    @RequestMapping(value = "/login",method= RequestMethod.POST)
    @ApiOperation(value = "登录接口，成功后获取cookies信息",httpMethod = "POST")
    public String login(HttpServletResponse response,
                        //属性，value为前段调用时显示的名称，requierd为true参数必须传，不写就非必传
                        @RequestParam(value= "userName",required = true) String userName,
                        @RequestParam(value= "password",required = true) String password){

        //业务逻辑，验证用户名和密码是否合法，.equals
        if(userName.equals("zhangsan")&&password.equals("123456")){
            //获取cookie
            cookie = new Cookie("login","true");
            //返回cookie，增加到cookie列表
            response.addCookie(cookie);
            return "登录成功";
        }
        return "用户名或者密码错误！！";
    }


    //验证cookies，验证通过后发返回用户列表信息

    @RequestMapping(value = "/getUserList",method = RequestMethod.POST)
    @ApiOperation(value = "获取用户列表",httpMethod = "POST")
    //加上httpservlet，不然cookie带不进来
    public  String  getUserList(HttpServletRequest request,
                            //传参数
                            @RequestBody User u){

        //获取cookies,数组，用servlet获取到的cookie返回
        Cookie[] cookie = request.getCookies();
        User user;
        //验证cookies是否合法
        for (Cookie c: cookie) {
            //验证cookie
            //==比的是地址，用equals
            if (c.getName().equals("login")
                    && c.getValue().equals("true")
                    &&u.getUserName().equals("zhangsan")
                    &&u.getPassword().equals("123456") ) {
        //从原user中新建对象，如果放在if中，只能在for循环中的判断
                user=new User();
                //新对象的新值
                user.setUserName("lisi");
                user.setAge("18");
                user.setSex("man");


                return user.toString();
            }
        }
        return "参数不合法";

    }



}
