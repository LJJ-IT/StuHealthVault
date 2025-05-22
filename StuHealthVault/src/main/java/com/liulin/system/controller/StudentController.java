package com.liulin.system.controller;

import com.liulin.system.entity.Student;
import com.liulin.system.service.StudentService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Resource
    private StudentService studentService;

    @GetMapping("/{name}")
    public Student getById(@PathVariable String name) {
        return studentService.queryById(name);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id) {
        return studentService.deleteById(id);
    }

    @PostMapping("/add")
    public Student create(@RequestBody Student student) {
        student.setCreateTime(LocalDateTime.now());
        return studentService.insert(student);
    }

    @PutMapping("/update")
    public Student update(@RequestBody Student student) {
        return studentService.update(student);
    }
}