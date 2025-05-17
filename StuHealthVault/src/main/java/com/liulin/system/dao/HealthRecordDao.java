package com.liulin.system.dao;

import com.liulin.system.entity.HealthRecord;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HealthRecordDao {
    HealthRecord queryById(Integer recordId);
    int insert(HealthRecord record);
    int update(HealthRecord record);
    int deleteById(Integer recordId);

}

