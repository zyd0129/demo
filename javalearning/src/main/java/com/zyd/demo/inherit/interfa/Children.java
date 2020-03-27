package com.zyd.demo.inherit.interfa;

public class Children extends Parent implements Study{
    String name;
    Children(){
        super("name");
        name = "children";
    }

    @Override
    public String study() {
        return "Chinese";
    }

    @Override
    public String say() {
        return "Franch";
    }
}
