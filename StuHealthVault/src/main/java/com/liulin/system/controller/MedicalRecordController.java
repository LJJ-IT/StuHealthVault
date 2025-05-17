package com.liulin.system.controller;

import com.liulin.system.entity.MedicalRecord;
import com.liulin.system.service.MedicalRecordService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/medicalRecord")
@CrossOrigin
@Controller
public class MedicalRecordController {

    @Resource
    private MedicalRecordService medicalRecordService;

    @GetMapping("/{recordId}")
    public MedicalRecord getById(@PathVariable Integer recordId) {
        return medicalRecordService.queryById(recordId);
    }

    @DeleteMapping("/{recordId}")
    public Boolean delete(@PathVariable Integer recordId) {
        return medicalRecordService.deleteById(recordId);
    }

    @PostMapping("/add")
    public MedicalRecord create(@RequestBody MedicalRecord record) {
        record.setVisitTime(LocalDateTime.now());
        return medicalRecordService.insert(record);
    }

    @PutMapping("/update")
    public MedicalRecord update(@RequestBody MedicalRecord record) {
        return medicalRecordService.update(record);
    }
}