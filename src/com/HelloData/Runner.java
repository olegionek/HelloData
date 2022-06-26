package com.HelloData;

public class Runner {
    private String name;
    private Cleanser cleanser = new Cleanser();
    public Runner(String name) {
        this.name = name;
    }
    public static void main (String[] args) {
        Runner rnr = new Runner("Boba");
        rnr.scrub();
        rnr.dilute();
    }
    public void scrub() {
        cleanser.scrub();
    }
    public void dilute() {
        cleanser.dilute();
    }
}
