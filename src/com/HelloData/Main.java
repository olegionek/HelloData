package com.HelloData;
import java.lang.*;
import java.util.*;

public class Main {


	public static void main(String[] args) {

		for (int i = 0; i < 3; i++){
			System.out.println("Итерация " + i + ": ");
			for (int j = 1; j <10; j++) {
				if (j==5) {
					break;
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("Цикл завершен.");
	}
}

