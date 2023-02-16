package com.course.server;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @description:给客户端返回一个cookie信息，get方法
 * @author:yang
 * @time:2023/2/16 13:28
 */
@RestController //标识为要扫描的类
public class MyGetMerhod {
    @RequestMapping(value = "/getCookies",method = RequestMethod.GET)
    public String getCookies(HttpServletResponse response){

        //声明cookie
        Cookie cookie = new Cookie("login","true");
        //响应内容增加cookie
        response.addCookie(cookie);
        //HttpServletRequest 请求信息放这里
        //HttpServletResponse 装响应信息的类
        return "恭喜你获得cookies信息成功";
    }

    /**
     * 要求客户端携带cookies访问
     * 这是一个需要携带cookies信息才能访问的get请求
     */


    @RequestMapping(value = "/get/with/cookies",method = RequestMethod.GET)
    public String getWithCookies(HttpServletRequest request){
        Cookie[] cookies= request.getCookies(); //添加cookies数组

        //判断对象为空
        if(Objects.isNull(cookies)){
            return "该请求必须携带cookies";
        }
        //验证cookies
        for (Cookie cookie : cookies) {
            //如果cookie信息.getname和getvalue，equals内比较的cookie定义的内容，匹配成功返回true
            if(cookie.getName().equals("login")&&cookie.getValue().equals("true")){
                //都符合时进入该逻辑
                return "这是一个需要携带cookies信息才能访问的get请求";
            }
        }

        return "该请求必须携带cookies";

    }

    /**
     * 开发一个需要携带参数餐能访问的get请求。
     * 第一种实现方式 url：key=value&key=value
     * 模拟获取商品列表
     */

    //第一种实现方法
    @RequestMapping(value = "/get/with/param",method = RequestMethod.GET) //访问方式get
    //定义携带参数类型都是数值型，string为字符串
    public Map<String,Integer> getList(@RequestParam Integer start,@RequestParam Integer end){

        //商品列表，map对象
        Map<String,Integer> myList =new HashMap<>();
        //map结合put一些商品
        myList.put("鞋子",400);
        myList.put("干脆面",1);
        myList.put("衬衫",300);

        //返回map集合put内，内容
        return myList;
    }

    /**
     * 第二种需要携带参数访问的get请求
     * url:ip:port/get/with/param/10/20
     */

    //{}路径多个可以增加/{}
    @RequestMapping(value = "/get/with/param/{start}/{end}")
    //另外一种实现PathVariable，路径访问
    public Map myGetList(@PathVariable Integer start,@PathVariable Integer end){

        Map<String,Integer> myGetList =new HashMap<>();
        //map结合put一些商品
        myGetList.put("华为耳机",400);
        myGetList.put("清风纸巾",2);
        myGetList.put("小米电饭煲",459);

        return myGetList;
    }

}
