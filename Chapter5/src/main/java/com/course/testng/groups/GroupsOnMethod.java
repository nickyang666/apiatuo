package com.course.testng.groups;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class GroupsOnMethod {

    @Test(groups = {"server"})
    public void test1() {
        log.info("这是服务端" + Thread.currentThread().getId());

    }

    @Test(groups = {"client"})
    public void test2() {

        System.out.println("group");
    }


    @Test(groups = {"web"})
    public void test3() {
        System.out.println("WEB组");
    }


}
