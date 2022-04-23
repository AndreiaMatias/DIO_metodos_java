package Exercicios;
import java.time.LocalDateTime;
import java.util.Scanner;

import static Exercicios.Calculo.retorno;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int horario = LocalDateTime.now().getHour();
        Mensagem.saudacao(horario);
        System.out.println("Informe o aplicativo a utilizar:");
        System.out.println("1 - Calculadora");
        System.out.println("2 - Valor total empréstimo");
        System.out.println("3 - Cálculo da área");
        System.out.println("4 - Sair");
        int opcao = scan.nextInt();

        switch (opcao){
            case 1:
                retorno();
                break;
            case 2:
                Emprestimo.informaValores();
                break;
            case 3:
                CalculoArea.opcoes();
                break;
            case 4:
                System.out.println("Encerrando...");
                break;
        }


    }
}