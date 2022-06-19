package com.HelloData;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.*;
import java.util.*;
public class Fibbonachi {

	static public void fibbonachi() throws IOException {
		int count;
		Scanner scn = new Scanner(System.in);
		System.out.print("Введите количество чисел Фиббоначи: ");
		count = scn.nextInt();
		Fibbonachi.fibbonachi2(count);
		System.out.println();
	}
	private Fibbonachi() {} // Эксперименты с доступом. Нижняя функция private
	//Т.к. Эта функция не используется вне этого класса, следует сделать ей private.
		static private Fibbonachi fibbonachi2(int count) {
		 int n1 = 0, n2 = 1, n3, i; // Инициализация первых двух цифр последовательности
		 System.out.println(n1 + " " + n2);
		 for (i = 2; i < count; i++) {
			 n3 = n1 + n2;
			 System.out.println(" " + n3);
			 n1 = n2;
			 n2 = n3;
		 }
		 return new Fibbonachi();
	 }
}