package com.HelloData;

class WaterSource {
private String s;
        WaterSource() {
        System.out.println("WaterSource()");
        s = "��������������";
        }
public String toString() {
        return s;
        }
}
public class SprinklerSystem {
    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;
    public String toString() {
        if (valve4 == null || valve3 == null || valve2 == null)
            valve4 = "����� ����";
            valve2 = "����� ����";
            valve3 = "����� ����";
        return
                "valve1 = " + valve1 + '\n' +
                        "valve2 = " + valve2 + '\n' +
                        "valve3 = " + valve3 + '\n' +
                        "valve4 = " + valve4 + '\n' +
                        "i = " + i + " " + "f = " + f + " " +
                        "source = " + source;
    }
}
