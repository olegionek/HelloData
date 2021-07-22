package com.HelloData;
import java.io.*;

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
