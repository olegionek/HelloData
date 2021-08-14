package com.Chapter7;

class Yuusha {
    private String name;
    protected void protege(String nm) {
        name = nm;
    }
        public Yuusha(String name) {
            this.name = name; }
    public Yuusha() {};

   public String toString() {
       return "Вот так!";
   }

    };



class Human extends Yuusha {
    public Human(String name) {
        System.out.println("Меня зовут " + name + ", и я защищаю человечество!");
    }

}

class Villain {
    private String name;
    protected void set(String nm) { name = nm; }
    public Villain(String name) { this.name = name; }
    public String toString() {
        return "Я объект Villain и мое имя " + name;
    }
}


public class Orc extends Villain {
    private int orcNumber;
    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }
    public void change(String name, int orcNumber) {
        set(name); // Доступно, т.к. объявляется protected
        this.orcNumber = orcNumber;
    }
    public String toString() {
        return "Orc " + orcNumber + ": " + super.toString();
    }
    public static void main(String[] args) {
        Orc orc = new Orc("Лимбургер", 27);
        System.out.println(orc);
        orc.change("Боб", 89);
        System.out.println(orc);
        Human yuu = new Human("Haruo");
        System.out.println(yuu);
    }
}