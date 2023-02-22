package com.course.utils;

import com.course.model.InterfaceName;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @description:工具类可以命名为静态方法
 * 工具类所达到的效果是：在使用的时候，configfile.getUrl传递model枚举类任意一个，就可以获取到配置文件的地址
 * @author:yang
 * @time:2023/2/22 15:42
 */
public class ConfigFile {

    //声明一个变量，加载配置文件

    private  static ResourceBundle bundle = ResourceBundle.getBundle("application", Locale.CHINA);

    //声明参数传递使用model类中定义的枚举
    public  static String  getUrl(InterfaceName name){
        String address = bundle.getString("test。url");
        String uri="";
        //最终的测试地址
        String testUrl;

        //和配置文件进行比较
        if(name == InterfaceName.GETUSERLIST){
            uri = bundle.getString("getUserList.uri");
        }

        if (name == InterfaceName.LOGIN) {
            uri = bundle.getString("login.uri");

        }
        if (name == InterfaceName.UPDATEUSRINFO) {
            uri = bundle.getString("updateUserInfo.uri");
        }

        if (name == InterfaceName.GETUSERINFO) {
            uri = bundle.getString("getUserInfo.uri");
        }
        if (name == InterfaceName.ADDUSERINFO) {
            uri = bundle.getString("addUser.uri");
        }

        testUrl=address + uri;
        return testUrl;
    }


}
