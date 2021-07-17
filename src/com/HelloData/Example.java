package com.HelloData;

public class Example {
    public static void main(String[] args){
        Human human1 = new Human();
        human1.setName("Ева", 19);

    }
}
class Human {
    String name;
    int age;
    public void setName(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Имя: " + name + "\nВозраст: "+ age);
    }
}