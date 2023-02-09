package com.course.testng.groups;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@Slf4j
public class GroupsOnMethod {

    @Test(groups = {"server"})
    public void test1() {
        log.info("这是服务端" + Thread.currentThread().getId());
        System.out.println("这是服务端");
    }

    @Test(groups = {"client"})
    public void test2() {

        System.out.println("这是客户端C端");
    }

    @Test(groups = {"web"})
    public void test3() {

        System.out.println("这是web端");

    }

    @Test(groups = {"web2"})
    public void test4() {
        System.out.println("Web端2");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer() {

        System.out.println("服务端组运行前执行");

    }

    @AfterGroups("server")
    public void afterGroupsOnServer() {

        System.out.println("服务端运行之后运行");

    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient() {

        System.out.println("客户端组运行前执行");

    }

    @AfterGroups("client")
    public void afterGroupsOnClient() {

        System.out.println("客户端运行之后运行");

    }

    @BeforeGroups("web")
    public void beforeGroupsOnWeb() {

        System.out.println("web端组运行前执行");

    }

    @AfterGroups("web")
    public void afterGroupsOnWeb() {

        System.out.println("web端运行之后运行");

    }

    @BeforeGroups("web2")
    public void beforeGroupsOnWeb2() {

        System.out.println("web2端组运行前执行");

    }

    @AfterGroups("web2")
    public void afterGroupsOnWeb2() {

        System.out.println("web2端运行之后运行");

    }

}
