package exemplo06;

import java.util.Scanner;

public class Exemplo06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;
        String nome;
        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();
        System.out.println("Digite um número inteiro: ");
        numero = ler.nextInt();
        System.out.println("Você digitou: " +numero);
        System.out.println("Você digitou: " +nome);

        ler.close();
    }
}
