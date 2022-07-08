package com.HelloData;

public class Runner {

    public static void main (String[] args) {
        CADSystem cad = new CADSystem(47);
        try {
            //Код и обработка исключений
        }
        finally {
            cad.dispose();
        }
    }

}
