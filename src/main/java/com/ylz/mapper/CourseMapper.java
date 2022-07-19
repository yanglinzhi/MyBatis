package com.ylz.mapper;

import com.ylz.pojo.Course;

import java.util.List;
import java.util.Map;

/**
 * @author ylz
 * @date 2022/7/18 9:30
 */
public interface CourseMapper {
    /*
     * 查询所有
     * */
    List<Course> selectAll();

    /*
     * 查看详情
     * */
    Course selectById(int id);

    /*
     * 条件查询
     *  *参数接收
     *       1.散装参数
     *       2.对象参数
     *       3.Map集合参数
     * */
//  1.  List<Course> selectByCondition(@Param("c_name") String c_name, @Param("c_teacher") String c_teacher);
//  2.  List<Course> selectByCondition(Course course);
    List<Course> selectByCondition(Map map);
    /**
     * 添加
     * */
    void add(Map map);
    void add(Course course);
    int update(Map map);
    int update(Course course);
    /**
     * 删除
     * */
    void deleteById(int c_id);
    /**
     * 批量删除
     * **/
    void deleteByIds(int[] c_ids);
}
