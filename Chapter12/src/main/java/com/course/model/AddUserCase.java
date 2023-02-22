package com.course.model;

import lombok.Data;

/**
 * @description:对应数据库字段
 * @author:yang
 * @time:2023/2/22 15:07
 */
@Data
public class AddUserCase {

    private  String userName;
    private String password;
    private String sex;
    private String age;
    private String permission;
    private String isDelete;
    private String expected;

}
