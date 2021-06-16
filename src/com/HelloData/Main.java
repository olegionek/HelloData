package com.HelloData;
import java.lang.*;
import java.util.*;

public class Main {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float expFloat = 1.39e-43f;
		expFloat = 1.39E-43f;
		System.out.println(expFloat);
		double expDouble = 47e47d;
		double expDouble2 = 47e47;
		long n2 = 200;
		System.out.println("Введите число или слово: ");
		String input = scanner.nextLine();
		String c = input;
		System.out.println(expDouble);
		System.out.println(c);
		System.out.println(n2*expDouble);
	}
}

