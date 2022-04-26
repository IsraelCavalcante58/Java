package com.operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int idade = 20;
        boolean precisaVotar = idade >= 18 && idade < 70;
        System.out.println(precisaVotar);
    }
}
