package com.zyd.demo.data;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        System.out.println(stringSet.add("zhao"));
        System.out.println(stringSet.add("zhao")); //插入失败 false
    }
}
