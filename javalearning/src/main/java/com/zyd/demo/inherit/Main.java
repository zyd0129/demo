package com.zyd.demo.inherit;

/**
 * 构造器问题
 */
public class Main {
    public static void main(String[] args) {
        /*
        1，JVM会读取指定的路径下的Children.class文件，并加载进内存，并会先加载Parent的父类(如果有直接的父类的情况下).
        2，在堆内存中开辟空间，分配地址。
        3，并在对象空间中，对对象中的属性进行默认初始化。
        4，调用对应的构造函数进行初始化。
        5，在构造函数中，第一行会先调用父类中构造函数进行初始化。
        6，父类初始化完毕后，再对子类的属性进行显示初始化。
        7，进行子类构造函数的特定初始化。
        8，初始化完毕后，将地址值赋值给引用变量Person p.
        ————————————————
        版权声明：本文为CSDN博主「火炎焱燚-悟空」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
        原文链接：https://blog.csdn.net/qq_40053347/article/details/87930874
         */
        Children children = new Children();
    }
}
