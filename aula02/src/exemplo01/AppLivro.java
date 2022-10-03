package exemplo01;

public class AppLivro {
    public static void main(String[] args) {
        Livro meuLivro = new Livro();

        meuLivro.titulo = "Programando em JAVA";
        meuLivro.autor = "Deitel";

        System.out.println(meuLivro.titulo);
    }
}
