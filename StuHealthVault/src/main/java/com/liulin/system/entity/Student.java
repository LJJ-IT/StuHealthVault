package com.liulin.system.entity;

import lombok.Data;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 学生信息实体类
 * 对应数据库表：student
 */
@Data
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 学生ID（主键）
     */
    private Integer id;

    /**
     * 学生姓名
     */
    private String name;

    /**
     * 性别（枚举：男/女）
     */
    private String gender;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 所属院系
     */
    private String department;

    /**
     * 班级名称
     */
    private String className;

    /**
     * 手机号码（11位）
     */
    private String phone;

    /**
     * 记录创建时间
     */
    private LocalDateTime createTime;
}
