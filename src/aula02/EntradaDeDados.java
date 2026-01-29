package aula02;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.pow;

public class EntradaDeDados {
    void main() {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        IO.print("Qual seu nome:");
        String nome = sc.next();
        IO.println("Qual sua idade:");
        int idade = sc.nextInt();
        IO.println("Qual é sua altura(em metros,use ,):");
        double altura = sc.nextDouble();
        IO.println("Qual é seu peso:");
        double peso = sc.nextDouble();

        if(idade > 18){
            IO.println("Prazer, "+ capitalize(nome) + ".Você é maior de idade");
        }else {
            IO.println("Prazer, "+ capitalize(nome) + ".Você é menor de idade");
        }

        double imc = peso/pow(altura,2);

        if (imc<18.5){
            IO.println("Seu imc é "+df.format(imc)+" e vc está abaixo do peso");
        } else if (imc>18.5 && imc<25) {
            IO.println("Seu imc é "+df.format(imc)+" e vc está no peso normal");
        } else if (imc>25 && imc<30) {
            IO.println("Seu imc é "+df.format(imc)+" e vc está acima do peso");
        } else if (imc>30) {
            IO.println("Seu imc é "+df.format(imc)+" e vc está obeso");
        }
    }
    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
