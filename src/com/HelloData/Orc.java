package com.HelloData;

class Villain {
    private String name;
    protected void set(String nm){name = nm;}
    public Villain(String name) {this.name = name;}
    public String toString() {
        return "Я объект Villain и моё имя " + name;
    }
}

public class Orc extends Villain{
    private int orcNumber;
    public Orc(String name, int OrcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }
    public void change(String name, int orcNumber){
        set(name); //Доступно, т.к. объвлено protected
        this.orcNumber = orcNumber;
    }
    public String toString() {
        return "Orc" + orcNumber + ": " + super.toString();
    }
    public static void main (String[] args) {
        Orc orc = new Orc("Лимбургер", 23);
        System.out.println(orc);
        orc.change("Барбара", 19);
        System.out.println(orc);
    }
}
