package com.liulin.system.dao;

import com.liulin.system.entity.Student;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface StudentDao {
    /**
     * 通过ID查询单条数据
     *
     * @param name
     * @return 实例对象
     */
    Student queryById(String name);

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 影响行数
     */
    int insert(Student student);

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 影响行数
     */
    int update(Student student);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);


}

