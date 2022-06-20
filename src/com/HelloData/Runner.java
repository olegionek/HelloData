package com.HelloData;


import java.io.IOException;

public class Runner extends Cleanser{

    public void scrub() {
        append("Runner.scrub()");
        super.scrub(); // Вызываем метод базоовго класса.
    }
    //Добавляем новые методы к классу.
    public void foam() {append("foam()");}

    public static void main (String[] args) {
        Runner x = new Runner();
        x.dilute();
        x.foam();
        x.scrub();
        x.apply();
        System.out.println(x);
        System.out.println("Проверяем базовый класс");
        Cleanser.main(args);
    }
}
