package Aula03;

public class Danielly {
    float altura;
    float peso;
    int idade;
    String cor;
    String corCabelo;
    boolean acordada;

    void caracteristicas() {
        System.out.println("Altura: " + this.altura);
        System.out.println("Peso: " + this.peso);
        System.out.println("Idade: " + this.idade);
        System.out.println("Cor: " + this.cor);
        System.out.println("Está acordada? " + this.acordada);
    }

    void dormir() {
        if (acordada == true) {
            System.out.println("Estou indo dormir!");
        }
        else{
            System.out.println("Já estou dormindo");
        }
    }

    void programar() {
        if (acordada == true) {
            System.out.println("Estou programando");
        } else {
            System.out.println("Não posso programar!");
        }

    }


}
