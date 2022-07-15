package com.HelloData;

class Homer {
    char doh(char c){
        System.out.println("doh(char)");
        return 'd';
    }
    float doh (float f) {
        System.out.println("doh(float)");
        return 1.0f;
    }
}

class Millhouse {}

class Bart extends Homer {
    void doh(Millhouse m){
        System.out.println("doh(Millhouse)");
    }
}

class Lisa {
    int dov(int i){
        System.out.println("doh(Lisa)");
        return i;
    }
    double dov(double a){
        System.out.println("doh(Lisad)");
        return a;
    }
    float dov(float d) {
        System.out.println("doh(Millhousefloat)");
        return d;
    }
}

class Boba extends Lisa {
    void dov(Millhouse m) {
        System.out.println("doh(Millhouse_dov)");
    }
}

class Hide {
    public static void main (String[] args) {
        Bart b= new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Millhouse());
        Boba bob = new Boba();
        bob.dov(new Millhouse());
        bob.dov(1);
        bob.dov(1.1);
        bob.dov(1.0f);
    }
}