package com.course.config;

import org.apache.http.client.CookieStore;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * @description:装一些变量
 * @author:yang
 * @time:2023/2/22 15:31
 */
public class TestConfig {
    public static String loginUrl;
    public static String updateUserInfoUrl;
    public static String getUserListUrl;

    public static String getUserInfoUrl;
    public static String addUserUrl;


    public static DefaultHttpClient defaultHttpClient;
    public static CookieStore store;

}
