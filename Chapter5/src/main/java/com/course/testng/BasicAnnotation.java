package com.course.testng;


import org.testng.annotations.*;

/**
 * 类注解
 */
public class BasicAnnotation {
    /**
     * 最基本注释标记,用来把方法标记为测试的一部分
     */
    @Test
    public void testcase1() {

        System.out.println("这是测试用例1");
    }

    /**
     * 方法注解
     */
    @Test
    public void testcase2() {

        System.out.println("测试用例2");
    }

//    @BeforeTest  执行

    /**
     * 每一个test执行之前都要执行
     */
    @BeforeMethod
    public void beforeMethod(){

        System.out.println("测试方法执行前运行");

    }


//    @AfterTest

    /**
     * 每一个test执行之后执行
     */
    @AfterMethod
    public void afterMethod() {
        System.out.println("测试用例执行之后");
    }

    @BeforeClass
    public  void beforeClas(){

        System.out.println("这是在类运行之前运行的方法");
    }


    @AfterClass
    public void afterClas() {

        System.out.println("这是类运行之后运行的方法");

    }


    @BeforeSuite

    public void beforeSuite() {

        System.out.println("BeforeSuite测试套件");

    }

    @AfterSuite
    public void afterSuite() {

        System.out.println("AfterSuit测试套件，类之前");

    }

}
