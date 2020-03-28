package com.zyd.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Study {
    @Autowired
    Student student;
    public void studyEnglish(){
        System.out.println(String.format("%s am studying english",student.getName()));
    }
    public void studyJava(){
        System.out.println("i am studying java");
    }
}
