package com.course.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @description:能够执行sql对象
 * @author:yang
 * @time:2023/2/22 16:00
 */
public class DatabaseUtil {
    public static SqlSession getSqlSession() throws IOException {

        //获取配置的资源文件
        Reader reader = Resources.getResourceAsReader("databaseConfig.xml");

        //文件build出来,使用加载器加载配置文件。
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
        //返回sqlsession，sqlsession就是能够执行配置文件中的sql语句了。
        SqlSession session = factory.openSession();
        return session;
    }
}
