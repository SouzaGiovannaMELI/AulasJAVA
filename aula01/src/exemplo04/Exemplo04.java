package exemplo04;

public class Exemplo04 {
    public static void main(String[] args) {
        int valor[] = new int[9];

        for(int i = 0; i < valor.length; i++){
            valor[i] = i;
        }

        for (int i = valor.length - 1; i >= 0; i--) {
            System.out.print(valor[i] + " ");
        }
    }
}
