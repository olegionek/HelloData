package com.HelloData;




import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.*;
import java.util.*;
public class Main {


	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		int count;
		Scanner scn = new Scanner(System.in);
		System.out.print(" Enter count of Fibbonachi numbers what you want: ");
		count = scn.nextInt();
		fibbonachi(count);
		System.out.println();


	}
	 static public void fibbonachi(int count) {
		 int n1 = 0, n2 = 1, n3, i; // Инициализация первых двух цифр последовательности
		 System.out.println(n1 + " " + n2);
		 for (i = 2; i<count; i++) {
			 n3 = n1 + n2;
			 System.out.println(" " + n3);
			 n1 = n2;
			 n2 = n3;
		 }
	 }
}


