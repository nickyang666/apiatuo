package com.course.model;

import lombok.Data;

/**
 * @description:
 * @author:yang
 * @time:2023/2/22 15:09
 */
@Data
public class GetUserInfoCase {

    private int userId;
    private String expected;
}
