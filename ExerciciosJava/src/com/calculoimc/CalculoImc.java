package com.calculoimc;

import java.util.Scanner;


public class CalculoImc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float peso = sc.nextFloat();
        float altura = sc.nextFloat();
        float resultadoImc = peso / (altura * altura);
        System.out.println(resultadoImc);
        if (resultadoImc >= 18.5 && resultadoImc <=25.0){
            System.out.println("Você está dentro do peso ideal");
        }else{
            System.out.println("Você está fora do peso normal");
        }
    }
}
