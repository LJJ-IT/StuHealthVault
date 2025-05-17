package com.liulin.system.entity;

import lombok.Data;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * 医疗记录实体类
 * 对应数据库表：medical_record
 */
@Data
public class MedicalRecord implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 就诊记录ID（主键）
     */
    private Integer recordId;

    /**
     * 关联学生ID
     */
    private Integer studentId;

    /**
     * 接诊医生姓名
     */
    private String doctorName;

    /**
     * 就诊时间
     */
    private LocalDateTime visitTime;

    /**
     * 诊断结果
     */
    private String diagnosis;

    /**
     * 处方内容（新增字段）
     */
    private String prescription;
}