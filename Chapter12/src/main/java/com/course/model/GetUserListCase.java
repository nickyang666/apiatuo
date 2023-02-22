package com.course.model;

import lombok.Data;

/**
 * @description:
 * @author:yang
 * @time:2023/2/22 15:10
 */
@Data
public class GetUserListCase {

    private String userName;
    private String age;
    private String sex;
    private String expected;

}
