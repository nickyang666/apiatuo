package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @description:
 * @author:yang
 * @time:2023/2/9 11:06
 */

@Test(groups = "stu")

public class GroupsOnClass1 {
    public void stu1() {

        System.out.println("1班学生1");

    }

    public void stu2() {

        System.out.println("1班学生2");

    }

}
