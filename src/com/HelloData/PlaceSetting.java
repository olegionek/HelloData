package com.HelloData;

class Plate {
    Plate(int i) {
        System.out.println(" ����������� Plate");
    }
}

class DinnerPlate extends Plate {
    DinnerPlate(int i) {
        super(i);
        System.out.println(" ����������� DinnerPlate");
    }
}

class Utensil {
    Utensil (int i) {
        System.out.println(" ����������� Utensil");
    }
}

class Spoon extends Utensil {
    Spoon (int i){
        super(i);
        System.out.println(" ����������� Spoon");
    }
}

class Fork extends Utensil {
    Fork(int i) {
        super(i);
        System.out.println(" ����������� Fork");
    }
}

class Knife extends Utensil {
    Knife(int i) {
        super(i);
        System.out.println(" ����������� Knife");
    }
}

class Custom {
    Custom (int i) {
        System.out.println(" ����������� Custom");
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
