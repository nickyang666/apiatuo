package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @description:
 * @author:yang
 * @time:2023/2/10 9:05
 */
public class MultiThreadOnXml {

    @Test
    public void test1() {
        System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test2() {
        System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test3() {
        System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());
    }


}
