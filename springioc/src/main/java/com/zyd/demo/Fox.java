package com.zyd.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * FOX Hen 构造器循环依赖 报错
 */
@Component
public class Fox{
    private String name;
    private Integer age;

    //@Au
    private Hen hen;
    public Fox(){
        System.out.println("Fox 无参构造器");
    }

    //构造器注入
    @Autowired
    public Fox(Hen hen){
        System.out.println("Fox 有参构造器");
    }

    public void setStudent(Hen hen) {
        System.out.println("Fox setter");
        System.out.println(hen);
        this.hen = hen;
    }
}
