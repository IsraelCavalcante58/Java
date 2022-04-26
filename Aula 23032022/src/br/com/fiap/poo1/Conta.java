package br.com.fiap.poo1;

public class Conta {
    private String agencia;
    private String numeroConta;
    private Cliente cliente;
    private float saldo;



    //Getter e setter

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //Getter e setter finalizados


    public float Depositar(float valor){
        saldo += valor;
        return saldo;
    }
    public boolean Sacar(float valorSaque){
        if (valorSaque < saldo){
            saldo -= valorSaque;
            return true;
        }else{
            return false;
        }

    }
        //Construtores
    public Conta(){
        this.cliente = new Cliente();
    }
    public Conta(String agencia, String numeroConta, String cpf){
        this.cliente = new Cliente(cpf);
        this.agencia = agencia;
        this.numeroConta = numeroConta;
    }
}
