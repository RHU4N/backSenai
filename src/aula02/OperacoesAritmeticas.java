package aula02;

import java.util.Scanner;

public class OperacoesAritmeticas {
    static void main() {

        double calc1 = 2*6/3;
        double calc2 = 3+ 2 * 4;
        double calc3 = (3+2)* 4;
        double calc4 = 60/(3+2)*4;
        double calc5 = 60/((3+2)*4);


        // Direto  no print
        IO.println("2 x 6 ÷ 3 = "+2*6/3);
        IO.println("3 + 2 x 4 = "+(3+(2*4)));
        IO.println("(3 + 2) x 4 = "+(3+2)*4);
        IO.println("60÷(3+2) x 4 = "+60/(3+2)*4);
        IO.println("60÷((3+2) x 4) = "+60/((3+2)*4));

        //Usando variavel
        IO.println("\n2 x 6 ÷ 3 = "+ calc1);
        IO.println("3 + 2 x 4 = "+ calc2);
        IO.println("(3 + 2) x 4 = "+ calc3);
        IO.println("60÷(3+2) x 4 = "+ calc4);
        IO.println("60÷((3+2) x 4) = "+ calc5);


    }
}
