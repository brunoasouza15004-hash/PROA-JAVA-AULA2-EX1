package trabalhandocomcalculos;

import java.util.Scanner;

public class Exemplo_calculo1 {
    public static void main(String[] args) {

        int numero1;
        int numero2;

        int numero3 = 10;
        int numero4 = 20;
        int sub = numero3 - numero4;

        int numero5 = 10;
        int numero6 = 20;
        int multi = numero5 * numero6;

        int numero7 = 40;
        int numero8 = 20;
        int div = numero7 / numero8;


        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        numero1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = entrada.nextInt();

        int soma = numero1 + numero2;

        System.out.println("Soma dos valores: " + soma);
        System.out.println("Subtração dos valores: " + sub);
        System.out.println("Multiplicação dos valores: " + multi);
        System.out.println("Divisão dos valores: " + div);
    }
}
