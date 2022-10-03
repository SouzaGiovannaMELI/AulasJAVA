package exemplo05;

public class Exemplo05 {
    public static void main(String[] args) {
        try{
            System.out.println("Resposta = " +dividir(11,9));
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }

    public static int dividir(int n1, int n2) throws ArithmeticException {
        if(n2 == 0){
            throw new ArithmeticException("Não é possível dividir por zero");
        }
        return n1 / n2;
    }
}
