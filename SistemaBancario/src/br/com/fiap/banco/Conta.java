package br.com.fiap.banco;
/**
 * Classe que abstrai uma Conta Bancaria
 * @author Israel Cavalcante
 * @version 1.0<h3> </h3>*/
public class Conta {
    /**
     * Agencia da Conta
     */
    private int agencia;
    /**
     * Numero da Conta
     */
    private int numero;
    /**
     * Saldo da Conta
     */
    private double saldo;


    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    /**
     * Construtor com todos os parametros necessarios
     * @param agencia
     * @param numero
     * @param saldo
     */
    public Conta(int agencia, int numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    /**
     * Construtor padrao, nao precisa de nenhum parametro.
     */
    public Conta() {

    }

    /**
     * Acrescenta valor a conta
     * @param valor valor que sera depositado
     * @return retorna o saldo total da conta após o deposito
     */

    public double depositar(double valor){
        this.saldo += valor;
        return saldo;
    }

    /**
     * Retira o valor da conta
     * @param valor valor que sera retirado
     */
    public void retirar(double valor){
        this.saldo -= valor;
    }
}


