package trabalhandocomcalculos;

import java.util.Scanner;

public class Media_alunos {
    public static void main(String[] args) {

        double nota1, nota2, nota3, nota4;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeira nota: ");
        nota1 = entrada.nextInt();
        System.out.println("Digite o segunda nota: ");
        nota2 = entrada.nextInt();
        System.out.println("Digite o terceira nota: ");
        nota3 = entrada.nextInt();
        System.out.println("Digite o quatro nota: ");
        nota4 = entrada.nextInt();

        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;

        System.out.println("A média das notas é: " + media);
    }
}
