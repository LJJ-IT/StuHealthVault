package com.liulin.system.service.impl;

import com.liulin.system.entity.HealthRecord;
import com.liulin.system.dao.HealthRecordDao;
import com.liulin.system.service.HealthRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class HealthRecordServiceImpl implements HealthRecordService {

    @Resource
    private HealthRecordDao healthRecordDao;

    @Override
    public HealthRecord queryById(Integer recordId) {
        return healthRecordDao.queryById(recordId);
    }

    @Override
    public HealthRecord insert(HealthRecord record) {
        healthRecordDao.insert(record);
        return queryById(record.getRecordId());
    }

    @Override
    public HealthRecord update(HealthRecord record) {
        healthRecordDao.update(record);
        return queryById(record.getRecordId());
    }

    @Override
    public boolean deleteById(Integer recordId) {
        return healthRecordDao.deleteById(recordId) > 0;
    }
}
