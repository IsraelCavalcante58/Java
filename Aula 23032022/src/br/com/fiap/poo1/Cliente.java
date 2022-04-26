package br.com.fiap.poo1;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;



    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cliente(String cpf){
        this.cpf = cpf;
    }
    public Cliente(){

    }
    public Cliente(String nome, String telefone, String cpf){
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }
}
