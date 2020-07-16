package com.example.helloworld;

 class Person {
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    void write(){
        System.out.println(String.format("name : %s , age : %d",name,age));
    }

    private String name;
    private int age;
}
