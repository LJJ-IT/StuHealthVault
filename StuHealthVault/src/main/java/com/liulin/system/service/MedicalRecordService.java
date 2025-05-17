package com.liulin.system.service;

import com.liulin.system.entity.MedicalRecord;




public interface MedicalRecordService {
    /**
     * 通过ID查询就诊记录
     */
    MedicalRecord queryById(Integer recordId);

    /**
     * 新增就诊记录
     */
    MedicalRecord insert(MedicalRecord record);

    /**
     * 更新就诊记录
     */
    MedicalRecord update(MedicalRecord record);

    /**
     * 删除就诊记录
     */
    boolean deleteById(Integer recordId);

}
