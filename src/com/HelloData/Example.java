package com.HelloData;

public class Example {
    int petalCount = 0;
    String s = "Initial value";

    Example(int petals) {
        petalCount = petals;
        System.out.println("Конструктор с параметром int, petalCount = " + petalCount);
    }
    Example(String ss) {
        ss = s;
        System.out.println("Конструктор с параметром String s = " + s);
    }
    Example(String s, int petals) {
        this(petals);
        this.s = s;
        System.out.println("Аргументы String и int");
    }
    Example() {
        this("hi", 47);
        System.out.println("Конструктор по умолчанию (без аргументов)");
    }
    void printPetalCount() {
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args){
        Example x = new Example();
        x.printPetalCount();
    }
}
