package com.HelloData;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello World");
	ATypeName dt = new ATypeName();
	DataOnly dat = new DataOnly();
	dat.i = 4;
	dat.d = 3.45;
	dat.b = false;
	System.out.println((dt.a) + " " + (dat.i) + " "+ (dat.d) + " " + (dat.b));
	System.out.println(dat.storage());
	Incrementable.increment();
	//exercise N8 Thinking on Java p.93
		ClassObject d = new ClassObject();
	System.out.println(ClassObject.d);
	System.out.println(ClassObject.d);
	System.out.println(d.df);
	//Exercise N9 Thinking on Java
	AutoPackager a = new AutoPackager();
	System.out.println(a.ch);
	System.out.println(Arrays.toString(args));

    }
}

class ATypeName {
    double a = 2.34;
}
class DataOnly {
    int i=6;
    double d;
    boolean b;
    int storage(){
    	return "baba".length();
	}
}

class Incrementable{
	static void increment (){
		DataOnly StaticTest = new DataOnly();
		System.out.println(StaticTest.i++);
	}
}