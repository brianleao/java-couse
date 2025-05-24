import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int soma = 0;

        System.out.print("Digite o primeiro número inteiro: ");
        num1 = sc.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        num2 = sc.nextInt();
        soma = num1 + num2;

        System.out.println("SOMA = " + soma);
        
        sc.close();
    }
}