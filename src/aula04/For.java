package aula04;

import java.util.Scanner;

public class For {
    static void main() {

        Scanner sc = new Scanner(System.in);

        //1° Inicia a variavel
        //2° condição
        // 3° alteração da variavel
        for (int i = 0; i < 5; i++) {
            IO.println("O valor de i é:"+i);
        }
        //mostrar todos os numeros pares de 1 a 10
        for (int i = 1; i <= 10; i ++) {
            if (i % 2 == 0) {
                IO.println("O número " + i + " é par");
            }
        }
        //mostrar impares de 1 a 10
        for (int i = 1; i <= 10; i ++) {
            if (i % 2 != 0) {
                IO.println("O número " + i + " é impar");
            }
        }

        //mostrar impar ou par de um numeros escolhido
//        while (true) {
//            IO.println("Vc deseja encontrar os numeros pares(P) ou impares(i) no seu intervalo:");
//            char op = sc.next().toLowerCase().charAt(0);
//            if (op == 'i') {
//                IO.println("Digite até que numero vc deseja ir para ver os impares");
//                int num = sc.nextInt();
//                for (int i = 0; i <= num; i++) {
//                    if (i % 2 != 0) {
//                        IO.println("O número " + i + " é impar");
//                    }
//                }
//                break;
//            } else if (op == 'p') {
//                IO.println("Digite até que numero vc deseja ir para ver os pares");
//                int num = sc.nextInt();
//                for (int i = 0; i <= num; i++) {
//                    if (i % 2 == 0) {
//                        IO.println("O número " + i + " é par");
//                    }
//                }
//                break;
//            } else {
//                IO.println("Digite i para impar ou p para par");
//            }
//
//
//        }
    }
}

