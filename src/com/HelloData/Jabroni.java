package com.HelloData;
import java.util.*;

public class Jabroni {
    public static void main(String[] args) {
        Random  rand = new Random();
        for (int i=0;i<=30;i++)
        {
            int x=rand.nextInt(2)+1;
            if (x<=1){
                System.out.println("Выпало " + x + " Ваш результат: Орел!");
            }
            if (x>=1&&x<=2){
                System.out.println("Выпало " + x + " Ваш результат: Решка!");
            }
            else
            {
                System.out.println("Ошибка! Ошибочное значение: " + x);
            }
        }
    }
}
