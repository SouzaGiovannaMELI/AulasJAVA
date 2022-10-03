package exemplo01;

public class Exemplo01 {
    public static void main(String[] args) {
        // [TIPO] NOME;
        int numeroInteiro = 67;
        System.out.println(numeroInteiro);

        numeroInteiro = 12;

        System.out.println("Hello World!");
        System.out.println(numeroInteiro);

        double numeroDouble = 4.5;
        System.out.println(numeroDouble);
        numeroDouble = numeroInteiro;
        System.out.println(numeroDouble);

        numeroInteiro = (int) numeroDouble; // casting = conversão de tipos de forma forçada
        System.out.println(numeroInteiro);

        numeroDouble = (3 + 5) * 2;
        System.out.println(numeroDouble);
    }
}