package com.zyd.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@Configuration
//@Import()
public class AppConfig {
    @Bean
    public Student student(){
        return new Student("zyd", 25);
    }
}
