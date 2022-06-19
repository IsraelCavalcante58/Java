import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // TRECHO ONDE A EXCEÇÃO PODE OCCORRER
            int numero1 = sc.nextInt();
            int numero2 = sc.nextInt();

            int divisao = numero1/numero2;
        } catch (ArithmeticException e){ // CAPTURA DA EXCEÇÃO
            // TRATAMENTO DA EXCEÇÃO
            System.err.println("Erro ao dividir por zero!");
        } catch (InputMismatchException e){
            System.err.println("Não é um número inteiro válido!");
        }finally{
            System.out.println("Finalizando a execução do programa");
            sc.close();
        }
    }
}
