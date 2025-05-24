import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main (String[] args) {

        double pi = 3.14159;
        double raio;
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do raio: ");
        raio = sc.nextDouble();
        raio = Math.pow(raio, 2);
        double A = pi*raio;

        System.out.printf("A = %.4f%n", A);

        
    }
}