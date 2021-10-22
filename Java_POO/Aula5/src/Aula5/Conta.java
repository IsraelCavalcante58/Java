package Aula5;
import java.util.Random;

public class Conta {
    public int numConta;
    protected String tipo = "";
    private String dono;
    private float saldo;
    private boolean status = false;


    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int conta) {
        this.numConta = conta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo, String nome) {
        this.dono = nome;
        Random gerador = new Random();
        this.numConta = gerador.nextInt();
        this.tipo = tipo;
        if (this.tipo.equals("cc")) {
            this.setSaldo(100.00f);
        } else if (this.tipo.equals("cp")) {
            this.setSaldo(150.00f);
        }
        this.status = true;


    }

    public void fecharConta() {
        if (this.saldo == 0) {
            this.status = false;
            System.out.println("Conta encerrada com sucesso!");
        } else {
            System.out.println("A conta não pode ser encerrada pois há saldo!");
        }
    }

    public void sacar(float valor) {
        if (this.status) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("O valor sacado foi de: R$" + valor + " e o novo saldo é de R$" + this.saldo);
            } else {
                System.out.println("Você não tem saldo disponível");
            }
        } else {
            System.out.println("Sua conta está inativa");
        }
    }

    private void descontarValorMensal(float mensalidade) {
        if (this.saldo >= mensalidade) {
            this.saldo -= mensalidade;
            System.out.println("A mensalidade de R$" + mensalidade + " foi descontada e seu saldo é de" + this.saldo);
        } else {
            System.out.println("Saldo insuficiente pra pagar a mensalidade, sua conta será encerrada em breve!");
        }
    }


    public void pagarMensal() {
        if (this.status) {
            if (this.tipo.equals("cc")) {
                descontarValorMensal(12.00f);
            } else {
                descontarValorMensal(20.00f);
            }
        } else {
            System.out.println("Sua conta está inativa");
        }
    }
    public void informacaoConta(){
        System.out.println("Informações da conta:\n" +
                "Dono:" + this.dono +"\n" +
                "Tipo: " + (this.tipo.equals("cc") ? "Conta corrente" : "Conta poupança") + "\n" +
                "Número da Conta: " + numConta + "\n" +
                "Status: " + this.status + "\n" +
                "Saldo: R$" + this.saldo);
    }

}
