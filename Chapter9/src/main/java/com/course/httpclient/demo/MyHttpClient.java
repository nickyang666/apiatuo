package com.course.httpclient.demo;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @description:
 * @author:yang
 * @time:2023/2/13 16:17
 */
@Slf4j
public class MyHttpClient {
    @Test

    public void test1()throws IOException{
        //存放结果
        String result;
        //创建get方法
        HttpGet get = new HttpGet("http://www.baidu.com");
        //client执行get方法
        HttpClient client = new DefaultHttpClient();
        //返回对象是response
        HttpResponse response=client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");

        System.out.println(result);
//        log.info("=============日志=============="+result);
    }

}
