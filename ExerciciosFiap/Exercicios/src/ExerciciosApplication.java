import java.util.Scanner;

public class ExerciciosApplication {

    public static void main(String[] args) {
        int contador = 0;
        String opcao = "";
        double media = 0;


        Scanner sc = new Scanner(System.in);
        double salario = 0;

//        int soma = 0;
//
//        for (int i = 0; i < 20; i++){
//            int n1 = sc.nextInt();
//            soma += n1;
//        }
//        System.out.println(soma);


//        do {
//            contador++;
//            System.out.println("Digite um nome: ");
//            String nome = sc.next();
//            System.out.println("Digite um salário: ");
//            salario += sc.nextDouble();
//            opcao = sc.next();
//            if (opcao.equals("não")){
//                media = salario / contador;
//                System.out.println("media salarial " + media);
//            }
//
//       } while (opcao.equals("sim"));

        System.out.println("Escolha um número para fazer a tabuada");
        int escolha = sc.nextInt();
        for (int i = 1; i < 13; i++){
            System.out.println(escolha*i);
        }
    }

}
