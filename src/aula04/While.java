package aula04;

import java.util.Scanner;

public class While {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int i = 1;
        //mostrar pares
        while (i<=10){
            if(i % 2 ==0){
                IO.println("esse num "+i+" é  par");
            }
            i++;
        }

        IO.println("");

        int j = 1;
        //mostrar impares
        while (j<=10){
            if(j % 2 !=0){
                IO.println("esse num "+j+" é  impar");
            }
            j++;
        }

        IO.println("");
        int k = 0;
        IO.println("Até que numero vc quer ir:");
        int z = sc.nextInt();
        while (k <= z){
            if(k % 2 == 0){
                IO.println("esse num "+k+" é  par");
            }
            k++;
        }

    }
}
