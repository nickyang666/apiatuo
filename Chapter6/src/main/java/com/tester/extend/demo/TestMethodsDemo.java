package com.tester.extend.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @description:
 * @author:yang
 * @time:2023/2/10 14:13
 */
public class TestMethodsDemo {

    @Test
    public void test1(){

        Assert.assertEquals(1,1);

    }

    @Test
    public void test2() {
        Assert.assertEquals(1,1);
    }

    @Test
    public void logDemo(){
        Reporter.log("这是日志");
        throw new RuntimeException("这是日志异常");
    }

    @Test
    public void test3() {
        Assert.assertEquals("aaaa","bbb");
    }
}
