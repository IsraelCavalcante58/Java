package com.operadores;

public class OperadoresIncrementoDecremento {
    public static void main(String[] args) {
        int x = 10;
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);

        int y = 10;
        ++y;
        System.out.println(y);
        --y;
        System.out.println(y);
        System.out.println("DIVISÃO");
        int z = 10, w = 5, a = 5;
        z = w++;
        System.out.println(z);
        System.out.println(w);
        z = --a;
        System.out.println(z);
        System.out.println(a);
    }
}
