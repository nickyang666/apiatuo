package com.course.testng;

import org.testng.annotations.Test;

/**
 * @description:
 * @author:yang
 * @time:2023/2/10 9:02
 */
public class TimeOutTest {
    //注释
    @Test(timeOut = 3000)//单位为毫秒值
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }

    //超时测试
    @Test(timeOut = 2000)
    public void testFailed() throws InterruptedException {
        Thread.sleep(3000);
    }

}
