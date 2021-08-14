package com.HelloData;

import static com.HelloData.Print.*;

public class Example {
    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;
    public String toString() {
        return
                "valve1 = " + valve1 + " " +
                        "valve2 = " + valve2 + " " +
                        "valve3 = " + valve3 + " " +
                        "valve4 = " + valve4 +"\n " +
                        "i = " + i + " " + "f = " + f + " " +
                        "source = " + source;
    }
    public static void main(String[] args) {
        Example exm = new Example();
        print(exm);
    }

}

class WaterSource {
    private String s;
    WaterSource() {
        print("WaterSource()");
        s = "сконструирован";
    }
    public String toString() { return s;}
}