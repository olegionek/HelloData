package com.HelloData;

public class Cleanser {
    private String s = "Cleanser\n";
    public void append(String a) { s+=a;}
    public void dilute() {append("dilute()\n");}
    public void apply() {append("apply()\n");}
    public void scrub() {append("scrub()\n");}
    public String toString() {return s;}
    public static void nemain (String[] args) {
        Cleanser x = new Cleanser();
        x.dilute(); x.apply();x.scrub();
        System.out.println(x);
    }
}

class Detergent extends Cleanser {
    public void scrub() {
        append("Runner()\n");
        super.scrub();  //Вызываем метод базового класса.
    }
    //Добавляем новые методы к интерфейсу
    public void foam() {
        append("\nfoam()");
    }
    public static void nemain(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        Cleanser.nemain(args);
    }
}

class NewClass extends Detergent {
    public void scrub (){
        super.scrub();
        append("new Scrub() from NewClass\n");
    }

    public void sterilize(){append("Sterilize()\n");}
    public static void nemain(String[] args){
        NewClass c = new NewClass();
        c.foam();
        c.apply();
        c.scrub();
        c.dilute();
        c.sterilize();
        System.out.println(c);
        System.out.println("Проверяем базовый класс\n");
        Detergent.nemain(args);

    }


}
