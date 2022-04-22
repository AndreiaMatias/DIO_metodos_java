package Exercicios;


import java.util.Scanner;

public class Calculo {

    public static void soma(double a, double b){
        double resultado = a + b;
        System.out.println(a + "+" + b + " = " + resultado);
    }
    public static void subtracao(double a, double b){
        double resultado = a - b;
        System.out.println(a + "-" + b + " = " + resultado);
    }
    public static void divisao(double a, double b){
        double resultado = a / b;
        System.out.println(a + "/" + b + " = " + resultado);
    }
    public static void multiplicacao(double a, double b){
        double resultado = a * b;
        System.out.println(a + "*" + b + " = " + resultado);
    }

    public static void retorno(){
        Scanner scan = new Scanner(System.in);
        Double a, b;

        System.out.println("Informe o primeiro número: ");
        a = scan.nextDouble();
        System.out.println("Informe o segundo número: ");
        b = scan.nextDouble();

        Calculo.soma(a, b);
        Calculo.subtracao(a,b);
        Calculo.multiplicacao(a,b);
        Calculo.divisao(a,b);
    }

}
