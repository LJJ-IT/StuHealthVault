package com.liulin.system.controller;

import com.liulin.system.entity.HealthRecord;
import com.liulin.system.service.HealthRecordService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.time.LocalDate;

@RestController
@RequestMapping("/healthRecord")
@CrossOrigin
public class HealthRecordController {

    @Resource
    private HealthRecordService healthRecordService;

    @GetMapping("/{recordId}")
    public HealthRecord getById(@PathVariable Integer recordId) {
        return healthRecordService.queryById(recordId);
    }

    @DeleteMapping("/{recordId}")
    public Boolean delete(@PathVariable Integer recordId) {
        return healthRecordService.deleteById(recordId);
    }

    @PostMapping("/add")
    public HealthRecord create(@RequestBody HealthRecord record) {
        record.setMeasureDate(LocalDate.now());
        return healthRecordService.insert(record);
    }

    @PutMapping("/update")
    public HealthRecord update(@RequestBody HealthRecord record) {
        return healthRecordService.update(record);
    }
}