package com.github.sejoung.learning.java.lambdas;

public interface B extends A {

    @Override
    void apply();

    public static void main(String[] args) {
        A a = () -> System.out.println("A");
        B b = () -> System.out.println("B");
    }

}

