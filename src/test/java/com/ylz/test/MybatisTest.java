package com.ylz.test;

import com.ylz.mapper.CourseMapper;
import com.ylz.pojo.Course;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author ylz
 * @date 2022/7/18 9:21
 */
public class MybatisTest {
    @Test
    public void testSelectAll() throws IOException {
        //1.加载Mybatis的核心配置文件，获取SqlSessionFactory;
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3.获取Mapper接口代理对象
        CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
        //4.执行方法
        List<Course> courses = courseMapper.selectAll();
        System.out.println(courses);
        //5.释放资源
        sqlSession.close();
    }
    @Test
    public void testSelectById() throws IOException {
        //获取参数
        int id = 1;
        //1.加载Mybatis的核心配置文件，获取SqlSessionFactory;
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3.获取Mapper接口代理对象
        CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
        //4.执行方法
        Course course = courseMapper.selectById(id);
        System.out.println(course);
        //5.释放资源
        sqlSession.close();
    }
}
