package com.zyd.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class AppConfig {
    @Bean
    public Student student(){
        return new Student("zyd", 25);
    }
}
