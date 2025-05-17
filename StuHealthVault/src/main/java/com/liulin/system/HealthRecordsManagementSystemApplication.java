package com.liulin.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.liulin.system.dao")
public class HealthRecordsManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(HealthRecordsManagementSystemApplication.class, args);
    }

}
