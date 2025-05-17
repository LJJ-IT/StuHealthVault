package com.liulin.system.service.impl;

import com.liulin.system.entity.MedicalRecord;
import com.liulin.system.dao.MedicalRecordDao;
import com.liulin.system.service.MedicalRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("medicalchartService")
public class MedicalRecordServiceImpl implements MedicalRecordService {

    @Resource
    private MedicalRecordDao medicalRecordDao;

    @Override
    public MedicalRecord queryById(Integer recordId) {
        return medicalRecordDao.queryById(recordId);
    }

    @Override
    public MedicalRecord insert(MedicalRecord record) {
        medicalRecordDao.insert(record);
        return queryById(record.getRecordId());
    }

    @Override
    public MedicalRecord update(MedicalRecord record) {
        medicalRecordDao.update(record);
        return queryById(record.getRecordId());
    }

    @Override
    public boolean deleteById(Integer recordId) {
        return medicalRecordDao.deleteById(recordId) > 0;
    }
}
