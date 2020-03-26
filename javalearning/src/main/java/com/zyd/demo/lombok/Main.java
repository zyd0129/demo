package com.zyd.demo.lombok;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(12);
        student.setName("yudong");
        System.out.println(student.toString());
    }
}
