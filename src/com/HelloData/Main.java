package com.HelloData;
import java.util.*;
import java.lang.*;
import static com.HelloData.AutoPackager.*;

public class Main {

    public static void main(String[] args) {
    	Tank t1 = new Tank();
    	Tank t2 = new Tank();
    	t1.level = 9;
    	t2.level = 47;
    	Printer.print("Привет");
	}
}

class Tank{
	int level;
}