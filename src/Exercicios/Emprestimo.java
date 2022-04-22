package Exercicios;
import java.util.Scanner;

public class Emprestimo {

    public static void informaValores(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor inicial do empréstimo: ");
        double valorInicial = scan.nextDouble();
        System.out.println("Informe a taxa de juros: ");
        double taxaJuros = scan.nextDouble();
        System.out.println("Informe o prazo em meses: ");
        double prazoMeses = scan.nextDouble();

        valorFinal(valorInicial, taxaJuros, prazoMeses);
    }
    public static void valorFinal(double valorInicial, double taxaJuros, double prazoMeses){

        double montante = valorInicial * Math.pow((1 + (taxaJuros/100)),prazoMeses);

        System.out.println("O valor final é: " + montante);
    }
}
