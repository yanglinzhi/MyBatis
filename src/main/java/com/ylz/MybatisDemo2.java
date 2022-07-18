package com.ylz;

import com.ylz.mapper.UserMapper;
import com.ylz.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author ylz
 * @date 2022/7/17 17:18
 */
//代理开发
public class MybatisDemo2 {
    public static void main(String[] args) throws IOException {
        //1.加载Mybatis的核心配置文件，获取SqlSessionFactory;
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.获取对应SqlSession对象，用它来执行sql
        SqlSession sqlsession = sqlSessionFactory.openSession();
        //3.执行sql
        //List<User> users = sqlsession.selectList("test.selectAll");
        //3.1获取UserMApper接口的代理对象
        UserMapper userMapper = sqlsession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectAll();
        System.out.println(users);
        //4.释放资源；
        sqlsession.close();
    }
}
