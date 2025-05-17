package com.liulin.system.dao;


import com.liulin.system.entity.MedicalRecord;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MedicalRecordDao {
    MedicalRecord queryById(Integer recordId);
    int insert(MedicalRecord record);
    int update(MedicalRecord record);
    int deleteById(Integer recordId);

}

