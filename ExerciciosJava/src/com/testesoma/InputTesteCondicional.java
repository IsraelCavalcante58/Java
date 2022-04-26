package com.testesoma;

import java.util.Scanner;

public class InputTesteCondicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int resultado = numero1 + numero2;

        if (resultado % 2 == 0){
            System.out.println("O numero é par");
        }else{
            System.out.println("O número é ímpar");
        }
        sc.close();
    }
}
