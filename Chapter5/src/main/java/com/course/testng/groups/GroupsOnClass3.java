package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @description:
 * @author:yang
 * @time:2023/2/9 11:07
 */
@Test(groups = "teacher")
public class GroupsOnClass3 {

    public void ter1() {

        System.out.println("数学老师");

    }

    public void ter2() {
        System.out.println("英语老师");
    }
}
