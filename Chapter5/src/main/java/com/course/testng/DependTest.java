package com.course.testng;

import org.testng.annotations.Test;

/**
 * @description: 依赖测试 方法2依赖方法1
 * 被依赖的方法执行失败，方法忽略，不执行
 * @author:yang
 * @time:2023/2/9 11:55
 */
public class DependTest {


    @Test
    public void test1() {
        System.out.println("方法1");
        throw new RuntimeException();


    }


    @Test(dependsOnMethods = {"test1"})
    public void test2() {
        System.out.println("方法2");

    }
}
