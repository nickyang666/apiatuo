package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @description: 参数化
 * @author:yang
 * @time:2023/2/9 13:30
 */
public class ParamterTest {

    @Test
    @Parameters({"name", "age"})
    public void paramTest(String name, int age) {

        System.out.println("name :" + name + "age:" + age);

    }
}
