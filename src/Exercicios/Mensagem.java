package Exercicios;

public class Mensagem {

    public static void saudacao(int horario){
        if(horario >= 1 && horario< 12)
        {
            System.out.println("Bom dia");
        }
        else if (horario >= 12 && horario < 18)
        {
            System.out.println("Boa tarde");
        }
        else
        {
            System.out.println("Boa noite");
        }
    }
}
