package com.HelloData;
import java.util.*;


class Tree {
    int height;
    Tree() {
        System.out.print("Сажаем росток: ");
        height = 0;
    }
    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Создание нового дерева высотой: " + height);
    }
    void info() {
        System.out.println("Дерево высотой " + height + " м.");
    }
    // Перегруженный метод
    void info(String s) {
        System.out.println(s + ": Дерево высотой " + height + " м.");
    }
}

public class AutoPackager {
    public static void autoPackager() {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("Перегруженный метод: ");
        }


    }
}
