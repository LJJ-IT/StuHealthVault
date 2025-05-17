package com.liulin.system.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Myconfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/student").setViewName("student");
        registry.addViewController("/medicalRecord").setViewName("medicalRecord");
        registry.addViewController("/healthRecord").setViewName("healthRecord");
        registry.addViewController("/").setViewName("home");
    }
}
