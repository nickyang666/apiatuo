package com.course.model;

import lombok.Data;

/**
 * @description:
 * @author:yang
 * @time:2023/2/22 15:20
 */
@Data
public class LoginCase {

    private int id;
    private String userName;
    private String password;
    private String expected;
}
