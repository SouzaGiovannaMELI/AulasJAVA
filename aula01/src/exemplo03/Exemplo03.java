package exemplo03;

public class Exemplo03 {
    public static void main(String[] args) {
        int contador = 1;

        while(contador < 10){
            System.out.print(contador + " ");
            contador++;
        }

        System.out.println();

        for(contador = 1; contador < 10; contador++){
            System.out.print(contador + " ");
        }

        for(; contador < 20; contador++){
            System.out.print(contador + "");
        }

        for(int a = 1, b = 2; a > 0 && b > 0; a--, b++){
            System.out.print(contador + "");
        }
    }
}
