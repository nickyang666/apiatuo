package com.course.httpclient.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @description:
 * 原get方法优化，配置文件配置
 * @author:yang
 * @time:2023/2/13 17:01
 */
public class MyCookiesForGet {
    private String url;
    private ResourceBundle bundle;
    //用来存储cookies信息的变量
    private CookieStore store;
    @BeforeTest
    public void beforeTest(){
        bundle = ResourceBundle.getBundle("httpcilent", Locale.CHINA);
        url = bundle.getString("test.url");
    }

    @Test
    public void testGetCookies() throws IOException {

        String result;
//       从配置文件中 拼接测试的url
        String uri = bundle.getString("getCookies.uri");
        String testUrl = this.url+uri;

//        测试逻辑代码书写
        HttpGet get = new HttpGet(testUrl);
        DefaultHttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"gbk");
        System.out.println(result);

        //获取cookies信息
        this.store = client.getCookieStore();
        List<Cookie> cookieList = store.getCookies();

        for (Cookie cookie : cookieList){
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println("cookie name = " + name
                    + "\n"+"cookie value = " + value);
        }

    }
    //依赖上面的方法
    @Test(dependsOnMethods = {"testGetCookies"})

    public void testGetWithCookies() throws IOException{
        //从配置文件取配置
        String uri = bundle.getString("test.get.with.cookies");
        //拼接，测试地址
        String testUrl = this.url+uri;
        //声明客户端、声明一个执行方法
        HttpGet get = new HttpGet(testUrl);
        DefaultHttpClient client = new DefaultHttpClient();
        //        设置cookies信息
        client.setCookieStore(this.store);
        //        接相应
        HttpResponse response = client.execute(get);

        //获取响应的状态码
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println("statusCode = " + statusCode);


        if (statusCode == 200) {
            String result = EntityUtils.toString(response.getEntity(),"gbk");
            System.out.println(result);
        }


    }




}
