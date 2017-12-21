package com.github.sejoung.learning.java.lambdas;


import java.util.function.Function;

public class Example {
    private String firstName = "Sejoung";

    public void example() {
        Function<String, String> addSurname = (surname) -> {
            return firstName + " " + surname;
        };
    }

    public void anotherExample() {
        Function<String, String> addSurname = new Function<String, String>() {
            @Override
            public String apply(String surname) {
                return Example.this.firstName + " " + surname;
            }
        };
    }

    public void anotherExample2() {
        Function<String, String> addSurname = new Function<String, String>() {
            @Override
            public String apply(String surname) {
                return null;
                //return this.firstName + " " + surname; //컴파일 에러
            }
        };
    }

    public void shadowingExample(String firstName) {
        Function<String, String> addSurname = (surname) -> {
            //this를 쓰지 않으면 매개변수
            return firstName + " " + surname;
        };
    }

    public void anotherShadowingExample(String firstName) {
        Function<String, String> addSurname = new Function<String, String>() {
            @Override
            public String apply(String surname) {
                //this를 쓰지 않으면 매개변수
                return firstName + " " + surname;
            }
        };
    }

    public static void main(String[] args) {
    }
}
