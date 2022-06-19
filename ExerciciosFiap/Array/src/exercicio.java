import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        float[] notas = new float[10];
//        float totalNotas = 0;
//        for(int i=0; i < notas.length; i++) {
//            System.out.println("Digite a nota do aluno");
//            notas[i] = sc.nextFloat();
//            totalNotas += notas[i];
//        }
//        float mediaNotas = totalNotas/notas.length;
//        System.out.println("A média dos alunos é " + mediaNotas);

        /*
        A. Escreva um programa para preencher uma matriz unidimensional (vetor) com 15
        posições de números inteiros e, em seguida, apresente os elementos.
         */

//        int[] numeros = new int[3];
//        for(int i = 0; i < numeros.length; i++){
//            numeros[i] = sc.nextInt();
//        }
//
//        for(int num : numeros ){
//            System.out.println(num);
//        }

        /*
        В.Escreva um programa para preencher uma matriz unidimensional (vetor) que deverá receber as
        temperaturas ao longo do dia.Amedição precisa ser registradaacada uma hora. Ao final, exibaa
        temperatura média do dia.
         */

//        float totalTemperatura = 0;
//        float mediaTemperatura = 0;
//        float[] temperaturas = new float[24];
//
//        for(int i =0; i < temperaturas.length; i++){
//            temperaturas[i] = sc.nextFloat();
//            totalTemperatura += temperaturas[i];
//        }
//        mediaTemperatura = totalTemperatura / temperaturas.length;
//        System.out.println(mediaTemperatura);

        /*
        C. Altere o programa anterior para registrar as temperaturas de cada dia do mês, neste caso, utilize
    uma matriz com 30 linhase 24 colunas. Ao final, verifique qual foiamaior temperatura, a menor
    temperatura e a temperatura média.
         */

    float totalTemperatura = 0;
    float mediaTemperatura = 0;
    float maiorTemperatura = 0;
    float menorTemperatura = 999;
    float temperaturas[][] = new float[30][24];

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                temperaturas[i][j] = sc.nextFloat();
                if (temperaturas[i][j] > maiorTemperatura){
                    maiorTemperatura = temperaturas[i][j];
                }else if (temperaturas[i][j] < menorTemperatura){
                    menorTemperatura = temperaturas[i][j];
                }
                totalTemperatura += temperaturas[i][j];
            }
        }
        mediaTemperatura = totalTemperatura / 8;
        System.out.println(mediaTemperatura);
        System.out.println(menorTemperatura);
        System.out.println(maiorTemperatura);
    }
}
