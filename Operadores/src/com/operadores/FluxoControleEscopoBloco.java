package com.operadores;

public class FluxoControleEscopoBloco {
    public static void main(String[] args) {
        int idade = -2;

        if (idade < 0){
            System.out.println("Idade Inválida");
        }

        if (idade >= 18 && idade < 70){
            System.out.println("Maior idade");

        }else if (idade >= 70){
            System.out.println("Terceira Idade");
            if (idade >= 100){
                System.out.println("Centenária");
            }
        }else if (idade > 0 ){
            System.out.println("Menor de idade");
        }

    }
}
