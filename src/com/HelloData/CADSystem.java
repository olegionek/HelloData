package com.HelloData;

class Shape {
    Shape (int i) {System.out.println("Конструктор Shape");}
    void dispose() {System.out.println("Завершение Shape");}
}

class Triangle extends Shape {
    Triangle(int i) {
        super(i);
        System.out.println("Конструктор Triangle");
    }
}

class Line extends Shape {
    private int start, end;
    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Рисуем линию Line: " + start + ", " + end);
    }
    void dispose() {
        System.out.println("Стираем линию Line: " + start + ", " + end);
        super.dispose();
    }
}

public class CADSystem  extends Shape{
    private Triangle t;
    private Line[] lines = new Line[3];
    public CADSystem(int i) {
        super(i + 1);
        for (int j = 0; j < lines.length; j++)
            lines[j] = new Line(j, j + j);
        t = new Triangle(1);
        System.out.println("Комбинированный конструктор");
    }

    void dispose() {
        System.out.println("CADSystem.dispose()");
        //Завершение осуществляется в порядке;
        //Обратном порядке инициализации.

    }
}
