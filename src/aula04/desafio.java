package aula04;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class desafio {
    static void main() {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
/*

        IO.println("Digite um numero");
        int num = sc.nextInt();
        List<Number> numeros = new ArrayList<>();

        numeros.add(num);
        IO.println("Seu numero é "+numeros.get(0));
*/

        double media = 0;

        List<Double> notas = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            IO.println("Digite a nota");
            Double num = sc.nextDouble();
            notas.add(num);
        }
/*        for (int j = 0; j < notas.size(); j++) {
            media += notas.get(j);
        }*/

        for(double nota:notas){
            media+=nota;
        }

        IO.println("A soma de "+ notas.get(0)+"+"+notas.get(1)+"="+media);



    }
}
