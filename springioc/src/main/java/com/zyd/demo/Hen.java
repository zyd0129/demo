package com.zyd.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hen {
    private String name;
    private Integer age;

    //@Au
    private Fox fox;
    public Hen(){
        System.out.println("Hen 无参构造器");
    }

    //构造器注入
    @Autowired
    public Hen(Fox fox){
        System.out.println("Hen 有参构造器");
        this.fox=fox;

    }

    public void setFox(Fox fox) {
        System.out.println("Hen setter");
        System.out.println(fox);
        this.fox = fox;
    }
}
