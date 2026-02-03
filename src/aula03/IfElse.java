package aula03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IfElse {
    static void main() {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

//        int idade = 18;
//        if (idade < 18){
//            IO.println("Foi barrado na porta");
//        }else {
//            IO.println("Liberado");
//        }

        //for para pegar os dados
        double nota = 0;
        for (int i = 1; i <= 3; i++) {
            IO.println("Escreva a " + i + "° nota");
            nota += sc.nextDouble();
        }

        //calculo media
        double media = nota / 3;
        //if para saber a media
        if (media < 4) {
            IO.println("Sua nota é " + df.format(media) + " e vc está reprovado");
        } else if (media <= 6) {
            IO.println("Sua nota é " + df.format(media) + " e vc está de recuperação");
        } else if (media > 6) {
            IO.println("Sua nota é " + df.format(media) + " e vc está aprovado");
        }

    }
}
