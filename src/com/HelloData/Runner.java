package com.HelloData;


import java.io.IOException;

public class Runner extends Cleanser{

    public void scrub() {
        append("Runner.scrub()");
        super.scrub(); // �������� ����� �������� ������.
    }
    //��������� ����� ������ � ������.
    public void foam() {append("foam()");}

    public static void main (String[] args) {
        Runner x = new Runner();
        x.dilute();
        x.foam();
        x.scrub();
        x.apply();
        System.out.println(x);
        System.out.println("��������� ������� �����");
        Cleanser.main(args);
    }
}
