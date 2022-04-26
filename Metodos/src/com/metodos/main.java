package com.metodos;

public class main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setSaldo(1500);
        conta.depositar(1300);
        System.out.println(conta.recuperarSaldo());
    }
}
