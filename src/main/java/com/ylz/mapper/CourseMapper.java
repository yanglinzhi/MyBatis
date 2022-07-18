package com.ylz.mapper;

import com.ylz.pojo.Course;

import java.util.List;

/**
 * @author ylz
 * @date 2022/7/18 9:30
 */
public interface CourseMapper {
    /*
    * 查询所有
    * */
    List<Course>  selectAll();
    /*
    * 查看详情
    * */
    Course selectById(int id);

}
