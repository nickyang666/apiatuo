package com.course.controller;


import lombok.extern.slf4j.Slf4j;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author:yang
 * @time:2023/2/21 11:51
 */
//controller用restcontroller注解
@Slf4j
@RestController
//api是swagger的方法，和requestmapping对应,说明Mapping中url
@Api(value = "v1",description = "这是我的第一个版本的demo")
@RequestMapping("v1")
public class Demo {

//首先获取一个执行sql语句的对象

    //启动及加载，并赋值
    @Autowired
    private SqlSessionTemplate template;
    @RequestMapping(value = "/getUserCount",method = RequestMethod.GET)
    @ApiOperation(value = "可以获取用户数",httpMethod = "GET")
    public int getUserCount() {
        //执行sql,执行mysql.xml中对应标签select或者insert

       return template.selectOne("getUserCount");

    }
}
