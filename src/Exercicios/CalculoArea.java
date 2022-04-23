package Exercicios;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CalculoArea {

    public static void opcoes(){
        int opcao;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a opção:");
        System.out.println("1 - Cálculo da área do quadrado;");
        System.out.println("2 - Cálculo da área do retângulo;");
        System.out.println("3 - Cálculo da área do trapézio");
        System.out.println("4 - Sair");
        opcao = scan.nextInt();

        switch(opcao){
            case 1:
                System.out.println("informe o lado do quadrado: ");
                double lado = scan.nextDouble();
                calculoArea(lado);
                break;
            case 2:
                System.out.println("informe o lado do retângulo: ");
                double ladoR = scan.nextDouble();
                System.out.println("informe a altura do retângulo: ");
                double alturaR = scan.nextDouble();
                calculoArea(ladoR, alturaR);
                break;
            case 3:
                System.out.println("informe o lado superior do trapézio: ");
                double ladoS = scan.nextDouble();
                System.out.println("informe o lado inferior do trapézio: ");
                double ladoI = scan.nextDouble();
                System.out.println("informe a altura do trapézio: ");
                double alturaT = scan.nextDouble();
                calculoArea(ladoS, ladoI, alturaT);
                break;
            case 4:
                System.out.println("Encerrando...");


        }
    }



    public static void calculoArea(double lado){
        double area = Math.pow(lado,2);
        System.out.println("A área do quadrado é " + area);
    }

    public static void calculoArea(double lado, double altura){
        double area = lado * altura;
        System.out.println("A área do retângulo é " + area);
    }

    public static void calculoArea(double ladoA, double ladoB, double altura){
        double area = 0.5* altura * (ladoA + ladoB);
        System.out.println("A área do trapézio é " + area);
    }

}
