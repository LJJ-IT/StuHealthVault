package com.liulin.system.service.impl;

import com.liulin.system.entity.Student;
import com.liulin.system.dao.StudentDao;
import com.liulin.system.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param name
     * @return 实例对象
     */
    @Override
    public Student queryById(String name) {
        return studentDao.queryById(name);
    }

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student insert(Student student) {
        studentDao.insert(student);
        return student;
    }

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student update(Student student) {
        studentDao.update(student);
        return queryById(student.getName());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return studentDao.deleteById(id) > 0;
    }
}
