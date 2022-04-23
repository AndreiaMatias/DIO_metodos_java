package Exercicios;

import java.util.Scanner;

public class DiaSemana {

    public static void diaSemana(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o dia da semana: ");
        String dia = scan.nextLine();

        switch(dia){
            case "domingo":
                System.out.println(1);
                break;
            case "segunda":
                System.out.println(2);
                break;
            case "terça":
                System.out.println(3);
                break;
            case "quarta":
                System.out.println(4);
                break;
            case "quinta":
                System.out.println(5);
                break;
            case "sexta":
                System.out.println(6);
                break;
            case "sábado":
                System.out.println(7);
                break;
        }
    }
}
