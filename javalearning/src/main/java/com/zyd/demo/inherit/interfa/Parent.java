package com.zyd.demo.inherit.interfa;

public class Parent  implements Say{
    String name;
    Parent(String name){
        name = "parent";
    }

    @Override
    public String say() {
        return "English";
    }
}
