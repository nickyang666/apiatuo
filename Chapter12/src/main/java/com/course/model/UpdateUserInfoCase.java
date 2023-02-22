package com.course.model;

import lombok.Data;

/**
 * @description:
 * @author:yang
 * @time:2023/2/22 15:21
 */
@Data
public class UpdateUserInfoCase {

    private int id;
    private int userId;
    private String userName;
    private String sex;
    private String age;
    private String permission;
    private String isDelete;
    private String expected;
}
