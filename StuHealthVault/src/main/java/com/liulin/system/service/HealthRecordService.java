package com.liulin.system.service;

import com.liulin.system.entity.HealthRecord;


public interface HealthRecordService {
    /**
     * 通过ID查询健康记录
     */
    HealthRecord queryById(Integer recordId);

    /**
     * 新增健康记录
     */
    HealthRecord insert(HealthRecord record);

    /**
     * 更新健康记录
     */
    HealthRecord update(HealthRecord record);

    /**
     * 删除健康记录
     */
    boolean deleteById(Integer recordId);

}
