package com.Chapter7;
import static com.Chapter7.Print.*;

class Father {
    String bob(String b) {
        print("bob()");
        return b;
    }
    int dash(int i) {
        print("int()");
        return i;
    }

}

class Bob extends Father {
    void govno() {
        print("govno()");
    }
}

public class Hide {
    public static void main(String[] args) {
        
    }
}
