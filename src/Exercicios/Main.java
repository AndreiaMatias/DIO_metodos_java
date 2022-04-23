package Exercicios;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
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
        System.out.println("4 - Mês");
        System.out.println("5 - Dia da semana");
        System.out.println("6 - Sair");

        int opcao = scan.nextInt();

        java.util.Date dataMes = new Date();
        LocalDate dataLocal = dataMes.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int mesAno = dataLocal.getMonthValue();

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
                Mes.mes(mesAno);
                break;
            case 5:
                DiaSemana.diaSemana();
                break;
            case 6:
                System.out.println("Encerrando...");
                break;


        }


    }
}