import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        int numero;
        Scanner sc = new Scanner(System.in);
        int numeroDeHorasTrabalhadas;
        double valorPorHora;
        double salario;

        System.out.print("Digite seu número: ");
        numero = sc.nextInt();
        System.out.print("Digite seu número de horas trabalhadas: ");
        numeroDeHorasTrabalhadas = sc.nextInt();
        System.out.print("Digite o valor que recebe por hora: ");
        valorPorHora = sc.nextDouble();

        salario = valorPorHora*numeroDeHorasTrabalhadas;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();
    }
}