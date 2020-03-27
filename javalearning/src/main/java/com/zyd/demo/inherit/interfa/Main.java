package com.zyd.demo.inherit.interfa;

/**
 * 构造器问题
 */
public class Main {
    public static void main(String[] args) {
        Children student = new Children();
        Study study = student;
        Say say = student;
        System.out.println(study.study());
        System.out.println(say.say());
        /*
        子类和父类实现同一个接口的意义:仅仅是代码可读性，只知道子类实现了某个接口，而不关心父类。实际没啥必要
         */
    }
}
