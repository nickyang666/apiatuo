package com.course.testng;

import org.testng.annotations.Test;

/**
 * @description: 异常测试TESTNG
 * 什么时候会用到异常测试？
 * 在我们期望结果为某一个异常的时候
 * 比如：我们传入了默写不合法参数，程序抛出了异常
 * 也就说我的预期借结果就是这个
 * @author:yang
 * @time:2023/2/9 11:42
 */
public class Expecttion {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed() {

        System.out.println("这是一个失败的异常测试");

    }

    //这是一个成功的

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess() {

        System.out.println("这是我的异常测试");
        throw new RuntimeException();

    }
}
