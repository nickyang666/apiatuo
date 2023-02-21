package com.course.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @description:swagger配置文件
 * 加载配置文件使用@Configuration  @EnableSwagger2加载配置文件
 * 有个标准写法
 * 访问http://localhost:8888/swagger-ui.html
 * @author:yang
 * @time:2023/2/16 15:29
 */


@Configuration
@EnableSwagger2
public class SwaggerConfig {

    //swagger配置文档，最后增加build结尾
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .pathMapping("/")
                .select()
                .paths(PathSelectors.regex("/.*"))
                .build();
    }

    //apiInfo方法中
    private ApiInfo apiInfo() {

    return new ApiInfoBuilder()
            .title("我的接口") //标题
            .contact(new Contact("yang","", "339633531@qq.com")) //作者信息
            .description("这是swagger生成的接口文档") //备注说明
            .version("1.0.0.0") //版本号
            .build(); //build结尾

    }

}
