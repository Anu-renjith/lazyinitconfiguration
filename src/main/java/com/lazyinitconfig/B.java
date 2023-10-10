package com.lazyinitconfig;

public class B {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public B() {
        System.out.println("B objects created");
    }
    
}
