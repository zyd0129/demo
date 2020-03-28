package com.zyd.demo.clazz;

/**
 * 例子用来解释 class<?>的用途，通配符的概念，和不写是一回事 Demo Demo<?>
 */
public class Main {
    public static void take(Demo demo){
        demo.print();
    }
    public static void main(String[] args) {
        Demo<Dog> dogDemo = new Demo<>();
        dogDemo.setAnimal(new Dog());

        Demo<Cat> catDemo = new Demo<>();
        catDemo.setAnimal(new Cat());

        take(dogDemo);
        take(catDemo);
    }
}

class Demo<T>{
    private T animal;

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void print(){
        System.out.println("T的类型是："+animal.getClass().getName());
    }
}
