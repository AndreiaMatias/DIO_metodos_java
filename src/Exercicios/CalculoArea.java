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
                double quadrado = calculoArea(lado);
                System.out.println("Área do quadrado: " + quadrado);
                break;
            case 2:
                System.out.println("informe o lado do retângulo: ");
                double ladoR = scan.nextDouble();
                System.out.println("informe a altura do retângulo: ");
                double alturaR = scan.nextDouble();
                double retangulo = calculoArea(ladoR, alturaR);
                System.out.println("Área do retângulo: " + retangulo);
                break;
            case 3:
                System.out.println("informe o lado superior do trapézio: ");
                double ladoS = scan.nextDouble();
                System.out.println("informe o lado inferior do trapézio: ");
                double ladoI = scan.nextDouble();
                System.out.println("informe a altura do trapézio: ");
                double alturaT = scan.nextDouble();
                double trapezio = calculoArea(ladoS, ladoI, alturaT);
                System.out.println("Área do trapézio: " + trapezio);
                break;
            case 4:
                System.out.println("Encerrando...");


        }
    }



    public static double calculoArea(double lado){
        double area = Math.pow(lado,2);
        return area;
    }

    public static double calculoArea(double lado, double altura){
        double area = lado * altura;
        return area;
    }

    public static double calculoArea(double ladoA, double ladoB, double altura){
        double area = 0.5* altura * (ladoA + ladoB);
        return area;
    }

}
