package exemplo02;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio meuRelogio = new Relogio(9, 40, 0);
        Relogio outroRelogio = new Relogio(12, 72, 0);

        meuRelogio.exibir();
        outroRelogio.exibir();

        System.out.println("Minuto: " +meuRelogio.getMinuto());
        System.out.println("Minuto: " +outroRelogio.getMinuto());

        System.out.println("Hora Atual: " +Relogio.horaAtual());

        Relogio relogio1 = new Relogio(1, 1, 1);
        Relogio relogio2 = new Relogio(1, 1, 1);

        Relogio.setMarca("Samsung");

        relogio1.exibir();
        relogio2.exibir();

        System.out.println(relogio1.show());
        System.out.println(relogio2.show());
   }
}
