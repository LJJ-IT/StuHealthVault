package com.liulin.system.service;

import com.liulin.system.entity.Student;


public interface StudentService {

    /**
     * 通过ID查询单条数据
     *
     * @param  name
     * @return 实例对象
     */
    Student queryById(String name);


    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    Student insert(Student student);

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    Student update(Student student);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
