package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @description: 在@Test注解的属性中invocationCount属性可以设定线程数，threadPoolSize则可以设定线程池的大小。
 * @author:yang
 * @time:2023/2/9 17:28
 */
public class MultiThreadOnAnnotion {


    @Test(invocationCount = 10, threadPoolSize = 3)
    public void test() {
        System.out.println(1);
        System.out.printf("Thread ID:%s%n", Thread.currentThread().getId());
    }
}

