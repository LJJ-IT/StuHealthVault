package com.liulin.system.entity;

import lombok.Data;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 健康档案实体类
 * 对应数据库表：health_record
 */
@Data
public class HealthRecord implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 体检记录ID（主键）
     */
    private Integer recordId;

    /**
     * 关联学生ID（外键）
     */
    private Integer studentId;

    /**
     * 身高（厘米）
     */
    private Integer height;

    /**
     * 体重（千克）
     */
    private Integer weight;

    /**
     * 胸围（厘米）
     */
    private Integer chest;

    /**
     * 测量日期（新增字段）
     */
    private LocalDate measureDate;
}