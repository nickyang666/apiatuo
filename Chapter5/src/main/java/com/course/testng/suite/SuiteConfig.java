package com.course.testng.suite;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

@Slf4j
public class SuiteConfig {

    @BeforeSuite
    public  void beforeSuit(){

        System.out.println("before suit 运行啦！！");
        log.info("beforesuite套件");

    }

    @AfterSuite

    public void afterSuite(){

        System.out.println("after suite 运行啦！！");
        log.info("aftersuite套件");

    }


    @BeforeTest
    public void beforeTest() {

        System.out.println("运行之前");
        log.info("运行之前打印！！====");

    }


    @AfterTest
    public void afterTest(){

        System.out.println("test执行结束之后运行");
        log.info("用例执行结束之后");

    }
}
