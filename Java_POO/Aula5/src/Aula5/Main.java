package Aula5;

public class Main {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.abrirConta("cc","Joãozinho");
        conta1.pagarMensal();
        conta1.sacar(30);
        conta1.informacaoConta();
        conta1.sacar(58);
        conta1.fecharConta();
    }

}
