import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[] args) {
        
        int A, B, C, D;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor A: ");
        A = sc.nextInt();
        System.out.print("Digite o valor B: ");
        B = sc.nextInt();
        System.out.print("Digite o valor C: ");
        C = sc.nextInt();
        System.out.print("Digite o valor D: ");
        D = sc.nextInt();

        int DIFERENCA = (A*B - C*D);

        System.out.println("DIFERENCA = " + DIFERENCA);

        sc.close();
    }
}