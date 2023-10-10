package com.lazyinitconfig;

public class A {
    private String name;
    

    public A() {
        System.out.println("A objects created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "A [name=" + name + "]";
    }

  
    
}
