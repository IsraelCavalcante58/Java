package br.com.fiap.banco;

import br.com.fiap.banco.Conta;

public class ContaBancariaApplication {
    public static void main(String[] args) {

        Conta cc = new Conta();
        cc.setAgencia(1202);
        cc.setNumero(121232);
        cc.depositar(1500);
        System.out.println(cc.getAgencia());
        System.out.println(cc.getSaldo());
        System.out.println(cc.getNumero());

        Conta poupanca = new Conta(111, 222, 1000);
        poupanca.retirar(50);
    }
}
