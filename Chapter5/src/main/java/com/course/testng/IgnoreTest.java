package com.course.testng;

import org.testng.annotations.Test;

/**
 * @description:
 * @author:yang
 * @time:2023/2/10 9:01
 */
public class IgnoreTest {
    @Test
    public void ignore1() {
        System.out.println("ignore1 执行！");
    }

    @Test(enabled = false)
    public void ignore2() {
        System.out.println("ignore2 执行");
    }

    @Test(enabled = true)
    public void ignore3() {
        System.out.println("ignore3 执行");
    }
}
