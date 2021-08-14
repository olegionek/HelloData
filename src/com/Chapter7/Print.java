/**
*Class, contain abbreviated string output methods print and println.
 * It taken from book "Thinking in Java"
 *@author Brus Ekkel, Oleg Nekrasov
 * @version 1.0
*/
package com.Chapter7;

import java.io.PrintStream;

public class Print {
    public static void print(Object obj) {
        System.out.println(obj);
    }
    public static void print(String S) {
        System.out.println(S);
    }
    public static void printnb(Object obj) {
        System.out.println(obj);
    }
    public static PrintStream
    printf(String format, Object... args) {
        return System.out.printf(format, args);
    }

}
