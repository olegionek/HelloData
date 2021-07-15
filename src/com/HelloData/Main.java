package com.HelloData;
import java.lang.*;
import java.util.*;

public class Main {


	public static void main(String[] args) {
		int count;
		Scanner scn = new Scanner(System.in);
		System.out.print(" Введите желаемое количество чисел Фиббоначи: ");
		count = scn.nextInt();
		fibbonachi(count);
		System.out.println();
	}
	 static public void fibbonachi(int count) {
		 int n1 = 0, n2 = 1, n3, i;
		 System.out.print(n1 + " " + n2);
		 for (i = 2; i<count; ++i) {
			 n3 = n1 + n2;
			 System.out.print(" " + n3);
			 n1 = n2;
			 n2 = n3;

		 }
	 }
}


