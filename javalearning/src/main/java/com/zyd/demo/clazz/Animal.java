package com.zyd.demo.clazz;

interface  Speak{
    public String speak();
}
abstract public class Animal implements Speak {
}


class Dog extends Animal{

    @Override
    public String speak() {
        return "汪汪";
    }
}

class Cat extends Animal{

    @Override
    public String speak() {
        return "喵喵";
    }
}
