package com.HelloData;

class Plate {
    Plate(int i) {
        System.out.println(" Конструктор Plate");
    }
}

class DinnerPlate extends Plate {
    DinnerPlate(int i) {
        super(i);
        System.out.println(" Конструктор DinnerPlate");
    }
}

class Utensil {
    Utensil (int i) {
        System.out.println(" Конструктор Utensil");
    }
}

class Spoon extends Utensil {
    Spoon (int i){
        super(i);
        System.out.println(" Конструктор Spoon");
    }
}

class Fork extends Utensil {
    Fork(int i) {
        super(i);
        System.out.println(" Конструктор Fork");
    }
}

class Knife extends Utensil {
    Knife(int i) {
        super(i);
        System.out.println(" Конструктор Knife");
    }
}

class Custom {
    Custom (int i) {
        System.out.println(" Конструктор Custom");
    }
}

public class PlaceSetting extends Custom {
    private Spoon spn;
    private Fork frk;
    private Knife knf;
    private DinnerPlate dpl;

    PlaceSetting(int i) {
        super(i);
    }
}
