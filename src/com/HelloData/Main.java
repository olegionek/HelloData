package com.HelloData;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello World");
	ATypeName dt = new ATypeName();
	DataOnly dat = new DataOnly();
	dat.i = 4;
	dat.d = 3.45;
	dat.b = false;
	System.out.println((dt.a) + " " + (dat.i) + " "+ (dat.d) + " " + (dat.b));
	System.out.println(dat.i);
	System.out.println(dat.d);
	System.out.println(dat.b);


    }
}

class ATypeName {
    double a = 2.34;
}
class DataOnly {
    int i;
    double d;
    boolean b;
}