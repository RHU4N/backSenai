package aula04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array {
    static void main() {

/*
        List<String> nomes = new ArrayList<>();

        nomes.add("jorge");
        nomes.add("Nicollas");
        nomes.add("Eva");

        IO.println(nomes);
        IO.println(nomes.get(0));

        for (String nome:nomes){
            IO.println(nome);
        }
        nomes.forEach(nome -> IO.println(nome));
*/

        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            numeros.add(i);
        }
        IO.println(numeros);
        numeros.forEach(num -> {if(num  % 2 == 0){
            IO.println("É par o num "+num);
        }});

        for (int num:numeros){
            if (num % 2 != 0){
                IO.println("É impar "+num);
            }
        }

    }
}
