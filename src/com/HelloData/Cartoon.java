package com.HelloData;

class Art {
    Art(int i) {System.out.println("Конструктор Art");}
}

class Drawing extends Art {

    Drawing(int i) {super(i);
        System.out.println("Конструктор Drawing c переменной");
    }
}

public class Cartoon extends Art {
    Cartoon (int i) {
        super(22);

    }
    public void vava() {System.out.println("vava");}
    public static void main(String[] args) {
        System.out.println("Cartoon");
        Drawing drw = new Drawing(11);
        System.out.println(drw);

    }
}
