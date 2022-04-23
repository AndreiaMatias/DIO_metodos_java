package Exercicios;


public class Mes {

    public static void mes(int mesAno) {
        String mes = "";
        if (mesAno == 1) {
            mes = "janeiro";
        } else if (mesAno == 2) {
            mes = "fevereiro";
        } else if (mesAno == 3) {
            mes = "março";
        } else if (mesAno == 4) {
            mes = "abril";
        } else if (mesAno == 5) {
            mes = "maio";
        } else if (mesAno == 6) {
            mes = "junho";
        } else if (mesAno == 7) {
            mes = "julho";
        } else if (mesAno == 8) {
            mes = "agosto";
        } else if (mesAno == 9) {
            mes = "setembro";
        } else if (mesAno == 10) {
            mes = "outubro";
        } else if (mesAno == 11) {
            mes = "novembro";
        } else if (mesAno == 12) {
            mes = "dezembro";
        }
        System.out.println(mes);

        switch(mes){
            case "janeiro":
            case "julho":
            case "dezembro":
                System.out.println("Férias");
        }
    }
}


