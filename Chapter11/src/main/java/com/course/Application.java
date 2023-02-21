package com.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PreDestroy;

/**
 * @description:入口程序，可以通用
 * @author:yang
 * @time:2023/2/21 11:52
 */
@EnableScheduling
//禁用MongoDB
@SpringBootApplication(exclude = MongoAutoConfiguration.class)

public class Application {
    //
    private  static ConfigurableApplicationContext context;

    public static void main(String[] args) {

        Application.context = SpringApplication.run(Application.class,args);
    }
    //摧毁方法
    @PreDestroy
    public void close(){
        Application.context.close();
    }
}
