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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
/**  1.散装参数
 @Test public void testSelectByCondition() throws IOException {
 //获取参数
 String c_name = "软件";
 String c_teacher = "孟璐";
 //处理参数
 c_name = "%" + c_name + "%";
 c_teacher = "%" + c_teacher + "%";
 //1.加载Mybatis的核心配置文件，获取SqlSessionFactory;
 String resource = "mybatis-config.xml";
 InputStream inputStream = Resources.getResourceAsStream(resource);
 SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
 //2.获取sqlSession
 SqlSession sqlSession = sqlSessionFactory.openSession();
 //3.获取Mapper接口代理对象
 CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
 //4.执行方法
 List<Course> courses = courseMapper.selectByCondition(c_name,c_teacher);
 System.out.println(courses);
 //5.释放资源
 sqlSession.close();
 }
 */
    /**
     * 2.对象参数
     *
     * @Test public void testSelectByCondition() throws IOException {
     * //获取参数
     * String c_name = "软件";
     * String c_teacher = "孟";
     * //处理参数
     * c_name = "%" + c_name + "%";
     * c_teacher = "%" + c_teacher + "%";
     * <p>
     * //封装对象
     * Course course = new Course();
     * course.setC_name(c_name);
     * course.setC_teacher(c_teacher);
     * //1.加载Mybatis的核心配置文件，获取SqlSessionFactory;
     * String resource = "mybatis-config.xml";
     * InputStream inputStream = Resources.getResourceAsStream(resource);
     * SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
     * //2.获取sqlSession
     * SqlSession sqlSession = sqlSessionFactory.openSession();
     * //3.获取Mapper接口代理对象
     * CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
     * //4.执行方法
     * List<Course> courses = courseMapper.selectByCondition(course);
     * System.out.println(courses);
     * //5.释放资源
     * sqlSession.close();
     * }
     */
    @Test
    public void testSelectByCondition() throws IOException {
        //获取参数
        String c_name = "软件";
        String c_teacher = "孟";
        //处理参数
        c_name = "%" + c_name + "%";
        c_teacher = "%" + c_teacher + "%";

        //Map映射
        Map map = new HashMap();
        map.put("c_name", c_name);
        map.put("c_teacher", c_teacher);

        //1.加载Mybatis的核心配置文件，获取SqlSessionFactory;
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3.获取Mapper接口代理对象
        CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
        //4.执行方法
        List<Course> courses = courseMapper.selectByCondition(map);
        System.out.println(courses);
        //5.释放资源
        sqlSession.close();
    }
    @Test
    public void testAdd() throws IOException {
        //获取参数
        int c_id = 97001;
        String c_name = "软件";
        String c_teacher = "孟";

        //Map映射
        Map map = new HashMap();
        map.put("c_id",c_id);
        map.put("c_name", c_name);
        map.put("c_teacher", c_teacher);

        //1.加载Mybatis的核心配置文件，获取SqlSessionFactory;
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //3.获取Mapper接口代理对象
        CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
        //4.执行方法
        courseMapper.add(map);
        //提交事务
        //sqlSession.commit();
        //5.释放资源
        sqlSession.close();
    }
    @Test
    public void testAdd2() throws IOException {
        //获取参数
        String c_name = "软件";
        String c_teacher = "孟";

        //Map映射
        Course course = new Course();
        course.setC_name(c_name);
        course.setC_teacher(c_teacher);

        //1.加载Mybatis的核心配置文件，获取SqlSessionFactory;
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //3.获取Mapper接口代理对象
        CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
        //4.执行方法
        courseMapper.add(course);
        //提交事务
        //sqlSession.commit();
        Integer c_id = course.getC_id();
        System.out.println(c_id);
        //5.释放资源
        sqlSession.close();
    }
    @Test
    public void testUpdate() throws IOException {
        //获取参数
        Integer c_id = 97003;
        String c_name = "软件";
        String c_teacher = "孟";

        //Map映射
        Course course = new Course();
        course.setC_id(c_id);
        course.setC_name(c_name);
        //course.setC_teacher(c_teacher);

        //1.加载Mybatis的核心配置文件，获取SqlSessionFactory;
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //3.获取Mapper接口代理对象
        CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
        //4.执行方法
        int count = courseMapper.update(course);
        System.out.println(count);
        //提交事务
        //sqlSession.commit();
        //5.释放资源
        sqlSession.close();
    }
    @Test
    public void testDeleteById() throws IOException {
        //获取参数
        Integer c_id = 97003;
        //1.加载Mybatis的核心配置文件，获取SqlSessionFactory;
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //3.获取Mapper接口代理对象
        CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
        //4.执行方法
        courseMapper.deleteById(c_id);
        //提交事务
        //sqlSession.commit();
        //5.释放资源
        sqlSession.close();
    }
    @Test
    public void testDeleteByIds() throws IOException {
        //获取参数
        int[] c_id = {11,10,9};

        //1.加载Mybatis的核心配置文件，获取SqlSessionFactory;
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //3.获取Mapper接口代理对象
        CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
        //4.执行方法
        courseMapper.deleteByIds(c_id);
        //提交事务
        //sqlSession.commit();
        //5.释放资源
        sqlSession.close();
    }
}
