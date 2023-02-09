package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @description:
 * @author:yang
 * @time:2023/2/9 11:07
 */
@Test(groups = "stu")
public class GroupsOnClass2 {

    public void stu3() {

        System.out.println("2班学生3");

    }

    public void stu4() {

        System.out.println("2班学生4");

    }
}
