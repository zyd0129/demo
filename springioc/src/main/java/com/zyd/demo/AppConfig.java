package com.zyd.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({"com.zyd.demo"})
public class AppConfig {
    @Bean
    public Student student(){
        return new Student();
    }

    @Bean // method.invoke()将生成的对象放入单例池中
    public Study study(){
        return new Study();
    }
}
