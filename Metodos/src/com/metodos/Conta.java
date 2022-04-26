package com.metodos;

public class Conta {
    private int agencia;
    private  String numeroConta;
    private double saldo;

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double recuperarSaldo(){
        return saldo;
    }
    public void depositar(double valor){
        saldo += valor;
    }

}
