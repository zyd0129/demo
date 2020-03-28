package com.zyd.demo.bf;

import com.zyd.demo.Fox;
import com.zyd.demo.Student;
import com.zyd.demo.Study;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

public class Main {
    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        AbstractBeanDefinition definition1 = new RootBeanDefinition(Fox.class);
        // 注入 definition map中
        beanFactory.registerBeanDefinition("fox",definition1);
        //构造器贪婪模式
        definition1.setAutowireMode(3);
        /**
         * setter方法，1.byName, 2.byType
         */

//        definition1.setAutowireMode(2);
//        definition1.setAutowireMode(1);





        AbstractBeanDefinition definition = new RootBeanDefinition(Student.class);
        definition.getPropertyValues().add("name", "yudong");
        definition.getPropertyValues().add("age",12);

        beanFactory.registerBeanDefinition("student",definition);
        Student student = beanFactory.getBean("student",Student.class);
//        System.out.println(student);

        Fox fox = beanFactory.getBean("fox",Fox.class);

        //直接注入一个实例化对象，放在singleton 对象池中
        beanFactory.registerSingleton("study",new Study());


        /*
        FactoryBean也是一种Bean,不过getBean()内部会调用 getObject方法 返回一个实例
         */


    }
}
