package com.operadores;
import java.util.Scanner;

public class SaidaDeDados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade = 0;
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite a idade: ");
        idade = sc.nextInt();
        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade + " anos");
        sc.close();
    }
}
